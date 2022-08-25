package HomeTaskFiveSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorMainPage extends SeleniumBasePage{

    @FindBy(xpath = "//span[contains(text(),'7')]")
    WebElement buttonSeven;
    @FindBy(xpath = "//span[contains(text(),'8')]")
    WebElement buttonEight;
    @FindBy(xpath = "//span[contains(text(),'+')]")
    WebElement plus;
    @FindBy(xpath = "//span[contains(text(),'-')]")
    WebElement minus;
    @FindBy(xpath = "//span[contains(text(),'=')]")
    WebElement equals;
    @FindBy(xpath = "//div[@class='screen']")
    WebElement screen;
    @FindBy(xpath = "//span[@class='clear']")
    WebElement clear;

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

    public void clearScreen(){
        clear.click();
    }





}
