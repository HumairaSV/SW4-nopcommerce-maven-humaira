package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    HomePage homePage = new HomePage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    NokiaLumiaPage nokiaLumiaPage = new NokiaLumiaPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutAsGuest checkOutAsGuest = new CheckOutAsGuest();
    RegisterPage registerPage = new RegisterPage();
    BillingCheckOutPage billingCheckOutPage = new BillingCheckOutPage();
    ShippingMethodCheckoutPage shippingMethodCheckoutPage = new ShippingMethodCheckoutPage();
    PaymentMethodCheckOut paymentMethodCheckOut = new PaymentMethodCheckOut();
    PaymentCheckOut paymentCheckOut = new PaymentCheckOut();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    CompletedCheckoutPage completedCheckoutPage = new CompletedCheckoutPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
        homePage.mouseHoverOnElectronics();
        homePage.mouseHoverOnCellPhonesAndClick();
        Assert.assertEquals(cellPhonesPage.verifyCellPhonesText(), "Cell phones", "Text is not displayed");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException{

        homePage.mouseHoverOnElectronics();
        homePage.mouseHoverOnCellPhonesAndClick();
        Assert.assertEquals(cellPhonesPage.verifyCellPhonesText(), "Cell phones", "Text is not displayed");
        cellPhonesPage.clickOnListView();
        Thread.sleep(1000);
        cellPhonesPage.clickOnNokiaLumia();
        Assert.assertEquals(nokiaLumiaPage.verifyNokiaLumiaText(), "Nokia Lumia 1020", "Text not displayed");
        Assert.assertEquals(nokiaLumiaPage.verifyNokiaPrice(), "$349.00", "Price not displayed");
        nokiaLumiaPage.changeNokiaQuantity();
        nokiaLumiaPage.nokiaAddToCartButton();
        Assert.assertEquals(nokiaLumiaPage.productAddedToTheCartMessage(), "The product has been added to your shopping cart", "Product not added to Cart");
        nokiaLumiaPage.clickOnCrossButton();
        nokiaLumiaPage.clickOnShoppingCartLink();
        Assert.assertEquals(shoppingCartPage.verifyShoppingCartText(), "Shopping cart", "Text is not displayed");
        Assert.assertEquals(shoppingCartPage.verifyProductQuantity(), "2", "Quantity is not matching" );
        Assert.assertEquals(shoppingCartPage.verifyTotalPrice(), "$698.00", "Price is not matching" );
        shoppingCartPage.clickOnTermsOfService();
        shoppingCartPage.clickOnCheckOutButton();
        checkOutAsGuest.verifyWelcomeText();
        checkOutAsGuest.clickOnRegisterTab();
        Assert.assertEquals(registerPage.verifyRegisterText(), "Register", "Register text is not displayed");
        registerPage.enterFirstName("TestVh");
        registerPage.enterLastName("Cocomelon");
        registerPage.enterEmail("cocomelon1@gmail.com");
        registerPage.enterPassword("Password123");
        registerPage.enterConfirmPassword("Password123");
        registerPage.clickOnRegisterButton();
        Assert.assertEquals(registerPage.verifyRegistrationText(), "Your registration completed", "Text not displayed");
        registerPage.clickOnContinueButton();
        Assert.assertEquals(shoppingCartPage.verifyShoppingCartText(),"Shopping cart", "Text not displayed");
        shoppingCartPage.clickOnTermsOfService();
        shoppingCartPage.clickOnCheckOutButton();
        billingCheckOutPage.selectCountryFromDropDown("1");
        billingCheckOutPage.selectStateFromDropDown("49");
        billingCheckOutPage.enterBillingCity("Manhattan");
        billingCheckOutPage.enterBillingAddress("Upper Brook Street");
        billingCheckOutPage.enterBillingZipcode("380019");
        billingCheckOutPage.enterBillingPhoneNumber("7874541211");
        billingCheckOutPage.clickOnContinueButton();
        shippingMethodCheckoutPage.clickOnRadioButtonSecondDayAir();
        shippingMethodCheckoutPage.clickOnContinue();
        paymentMethodCheckOut.clickOnCreditCard();
        paymentMethodCheckOut.clickOnContinue();
        paymentCheckOut.selectCardTypeFromDropDown("visa");
        paymentCheckOut.enterCardHolderName("TestVh Cocomelon");
        paymentCheckOut.enterCardNumber("4222222222222");
        paymentCheckOut.selectExpiryMonthFromDropDown("9");
        paymentCheckOut.selectExpiryYearFromDropDown("2023");
        paymentCheckOut.enterCardCode("082");
        paymentCheckOut.clickOnContinueButton();
        Assert.assertEquals(confirmOrderPage.verifyCreditCardPaymentMethod(), "Credit Card");
        Assert.assertEquals(confirmOrderPage.verifySecondDayAir(), "2nd Day Air", "Text is not matched");
        Assert.assertEquals(confirmOrderPage.verifyNokiaTotalPrice(), "$698.00", "Price is not matched");
        confirmOrderPage.clickOnConFirm();
        Assert.assertEquals(completedCheckoutPage.verifyThankYouText(),"Thank you","Text is not displayed");
        Assert.assertEquals(completedCheckoutPage.verifySucessOrderText(),"Your order has been successfully processed!","Text isnot Display");
        completedCheckoutPage.clickOnContinue();
        Assert.assertEquals(homePage.verifyWelComeText(),"Welcome to our store","Text is not displayed");
        homePage.clickOnLogoutButton();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(baseUrl,currentUrl,"Invalid URL");
    }
}
