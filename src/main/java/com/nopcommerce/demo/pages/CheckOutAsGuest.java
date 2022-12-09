package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutAsGuest extends Utility {

    By welcomeText = By.xpath("//h1[text()='Welcome, Please Sign In!']");
    By guestButton = By.xpath("//button[text()= 'Checkout as Guest']");
    By registerLink = By.xpath("//button[contains(text(),'Register')]");


    public String verifyWelcomeText() {
        return getTextFromElement(welcomeText);
    }
    public void clickOnAsGuestButton(){
        clickOnElement(guestButton);
    }

    public void clickOnRegisterTab(){
        clickOnElement(registerLink);
    }
}
