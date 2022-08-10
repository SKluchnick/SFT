package HomeTaskTwoSelenide;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.$x;

public class MainPageId4 {

    private final SelenideElement input = $x("//input[@placeholder='Введіть пошуковий запит або код товару']");
    private final SelenideElement button = $x("//button[@title='evaріанти']");
    private final SelenideElement countValue = $x("//span[@class='page-title__total']");
    private final SelenideElement checkBox = $x("//span[@class='a-language-switcher__trigger']");




    public MainPageId4(String url) {
        Selenide.open(url);
    }

    public void enterInput(String enter) {
        input.sendKeys(enter);
        button.click();
    }


    public String getAttribute() {
             String outPut = "";
        while (true) {
            countValue.getAttribute("value");
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
