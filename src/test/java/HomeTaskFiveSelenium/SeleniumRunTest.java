package HomeTaskFiveSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumRunTest extends BaseTest{

    @Test
    public void checkMath(){
        CalculatorMainPage calculatorMainPage = new CalculatorMainPage();
        String resultAdd = calculatorMainPage.add();
        Assert.assertEquals("15", resultAdd);
        calculatorMainPage.clearScreen();
        String resultMinus = calculatorMainPage.minus();
        Assert.assertEquals("1", resultMinus);
        calculatorMainPage.clearScreen();
        String resultDivision = calculatorMainPage.division();
        Assert.assertNotEquals("2", resultDivision);
        calculatorMainPage.clearScreen();
        String resultMultiplication = calculatorMainPage.multiplication();
        Assert.assertEquals("32", resultMultiplication);

    }

    @Test
    public void checkButtonText(){
        CalculatorMainPage calculatorMainPage = new CalculatorMainPage();
        calculatorMainPage.buttonText();
    }



}
