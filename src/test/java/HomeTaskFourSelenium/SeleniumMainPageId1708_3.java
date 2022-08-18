package HomeTaskFourSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumMainPageId1708_3 extends SeleniumBasePage {

    @FindBy(xpath = "(//div[@class='sf-input__wrapper'])[1]/input[@type='text']")
    WebElement inputTracking;

    @FindBy(xpath = "//span[@class='a-language-switcher__trigger a-language-switcher__trigger--on']")
    WebElement checkBox;

    public SeleniumMainPageId1708_3() {
        driver.navigate().to("https://eva.ua/tracking/");
        PageFactory.initElements(driver, this);

    }


    public String getAttributeTwo() {
        String result = inputTracking.getAttribute("placeholder");
        return result;

    }

    public String[] getAttribute(){
        return inputTracking.getAttribute("placeholder").split(":");
    }




    public void changeLanguages() {
        checkBox.click();

    }


}
