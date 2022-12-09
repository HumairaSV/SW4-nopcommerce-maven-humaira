package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends Utility {

    By shoppingCartText = By.xpath("//div[@class='page-title']/h1[contains(text(),'Shopping cart')]");
    By updateCart = By.xpath("//button[@id='updatecart']");
    By price = By.xpath("//span[@class='product-subtotal'][text()='$2,950.00']");
    By checkboxTerms = By.id("termsofservice");
    By checkout = By.xpath("//button[@id='checkout']");
    By productQuantityText = By.xpath("//td[@class='quantity']/child::input");
    By totalPrice = By.xpath("//tbody/tr[1]/td[6]/span[1]");



    public String verifyShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }
    public void updateQuantity() throws InterruptedException {
        Thread.sleep(3000);
        WebElement Quantity = driver.findElement(By.xpath("//td[@class='quantity']/child::input"));
        Quantity.clear();
        Quantity.sendKeys("2");
    }
    public void UpdateShoppingCart(){
        clickOnElement(updateCart);
    }
    public String verifyTheTotalPrice() {
        return getTextFromElement(price);
    }
    public void clickOnCheckBox(){
        clickOnElement(checkboxTerms);
    }
    public void clickOnCheckOutButton(){
        clickOnElement(checkout);
    }

    public String verifyProductQuantity(){
        WebElement wb = driver.findElement(productQuantityText);
        String actualQuantity = wb.getAttribute("value");
        return actualQuantity;
    }

    public String verifyTotalPrice(){
        return getTextFromElement(totalPrice);
    }

    public void clickOnTermsOfService(){
        clickOnElement(By.id("termsofservice"));
    }

}
