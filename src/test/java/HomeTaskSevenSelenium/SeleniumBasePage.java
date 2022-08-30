package HomeTaskSevenSelenium;

import org.openqa.selenium.WebDriver;

public class SeleniumBasePage {
    protected static WebDriver driver;


    public static void setDriver(WebDriver webDriver){
        driver = webDriver;
    }
}
