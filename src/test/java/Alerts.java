import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alerts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://magento.softwaretestingboard.com/gear.html");

        WebElement bag = driver.findElement(By.xpath("//span[@class='product-image-container']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(bag);
        WebElement Cart = driver.findElement(By.xpath("(//button[@type='submit' and @title='Add to Cart'])"));
        actions.moveToElement(Cart);
        actions.click().build().perform();


//
        //driver.findElement(By.xpath("(//button[@type='submit' and @title='Add to Cart'])")).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='minicart-wrapper']")).click();
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='secondary']/a/span[text()='Remove']"))));
        driver.findElement(By.xpath("//a[@href='#' and @class='action delete']")).click();

        //Alerts Alert = new Alerts();
        Alert alert = driver.switchTo().alert();
        alert.getText();
        alert.dismiss();



    }
}
