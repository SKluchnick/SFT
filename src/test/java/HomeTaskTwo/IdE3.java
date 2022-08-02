package HomeTaskTwo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IdE3 extends BasePage {

    @FindBy(xpath = "//span[@class='a-language-switcher__trigger']")
    WebElement checkBox;

    @FindBy(xpath = "(//span[@class='nav-horizontal__el-title'])[6]")
    WebElement text;


    public IdE3() {
        driver.navigate().to("https://eva.ua/ua/brnd-72860/");
        PageFactory.initElements(driver, this);

    }


    public String getAttribute() {
        checkBox.click();
        text.getAttribute("value");
        String result = text.getText();
        return result;

    }


}
