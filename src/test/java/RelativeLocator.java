import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class RelativeLocator {

    public static void main(String[] args){

        WebDriver driver = new EdgeDriver();
        EdgeOptions options = new EdgeOptions();
        String aush = options.getBrowserVersion();
        System.out.println(aush);
        System.out.println("ayush");
        driver.get("https://fb.com");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rathoreayush987@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("dszfdur");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        WebElement a = driver.findElement(By.xpath("//div"));
//        a.findElement(By.xpath(""));
        //for going to new window in existing tab or new Window
        WebDriver yush = driver.switchTo().newWindow(WindowType.WINDOW);
        yush.get("https://www.google.com");
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.com");
    }
}
