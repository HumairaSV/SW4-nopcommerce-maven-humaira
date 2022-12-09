package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShippingMethodCheckoutPage extends Utility {

    By nextDayAir = By.id("shippingoption_1");
    By continueButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
    By secondDayAir = By.xpath("//input[@id='shippingoption_2']");


    public void clickOnRadioButtonTextDayAir(){
        clickOnElement(nextDayAir);
    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }

    public void clickOnRadioButtonSecondDayAir(){

        clickOnElement(secondDayAir);
    }
}
