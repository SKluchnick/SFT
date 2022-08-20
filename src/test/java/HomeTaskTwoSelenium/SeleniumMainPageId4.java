package HomeTaskTwoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumMainPageId4 extends SeleniumBasePage {

    @FindBy(xpath = "//input[@placeholder='Введіть пошуковий запит або код товару']")
    WebElement input;

    @FindBy(xpath = "//button[@title='evaріанти']")
    WebElement button;

    @FindBy(xpath = "//span[@class='page-title__total']")
    WebElement countValue;

    @FindBy(xpath = "//span[@class='a-language-switcher__trigger']")
    WebElement checkBox;


    public SeleniumMainPageId4() {
        driver.navigate().to("https://eva.ua/ua/");
        PageFactory.initElements(driver, this);

    }

    public void enterInput(String enter) {
        input.sendKeys(enter);

    }

    public void clickButton(){
        button.click();
    }

    public String getText() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement countValue = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='page-title__total']")));
        String outPut = "";
        while (true) {
            outPut = countValue.getText();
            if (!outPut.equals("0 товарa")) {
                outPut = countValue.getText();
                break;

            }
        }


        return outPut;
    }

    public void clickCheckBox() {
        checkBox.click();
    }


}
