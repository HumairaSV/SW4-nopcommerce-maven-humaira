package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {

    By buildYourOwnComputer = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processorName = By.name("product_attribute_1");
    By ram = By.name("product_attribute_2");
    By HDD = By.xpath("//input[@id='product_attribute_3_7']");
    By OS = By.xpath("//input[@id='product_attribute_4_9']");
    By software = By.xpath("//input[@id='product_attribute_5_12']");
    By price = By.xpath("//span[text() = '$1,475.00']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By message = By.xpath("//body[1]/div[5]/div[1]/p[1]");
    By closeBar = By.xpath("//body[1]/div[5]/div[1]/span[1]");
    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickCart = By.xpath("//button[contains(text(),'Go to cart')]");


    public String verifytheTextBuildyourowncomputer() {
        return getTextFromElement(buildYourOwnComputer);
    }

    public void selectProcessor(String text) {
        selectByValueFromDropDown(processorName, text);
    }

    public void selectRam(String text) {
        selectByValueFromDropDown(ram, text);
    }
    public void selectHDDRadio(){
        clickOnElement(HDD);
    }
    public void selectOSRadiVistaPremium(){
        clickOnElement(OS);
    }
    public void selectSoftware(){
        clickOnElement(software);
    }
    public String verifyThePrice() {
        return getTextFromElement(price);
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addToCart);
    }
    public String verifyTheMessageOnTopGreenBar() {
        return getTextFromElement(message);
    }
    public void clickOnCloseBar(){
        clickOnElement(closeBar);
    }
    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(shoppingCart);
    }
    public void clickOnShoppingCart(){
        clickOnElement(clickCart);
    }


}
