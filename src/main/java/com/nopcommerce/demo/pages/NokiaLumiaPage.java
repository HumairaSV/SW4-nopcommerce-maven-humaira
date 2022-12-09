package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class NokiaLumiaPage extends Utility {

    By nokiaLumiaText = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By nokiaPrice = By.xpath("//span[@id='price-value-20']");
    By nokiaAddToCartLink = By.cssSelector("#add-to-cart-button-20");
    By productAddedText = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By crossButtonLink = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By shoppingCartLink = By.xpath("//button[contains(text(),'Go to cart')]");
    By mouseHoverShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");

    public String verifyNokiaLumiaText(){
        return getTextFromElement(nokiaLumiaText);
    }

    public String verifyNokiaPrice(){
        return getTextFromElement(nokiaPrice);
    }

    public void changeNokiaQuantity(){
        driver.findElement(By.cssSelector("#product_enteredQuantity_20")).clear();
        sendTextToElement(By.cssSelector("#product_enteredQuantity_20"), "2");
    }

    public void nokiaAddToCartButton(){
        clickOnElement(nokiaAddToCartLink);
    }

    public String productAddedToTheCartMessage(){
        return getTextFromElement(productAddedText);
    }

    public void clickOnCrossButton(){
        clickOnElement(crossButtonLink);
    }

    public void clickOnShoppingCartLink(){
        mouseHoverToElement(mouseHoverShoppingCart);
        clickOnElement(shoppingCartLink);
    }
}
