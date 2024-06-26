import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert2 {

    public static void main(String[] args){

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Rectangle a = driver.findElement(By.id("confirmbtn")).getRect();
        System.out.println(a);
        driver.findElement(By.id("confirmbtn")).click();
        Alert alert = driver.switchTo().alert();
        String aa = alert.getText();
        System.out.println(a);
        alert.dismiss();


    }
}
