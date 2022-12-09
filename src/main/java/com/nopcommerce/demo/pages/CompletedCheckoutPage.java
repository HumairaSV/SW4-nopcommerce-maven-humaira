package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CompletedCheckoutPage extends Utility {

    By thankyouText = By.xpath("//h1[contains(text(),'Thank you')]");
    By sucessText =By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    By continueButton = By.xpath("//button[contains(text(),'Continue')]");



    public String verifyThankYouText(){
        return getTextFromElement(thankyouText);
    }
    public String verifySucessOrderText(){
        return getTextFromElement(sucessText);
    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }
}
