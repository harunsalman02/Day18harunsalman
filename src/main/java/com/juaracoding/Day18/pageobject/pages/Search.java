package com.juaracoding.Day18.pageobject.pages;

import com.juaracoding.Day18.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
    private WebDriver driver;

    public Search() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "Input")
    WebElement Search;


    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div/a/i")
    WebElement btnSearch;

    @FindBy(xpath = "/html/body/div[2]/header/div[3]/div[2]/form/input[1]")
    WebElement txtValidSearch;

    @FindBy(xpath = "/html/body/div[1]/div[2]/p")
    WebElement txtInvalid;


    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]")
    WebElement txtcatalog;

    public void search(String input) {
        this.Search.sendKeys(input);

    }

    public String getTxtvalidSearch() {
        return txtValidSearch.getText();
    }

    public String gettTxtInvalid() {
        return txtInvalid.getText();
    }

    public String getTxtCatalog() {
        return txtcatalog.getText();
    }

}