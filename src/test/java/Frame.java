import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Frame {

    public static void main(String[] args){

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.rediff.com/");
        driver.switchTo().frame(0);
        String bse = driver.findElement(By.id("bseindex")).getText();
        System.out.println(bse);



    }
}
