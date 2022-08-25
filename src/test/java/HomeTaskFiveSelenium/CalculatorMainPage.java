package HomeTaskFiveSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalculatorMainPage extends SeleniumBasePage {

    @FindBy(xpath = "//span[contains(text(),'7')]")
    WebElement buttonSeven;
    @FindBy(xpath = "//span[contains(text(),'8')]")
    WebElement buttonEight;
    @FindBy(xpath = "//span[contains(text(),'4')]")
    WebElement buttonFour;
    @FindBy(xpath = "//span[contains(text(),'+')]")
    WebElement plus;
    @FindBy(xpath = "//span[contains(text(),'/')]")
    WebElement division;
    @FindBy(xpath = "//span[contains(text(),'x')]")
    WebElement multiplication;
    @FindBy(xpath = "//span[contains(text(),'-')]")
    WebElement minus;
    @FindBy(xpath = "//span[contains(text(),'=')]")
    WebElement equals;
    @FindBy(xpath = "//div[@class='screen']")
    WebElement screen;
    @FindBy(xpath = "//span[@class='clear']")
    WebElement clear;
    @FindBy(xpath = "//div[@class='keys']")
    WebElement keys;

    public CalculatorMainPage() {
        String urlIndex = CalculatorMainPage.class.getClassLoader().getResource("calculator.html").toExternalForm();
        driver.navigate().to(urlIndex);
        PageFactory.initElements(driver, this);
    }

    public String add() {
        buttonSeven.click();
        plus.click();
        buttonEight.click();
        equals.click();
        return screen.getText();

    }

    public String minus() {
        buttonEight.click();
        minus.click();
        buttonSeven.click();
        equals.click();
        return screen.getText();

    }

    public String division() {
        buttonEight.click();
        division.click();
        buttonFour.click();
        equals.click();
        return screen.getText();
    }

    public String multiplication() {
        buttonEight.click();
        multiplication.click();
        buttonFour.click();
        equals.click();
        return screen.getText();

    }

    public List<WebElement> buttonText(){
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='keys']"));

        return list;
    }


    public void clearScreen() {
        clear.click();
    }


}