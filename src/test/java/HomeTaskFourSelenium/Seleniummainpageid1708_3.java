package HomeTaskFourSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Seleniummainpageid1708_3 extends SeleniumBasePage {

    @FindBy(xpath = "(//a[@href='/tracking/']")
    WebElement linkMoveTracking;




    public Seleniummainpageid1708_3() {
        driver.navigate().to(" https://eva.ua");
        PageFactory.initElements(driver, this);

    }

    public SeleniumTrackingPage clickMoveToTrackingPage(){
        linkMoveTracking.click();
        return new SeleniumTrackingPage();
    }




}
