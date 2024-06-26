import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class FileUpload {
    public static void main(String[] args) throws AWTException, InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String Filepath = System.getProperty("user.dir"); //best practice to store the location of project & not showing in sendkeys

        //File uploading can be done with two ways -1. with standard element (With tag input) 2. Non standard element (With other tags than input eg. span div)
        //1 - below with tagname input
//        driver.get("https://fineuploader.com/demos.html");
//        driver.findElement(By.name("qqfile")).sendKeys(Filepath + "\\image\\IMG_20210713_221844 (1).jpg");

        //2 without tag input non standard
        driver.get("https://dhtmlx.com/docs/products/dhtmlxVault/");
        //String selection and clipboard is use to copy the filepath so that we can paste it.
        StringSelection path = new StringSelection(Filepath + "\\image\\IMG_20210713_221844 (1).jpg");
        Clipboard SystemClipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        SystemClipboard.setContents(path, null);
        WebElement FrameElement = driver.findElement(By.xpath("//iframe[@class='preloading']"));
        driver.switchTo().frame(FrameElement);
        driver.findElement(By.xpath("//div[@aria-label='tab-content-toolbar']//button[@aria-label='Add ']//span")).click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress((KeyEvent.VK_V));
        robot.keyRelease((KeyEvent.VK_CONTROL));
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
