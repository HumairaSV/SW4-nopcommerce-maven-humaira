package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CellPhonesPage extends Utility {

    By cellPhonesText = By.xpath("//div[@class='page-title']/h1[text() = 'Cell phones']");
    By listViewLink = By.xpath("//div/a[text()='List']");
    By nokiaLumiaText = By.xpath("//h2/a[text()='Nokia Lumia 1020']");

    public String verifyCellPhonesText(){
        return getTextFromElement(cellPhonesText);
    }

    public void clickOnListView(){
        clickOnElement(listViewLink);
    }

    public void clickOnNokiaLumia(){
        clickOnElement(nokiaLumiaText);
    }
}
