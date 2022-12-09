package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BillingCheckOutPage extends Utility {

    By firstNamefield = By.id("BillingNewAddress_FirstName");
    By lastNameField = By.id("BillingNewAddress_LastName");
    By emailAddressField = By.id("BillingNewAddress_Email");
    By countryField = By.id("BillingNewAddress_CountryId");
    By stateField = By.id("BillingNewAddress_StateProvinceId");
    By cityField = By.id("BillingNewAddress_City");
    By addressField = By.id("BillingNewAddress_Address1");
    By zipCodeField = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberField = By.id("BillingNewAddress_PhoneNumber");
    By checkout = By.xpath("//div[1]/button[4]");
    By continueButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");



    public void enterBillingFirstName(String text){
        sendTextToElement(firstNamefield,text);
    }
    public void enterBillingLastName(String text){
        sendTextToElement(lastNameField,text);
    }
    public void enterBillingEmailAddress(String text){
        sendTextToElement(emailAddressField,text);
    }
    public void selectCountryFromDropDown(String text){
        selectByValueFromDropDown(countryField,text);
    }
    public void selectStateFromDropDown(String text){
        selectByValueFromDropDown(stateField,text);
    }
    public void enterBillingCity(String text){
        sendTextToElement(cityField,text);
    }
    public void enterBillingAddress(String text){
        sendTextToElement(addressField,text);
    }
    public void enterBillingZipcode(String text){
        sendTextToElement(zipCodeField,text);
    }
    public void enterBillingPhoneNumber(String text){
        sendTextToElement(phoneNumberField,text);
    }
    public void clickOnCheckOutButton(){
        clickOnElement(checkout);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
