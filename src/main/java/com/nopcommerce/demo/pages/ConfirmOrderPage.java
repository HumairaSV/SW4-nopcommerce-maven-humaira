package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ConfirmOrderPage extends Utility {

    By paymentMethod = By.xpath("//span[contains(text(),'Credit Card')]");
    By shippingtMethod = By.xpath("//div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]");
    By price = By.xpath("//tbody/tr[4]/td[2]/span[1]/strong[1]");
    By confirmButton = By.xpath("//button[contains(text(),'Confirm')]");
    By secondDayAir = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]");
    By nokiaTotalPrice = By.xpath("//tbody/tr[4]/td[2]/span[1]/strong[1]");


    public String verifyCreditCardPaymentMethod(){
        return getTextFromElement(paymentMethod);
    }
    public String verifyShippingMethod(){
        return getTextFromElement(shippingtMethod);
    }
    public String verifyTheTotalPrice() {
        return getTextFromElement(price);
    }
    public void clickOnConFirm(){
        clickOnElement(confirmButton);
    }

    public String verifySecondDayAir(){
        return getTextFromElement(secondDayAir);
    }

    public String verifyNokiaTotalPrice(){
        return getTextFromElement(nokiaTotalPrice);
    }
}
