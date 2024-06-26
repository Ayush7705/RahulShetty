import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.Set;

public class Cookies {
    public static void main(String[] args){

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.onlinesbi.sbi");
        Set<Cookie> cookie = driver.manage().getCookies();
        System.out.println(cookie);
        driver.manage().addCookie(new Cookie("sbi", "sbi1"));
        Cookie cook = driver.manage().getCookieNamed("sbi");
        System.out.println(cook);




    }

}
