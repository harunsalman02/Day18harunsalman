package com.juaracoding.Day18.pageobject.pages;

import com.juaracoding.Day18.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtowishlist {

 private WebDriver driver;

 public Addtowishlist() {
  this.driver = DriverSingleton.getDriver();
  PageFactory.initElements(driver, this);
 }

 @FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div/div[1]/a")
 WebElement menuCatalog;

 @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[2]/meta")
 WebElement txtCatalog;

 @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/table/tbody/tr[1]/td/select")
 WebElement colorCatalog;

 @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/table/tbody/tr[2]/td/select/option[2]")
 WebElement Size;

 @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div/button[2]/i")
 WebElement Quality;

 @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/div/div[2]/button")
 WebElement Addtocart;

 @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[1]/div/a")
 WebElement Viewcart;

 @FindBy(xpath = "/html/body/div[1]/div[2]/main/article/div/div/form/table/tbody/tr[2]/td/a[2]")
WebElement COntinues;

 @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/div[2]/div[1]/div/div[1]/a")
WebElement ShoesCatalog;

@FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/table/tbody/tr[1]/td/select")
WebElement Color1;

@FindBy(xpath =  "/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/table/tbody/tr[2]/td/select")
WebElement Size1;

@FindBy(xpath =  "/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/div/div[2]/button")
WebElement Quality1;

@FindBy(xpath =  "/html/body/div[2]/div[2]/div/div/div[1]/div/a")
WebElement  Addtocart1;

@FindBy(xpath =   "/html/body/div[2]/header/div[2]/div/div/div/ul/li/a/span/span[2]/span/bdi")
WebElement CART;

 public void menuCatalog() {menuCatalog.click();}

 public String gettxtCatalog() {return txtCatalog.getText();}

 public String getcolorCatalog() { return colorCatalog.getText();}

 public String getSize() { return Size.getText();}

 public String getQuality() { return Quality.getText();}

 public String getADDtocart() { return Addtocart.getText();}

 public String getViewcart() { return Viewcart.getText();}

 public String getCOntinues() {return  COntinues.getText();}

 public String getShoesCatalog() {return  ShoesCatalog.getText();}

 public String getColor1() { return Color1.getText();}

 public String getSize1() { return Size1.getText();}

 public String getQuality1() { return Quality1.getText();}

 public String getADDtocart1() { return Addtocart1.getText();}

 public String getCART() { return CART.getText();}

}

