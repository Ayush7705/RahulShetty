package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class GoogleTestDemo {
    WebDriver driver = new EdgeDriver();
    @Test(priority = 0,invocationCount = 5,groups = "smoke")//invocaation is for running a single test n number of times
    public void ATestGoogleSearch(){

        driver.get("https://www.google.com");
        //driver.findElement(By.id("APFqb")).sendKeys("Ayush");
    }
    @Test(dependsOnMethods = "ATestGoogleSearch",enabled = true,groups = "smoke")//if it is depending on multiple tests then we can use
    //(dependsOnMethods={"ATestGoogleSearch","   ","   "})
    public void SendText(){
        driver.findElement(By.id("APjFqb")).sendKeys("Ayush");
    }

}
