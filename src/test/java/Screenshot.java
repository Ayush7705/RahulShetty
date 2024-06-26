import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Screenshot {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new EdgeDriver();
        String Filepath= System.getProperty("user.dir");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("http://www.rediff.com");
//        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Ayush Rathore");
//        List<WebElement> box =driver.findElements(By.xpath("//ul[@jsname='bw4e9b']"));
//        System.out.println(box);


        //To take a screenshot of an elemtent
        WebElement Div = driver.findElement(By.xpath("//div[@class='div_container']/div"));
        String Screenshotpath = Filepath + "\\image\\sss.jpg";
        String SC2 = Filepath + "\\Screenshots\\SC1.jpg";
        File Screenshots =Div.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Screenshots, new File(Screenshotpath));

        //To take full screenshot
//        TakesScreenshot tks = (TakesScreenshot) driver;
//        File SC1 = tks.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(SC1, new File(SC2));





    }
}
