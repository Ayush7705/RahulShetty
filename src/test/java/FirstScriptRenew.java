import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.List;
public class FirstScriptRenew {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("java" );//+ Keys.ENTER
        Thread.sleep(2000);
        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='wM6W7d']"));
        System.out.println(list.size());
        for (WebElement WE : list) {
            String LinkText = WE.getText();
            System.out.println(LinkText);
            if (LinkText.equals("java interview questions")) {
                WE.click();
                break;
            }
        }




        //driver.get("https://onlinesbi.sbi");
//        System.out.println(driver.findElement(By.xpath("//span[@class='classicTxt']")).isSelected());
//        driver.findElement(By.xpath("//span[@class='classicTxt']")).click();
//        Thread.sleep(4000);
//        driver.navigate().back();
//        driver.navigate().forward();

    }

}
