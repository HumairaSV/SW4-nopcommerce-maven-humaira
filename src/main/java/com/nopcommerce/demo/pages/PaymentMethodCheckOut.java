package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentMethodCheckOut extends Utility {

    By creditCard = By.cssSelector("#paymentmethod_1");
    By continueButton = By.xpath("//ol[1]/li[4]/div[2]/div[1]/button[1]");


    public void clickOnCreditCard(){
        clickOnElement(creditCard);
    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }
}
