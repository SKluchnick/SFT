package HomeTaskFourSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumTrackingPage extends SeleniumBasePage{

    @FindBy(xpath = "(//input[@style='outline: none;'])[1]")
    WebElement inputTracking;

    @FindBy(xpath = "//span[@class='a-language-switcher__trigger a-language-switcher__trigger--on']")
    WebElement checkBox;



    public String getAttribute() {
        inputTracking.getAttribute("placeholder");
        String result = inputTracking.getText();
        return result;

    }

    public SeleniumTrackingPage changeLanguages(){
        checkBox.click();
        return this;
    }




}
