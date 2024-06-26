import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowHandle {

    public static void main(String[] args){

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        //wait.until;
        driver.get("https://omayo.blogspot.com/");
        String FirstWindow = driver.getWindowHandle();
        driver.findElement(By.linkText("Open a popup window")).click();
        Set<String> Window = driver.getWindowHandles();
        System.out.println(Window);
        Iterator<String> itr = Window.iterator();
        while (itr.hasNext()){
            String Windows = itr.next();
            driver.switchTo().window(Windows);
            if (driver.getTitle().equals("Basic Web Page Title")){
                driver.close();
            }
            driver.switchTo().window(FirstWindow);
            driver.findElement(By.xpath("(//input[@name='q'])")).sendKeys("Ayush Rathore");

        }


    }
}
