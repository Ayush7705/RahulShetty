package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SauceLab {

    @DataProvider(name = "Testdata")
            public Object[][] FetchData(){
        Object[][] arr = new Object[][]{{"standard_user","secret_sauce"},{"locked_out_user","secret_sauce"},{"problem_user","secret_sauce"}};
        return arr;
        }

    WebDriver driver;
    @Parameters("Browser")
    @BeforeMethod(groups = "smoke")
    public void SaucLabLogin(String Browser) {
        if (Browser.equalsIgnoreCase("Chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
            driver = new ChromeDriver();
            driver.get("https://saucedemo.com");
        } else if (Browser.equalsIgnoreCase("Edge")) {
            EdgeOptions options = new EdgeOptions();
            options.addArguments("start-maximized");
            options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
            driver = new EdgeDriver(options);
            driver.get("https://saucedemo.com");
        }
    }


    @Test(groups = "smoke",priority = 0, dataProvider = "Testdata")
    public void ATestloginsaucelab(String username,String password){
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
//
        Assertion SoftAssert = new Assertion();
        SoftAssert.assertEquals(driver.getTitle(),"Swag Labs", "Verify the title");
        //((org.testng.asserts.SoftAssert)SoftAssert).assertAll();


    }
    @Test(groups = "smoke", enabled = false)
    public void addtoCart(){
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        //String Title =driver.getTitle();
        Assert.assertEquals(driver.getTitle(),"Swag Labs", "Verify the title");
        //System.out.println(Title);


    }
    @AfterMethod
    public void Cleanup(){
        driver.close();
    }



}
