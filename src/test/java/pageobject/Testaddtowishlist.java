package pageobject;

import com.juaracoding.Day18.pageobject.drivers.DriverSingleton;
import com.juaracoding.Day18.pageobject.pages.Addtowishlist;
import com.juaracoding.Day18.pageobject.pages.Search;
import com.juaracoding.Day18.pageobject.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testaddtowishlist {
  public static WebDriver driver;
  private Search search;
    private Addtowishlist addtowishlist;

    @BeforeClass
    public void setUp(){
        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);
    }

    @BeforeMethod
    public void pageObject(){
        search = new Search();
        addtowishlist = new Addtowishlist();
    }

    @AfterClass
    public void closeBrowser(){
        delay(3);
        DriverSingleton.closeObjectInstance();
    }
    
    @Test()
    public void testmenuCatalog(){
        delay(Constants.DETIK);
        search.search("pants and shirt");
        delay(Constants.DETIK);

        addtowishlist.menuCatalog();
        Assert.assertEquals(addtowishlist.gettxtCatalog(), "Catalog");
        System.out.println("Test Case menu Catalog");
    }

    @Test()
    public void testtxtCatalog(){
        delay(Constants.DETIK);
        addtowishlist.gettxtCatalog();
        Assert.assertEquals(addtowishlist.gettxtCatalog(), "pilih catalog");
        System.out.println("Test Case pilih Catalog");
    }

@Test()
public void testcolorCatalog(){
        delay(Constants.DETIK);
        addtowishlist.getcolorCatalog();
        Assert.assertEquals(addtowishlist.getcolorCatalog(),"Warna produk");
        System.out.println("Test Case plih Warna");
}

@Test()
public void testSize(){
        delay(Constants.DETIK);
        addtowishlist.getSize();
        Assert.assertEquals(addtowishlist.getSize(), "Ukuran produk");
        System.out.println("Test Case ukuran produk");
}

@Test()
public void testQuality(){
        delay(Constants.DETIK);
        addtowishlist.getQuality();
        Assert.assertEquals(addtowishlist.getQuality(), "jUMLAH PRODUK");
        System.out.println("Test Case jumlah produk");
}

@Test()
public void testADDtocart(){
        delay(Constants.DETIK);
        addtowishlist.getADDtocart();
        Assert.assertEquals(addtowishlist.getADDtocart(), "masuk kedalam pilihan");
        System.out.println("Test Case masuk kedalam produk");
}

@Test()
public void testviewcart(){
        delay(Constants.DETIK);
        addtowishlist.getViewcart();
        Assert.assertEquals(addtowishlist.getViewcart(), "melihat pilihan produk");
        System.out.println("Test Case melihat pilihan produk");
}

@Test()
public void testContinues(){
        delay(Constants.DETIK);
        addtowishlist.getCOntinues();
        Assert.assertEquals(addtowishlist.getCOntinues(), "melanjutkan pembelian");
        System.out.println("Test Case melanjutkan pembelian");
}

    @Test()
    public void testShoesCatalog(){
        delay(Constants.DETIK);
        addtowishlist.getShoesCatalog();
        Assert.assertEquals(addtowishlist.getShoesCatalog(), "melanjutkan pilihan produk");
        System.out.println("Test Case melanjutkan pilihan produk");
    }

    @Test()
    public void testColor1(){
        delay(Constants.DETIK);
        addtowishlist.getColor1();
        Assert.assertEquals(addtowishlist.getColor1(), "memilih warna");
        System.out.println("Test Case memilih warna");
    }

    @Test()
    public void testSize1(){
        delay(Constants.DETIK);
        addtowishlist.getSize1();
        Assert.assertEquals(addtowishlist.getSize1(), "Ukuran produk");
        System.out.println("Ukuran produk");
    }

    @Test()
    public void testQuality1(){
        delay(Constants.DETIK);
        addtowishlist.getQuality1();
        Assert.assertEquals(addtowishlist.getQuality1(), "Jumlah produk");
        System.out.println("Test Case jumlah produk");
    }

    @Test()
    public void testaddtocart1(){
        delay(Constants.DETIK);
        addtowishlist.getADDtocart1();
        Assert.assertEquals(addtowishlist.getADDtocart1(), "Jumlah produk");
        System.out.println("Test Case masuk kedalam produk");
    }

@Test()
public void testCART(){
        delay(Constants.DETIK);
    addtowishlist.getCART();
    Assert.assertEquals(addtowishlist.getCART(), "Menyelesaikan pembelian");
    System.out.println("Test Case Menyelesaikan pembelian");
}
    static void delay(int detik){
        try {
            Thread.sleep(1000*detik);
        }catch (InterruptedException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}