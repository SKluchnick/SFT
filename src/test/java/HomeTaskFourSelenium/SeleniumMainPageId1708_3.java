package HomeTaskFourSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumMainPageId1708_3 extends Hw4SeleniumBasePage{

    @FindBy(xpath = "(//input[@style='outline: none;'])[1]")
    WebElement inputTracking;

    @FindBy(xpath = "//span[@class='a-language-switcher__trigger a-language-switcher__trigger--on']")
    WebElement checkBox;

    public SeleniumMainPageId1708_3() {
        driver.navigate().to("https://eva.ua/tracking/");
        PageFactory.initElements(driver, this);

    }

    public String getAttributeTwo() {
        inputTracking.getAttribute("placeholder");
        String result = inputTracking.getText();
        return result;

    }

    public void changeLanguages(){
        checkBox.click();

    }


}
