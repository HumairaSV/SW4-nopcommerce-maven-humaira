package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Map;

public class ComputerTest  extends BaseTest {

    HomePage homePage = new HomePage();
    DeskTopPage deskTopPage = new DeskTopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutAsGuest checkOutAsGuestPage = new CheckOutAsGuest();
    BillingCheckOutPage checkOutPage = new BillingCheckOutPage();
    ShippingMethodCheckoutPage checkoutPage1 = new ShippingMethodCheckoutPage();
    PaymentMethodCheckOut checkOutPage2 = new PaymentMethodCheckOut();
    PaymentCheckOut checkOutPage3 = new PaymentCheckOut();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    CompletedCheckoutPage completedCheckoutPage = new CompletedCheckoutPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
        homePage.selectMenu("computers");
        homePage.clickOnDeskTop();
        deskTopPage.selectSortByName("Name: Z to A");
        Map<String, ArrayList> mapArrays = deskTopPage.arrangeProductInDescendingOrder();
        Assert.assertEquals(mapArrays.get("originalProductsName"), mapArrays.get("afterSortByZToAProductsName"));
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.selectMenu("computers");
        homePage.clickOnDeskTop();
        deskTopPage.selectSortByName("Name: A to Z");
        deskTopPage.clickOnAddToCart();
        Assert.assertEquals(buildYourOwnComputerPage.verifytheTextBuildyourowncomputer(),"Build your own computer" , "Text is not Display");
        buildYourOwnComputerPage.selectProcessor("1");
        buildYourOwnComputerPage.selectRam("5");
        buildYourOwnComputerPage.selectHDDRadio();
        buildYourOwnComputerPage.selectOSRadiVistaPremium();
        buildYourOwnComputerPage.selectSoftware();
        Assert.assertEquals(buildYourOwnComputerPage.verifyThePrice(),"$1,475.00" , "Price does not match");
        buildYourOwnComputerPage.clickOnAddToCartButton();
        Assert.assertEquals(buildYourOwnComputerPage.verifyTheMessageOnTopGreenBar(),"The product has been added to your shopping cart","Message doesnot match");
        buildYourOwnComputerPage.clickOnCloseBar();
        buildYourOwnComputerPage.mouseHoverOnShoppingCart();
        buildYourOwnComputerPage.clickOnShoppingCart();
        Assert.assertEquals(shoppingCartPage.verifyShoppingCartText(),"Shopping cart","Text is not display");
        shoppingCartPage.updateQuantity();
        shoppingCartPage.UpdateShoppingCart();
        Assert.assertEquals(shoppingCartPage.verifyTheTotalPrice(),"$2,950.00","Price is not match");
        shoppingCartPage.clickOnCheckBox();
        shoppingCartPage.clickOnCheckOutButton();
        Assert.assertEquals(checkOutAsGuestPage.verifyWelcomeText(),"Welcome, Please Sign In!","Text is not matched");
        checkOutAsGuestPage.clickOnAsGuestButton();
        //Fill ALl Fields
        checkOutPage.enterBillingFirstName("Linda");
        checkOutPage.enterBillingLastName("Smith");
        checkOutPage.enterBillingEmailAddress("linda.smith@gmail.com");
        checkOutPage.selectCountryFromDropDown("233");
        checkOutPage.enterBillingCity("Manchester");
        checkOutPage.enterBillingAddress("269,Cambridge Lane");
        checkOutPage.enterBillingZipcode("M12 9AW");
        checkOutPage.enterBillingPhoneNumber("5665995116994");
        checkOutPage.clickOnCheckOutButton();
        Thread.sleep(5000);
        checkoutPage1.clickOnRadioButtonTextDayAir();
        checkoutPage1.clickOnContinue();
        checkOutPage2.clickOnCreditCard();
        checkOutPage2.clickOnContinue();
        checkOutPage3.enterCardHolderName("Linda Smith");
        checkOutPage3.enterCardNumber("5555555555554444");
        checkOutPage3.selectExpiryMonthFromDropDown("6");
        checkOutPage3.selectExpiryYearFromDropDown("2024");
        checkOutPage3.enterCardCode("0201");
        checkOutPage3.clickOnContinueButton();
        Assert.assertEquals(confirmOrderPage.verifyCreditCardPaymentMethod(),"Credit Card","Method is not correct");
        Assert.assertEquals(confirmOrderPage.verifyShippingMethod(),"Next Day Air","method is not correct");
        Assert.assertEquals(confirmOrderPage.verifyTheTotalPrice(),"$2,950.00","Price is not Match");
        confirmOrderPage.clickOnConFirm();
        Assert.assertEquals(completedCheckoutPage.verifyThankYouText(),"Thank you","Text is not displayed");
        Assert.assertEquals(completedCheckoutPage.verifySucessOrderText(),"Your order has been successfully processed!","Text is not displayed");
        completedCheckoutPage.clickOnContinue();
        Assert.assertEquals(homePage.verifyWelComeText(),"Welcome to our store","Text is not displayed");
    }
}
