import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class FullScreenshotMozilla {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new FirefoxDriver();
        String Filepath = System.getProperty("user.dir");
        String ScreenS = Filepath + "\\Screenshots\\1.jpg" ;
        driver.get("https://www.rediff.com");
        File Screenshot = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Screenshot, new File(ScreenS));


    }
}
