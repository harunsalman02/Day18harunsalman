package pageobject;

import com.juaracoding.Day18.pageobject.drivers.DriverSingleton;
import com.juaracoding.Day18.pageobject.pages.Search;
import com.juaracoding.Day18.pageobject.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestSearch {
    public static WebDriver driver;
    private Search search;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
      driver.get(Constants.URL);
    }

    @BeforeMethod
    public void pageObject() {
        search = new Search();
    }

    @AfterClass
    public void closeBrowser() {
        delay(3);
        DriverSingleton.closeObjectInstance();
    }

    @Test(priority = 1)
    public void TestttxtValidSearch() {
        delay(Constants.DETIK);
        search.search("DRESS");
        Assert.assertEquals(search.getTxtvalidSearch(),"Valid");
        System.out.println("Test Case Valid");
    }

    @Test(priority = 2)
    public void TesttxtInvalidSearch() {
        delay(Constants.DETIK);
        search.search("BAG");
        Assert.assertEquals(search.gettTxtInvalid(), "Invalid");
        System.out.println("Test Case Invalid");
    }

    @Test(priority = 3)
    public void testtxtCatalog() {
        delay(Constants.DETIK);
        search.search("");
        Assert.assertEquals(search.getTxtCatalog(), "Catalog");
        System.out.println("Test Case Catalog");
    }


    private void delay(int detik) {
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            //TODO Auto-generated catch blok
            e.printStackTrace();
        }
        }
    }

