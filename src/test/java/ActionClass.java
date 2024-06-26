import net.bytebuddy.implementation.bytecode.ShiftLeft;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionClass {
    public static void main(String[] args){

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://opensource-demo.orangehrmlive.com");

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admi123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement Invalid =driver.findElement(By.xpath("//p[text()= 'Invalid credentials']"));
        String Credential = Invalid.getText();
        System.out.println(Credential);

//        driver.findElement(By.xpath("//span/i")).click();
//
//        driver.findElement(By.xpath("//a[text()= 'Logout']")).click();

        //driver.get("https://fb.com");
        //Actions action = new Actions(driver);
        //action.moveToElement(driver.findElement(By.xpath("//input[@id='email']"))).keyUp(ShiftLeft);
        //The element with Input tag is standard element & which is having not input tag is not standard.

    }
}
