import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowH {

    public static void main(String[] args){

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.online.citibank.co.in/");
        driver.findElement(By.xpath("//a[@class='newclose']")).click();
        driver.findElement(By.xpath("//a[@class='newclose2']")).click();
        String mainWindowHandle = driver.getWindowHandle();
        System.out.println(mainWindowHandle);
        driver.findElement(By.xpath("//a[@class='visible-dektop overlay-login']")).click();
        for (String Ayush : driver.getWindowHandles()){

            if (!mainWindowHandle.equals(Ayush)){

                driver.switchTo().window(Ayush);
                System.out.println(driver.getTitle());
                //driver.close();

            }
        driver.switchTo().window(mainWindowHandle);
        }


    }
}
