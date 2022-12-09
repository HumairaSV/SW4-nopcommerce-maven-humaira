package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentCheckOut extends Utility {

    By cardType = By.id("CreditCardType");
    By cardHolderNameField = By.id("CardholderName");
    By cardNumberField = By.id("CardNumber");
    By expireMonthField = By.id("ExpireMonth");
    By expireYearField = By.id("ExpireYear");
    By cardCodeField =  By.id("CardCode");
    By continueButton = By.xpath("//button[@class='button-1 payment-info-next-step-button']");


    public void selectCardTypeFromDropDown(String text){
        selectByValueFromDropDown(cardType,text);
    }
    public void enterCardHolderName(String text){
        sendTextToElement(cardHolderNameField,text);
    }
    public void enterCardNumber(String text){
        sendTextToElement(cardNumberField,text);
    }
    public void selectExpiryMonthFromDropDown(String text){
        selectByValueFromDropDown(expireMonthField,text);
    }
    public void selectExpiryYearFromDropDown(String text){
        selectByValueFromDropDown(expireYearField,text);
    }
    public void enterCardCode(String text){
        sendTextToElement(cardCodeField,text);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
