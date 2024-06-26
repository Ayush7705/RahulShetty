import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.List;

public class FirstScript {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        //One way to search with the enter option
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Koimoi.com" + Keys.ENTER);
        //Another way to search via for loop
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Koimoi.com");
        Thread.sleep(1000);
        List<WebElement> list= driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]"));
        System.out.println("Searched Elements");
        for (int i=0; i< list.size();i++){
            String Listitem = list.get(i).getText();
            if (Listitem.contains("koimoi.com")){
                list.get(i).click();
                break;
            }
        }

        driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
    }
}
