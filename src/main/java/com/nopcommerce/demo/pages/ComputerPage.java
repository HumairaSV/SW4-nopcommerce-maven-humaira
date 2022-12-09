package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {

    By desktopLink = By.linkText("Desktops");

    public void clickOnDesktopTab(){
        clickOnElement(desktopLink);
    }
}
