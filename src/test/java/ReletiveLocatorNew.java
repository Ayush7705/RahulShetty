import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;
import java.util.List;

public class ReletiveLocatorNew {

    public static void main(String[] args){

        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        //driver.get("https://saucedemo.com");
        //RelativeLocator.RelativeBy input =RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
        //driver.findElement(input).sendKeys("pass");
        driver.get("https://mail.rediff.com");
        //driver.switchTo().newWindow(WindowType.WINDOW).get("https://mail.rediff.com");
        driver.switchTo().newWindow(WindowType.TAB).get("https://mail.rediff.com");
        List<WebElement> links =  driver.findElements(By.xpath("//a"));
        System.out.println(links.size());
        for (WebElement Ele : links){

            String link =Ele.getText();
            System.out.println(link);
            if (link.contentEquals("Mone")){
                break;
            }

        }


    }

}
