import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class Capabilities {

    public static void main(String[] args){
// Every browser has its own capabilities.
        WebDriver driver = new EdgeDriver();
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);//To wait for page to load
        options.setAcceptInsecureCerts(true);// to accept the insecure certs.
        options.setScriptTimeout(Duration.ofSeconds(2)); //Script timeoiut duration on
        //options.setUnhandledPromptBehaviour();//tbd
        //options.setProxy(); // ex:- to access the internet at client location





    }


}
