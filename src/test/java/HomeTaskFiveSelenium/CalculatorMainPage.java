package HomeTaskFiveSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
    @FindBy(xpath = "//span[contains(text(),'.')]")
    WebElement dot;
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

    public double addDouble(){
        buttonEight.click();
        dot.click();
        buttonEight.click();
        plus.click();
        buttonEight.click();
        dot.click();
        buttonEight.click();
        equals.click();
        return Double.parseDouble(screen.getText());
    }

    public double minusDouble(){
        buttonEight.click();
        dot.click();
        buttonEight.click();
        minus.click();
        buttonEight.click();
        dot.click();
        buttonEight.click();
        equals.click();
        return Double.parseDouble(screen.getText());
    }

    public double divisionDouble(){
        buttonEight.click();
        dot.click();
        buttonEight.click();
        division.click();
        buttonEight.click();
        dot.click();
        buttonEight.click();
        equals.click();
        return Double.parseDouble(screen.getText());
    }

    public boolean buttonOperator() {
        List<WebElement> webElements = driver.findElements(By.className("operator"));
        List<String> arrayList = new ArrayList<>();
        List<String> arrayList1 = new ArrayList<>();
        for (int i = 0; i < webElements.size(); i++) {
            webElements.get(i).click();
            String res = screen.getText();
            arrayList.add(res);
            clearScreen();
            String res2 = webElements.get(i).getText();
            arrayList1.add(res2);
        }
        Collections.sort(arrayList);
        Collections.sort(arrayList1);
        return arrayList.equals(arrayList1);
    }


    public void clearScreen() {
        clear.click();
    }


}
