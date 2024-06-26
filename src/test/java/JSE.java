import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class JSE {

    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = new EdgeDriver();
        String Filepath= System.getProperty("user.dir");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.rediff.com");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String Title = jse.executeScript("return document.title").toString();
        System.out.println(Title);

        jse.executeScript("window.scrollBy(0,1500)");
        WebElement Linktext = driver.findElement(By.linkText("Where did we lose? NDA was there, is there: Modi"));
        jse.executeScript("arguments[0].scrollIntoView(true)", Linktext);
        Thread.sleep(2000);
        jse.executeScript("arguments[0].click()", Linktext);





    }
}
