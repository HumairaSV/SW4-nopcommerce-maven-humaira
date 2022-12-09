package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By desktop = By.linkText("Desktops");
    By welcomeText = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By logoutText = By.xpath("//a[contains(text(),'Log out')]");

    public void selectMenu(String menu) {
        String mainmenu = menu.toLowerCase();
        String expression = "//a[@href ='/" + mainmenu + "']";
        driver.findElement(By.xpath(expression)).click();
        String currentUrl = driver.getCurrentUrl();
        //  Assert.assertEquals("Navigated successfully", currentUrl,"Do not Navigate" + menu);

    }

    public void clickOnDeskTop() {
        clickOnElement(desktop);
    }

    public void mouseHoverOnElectronics() {
        mouseHoverToElement(By.xpath("//div/ul[@class='top-menu notmobile']/li[2]/a[@href='/electronics']"));
    }

    public void mouseHoverOnCellPhonesAndClick() {
        mouseHoverToElementAndClick(By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));
    }

    public String verifyWelComeText() {
        return getTextFromElement(welcomeText);
    }

    public void clickOnLogoutButton() {
        clickOnElement(logoutText);
    }
}