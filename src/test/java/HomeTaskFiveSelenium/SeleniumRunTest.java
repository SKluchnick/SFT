package HomeTaskFiveSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumRunTest extends BaseTest{

    private final static String EXPECTED_RESULT_15 = "15";
    private final static String EXPECTED_RESULT_1 = "1";
    private final static String UNEXPECTED_RESULT_2 = "2";
    private final static String EXPECTED_RESULT_32 = "32";

    @Test
    public void checkMath(){
        CalculatorMainPage calculatorMainPage = new CalculatorMainPage();
        String resultAdd = calculatorMainPage.add();
        Assert.assertEquals(EXPECTED_RESULT_15, resultAdd);
        calculatorMainPage.clearScreen();
        String resultMinus = calculatorMainPage.minus();
        Assert.assertEquals(EXPECTED_RESULT_1, resultMinus);
        calculatorMainPage.clearScreen();
        String resultDivision = calculatorMainPage.division();
        Assert.assertNotEquals(UNEXPECTED_RESULT_2, resultDivision);
        calculatorMainPage.clearScreen();
        String resultMultiplication = calculatorMainPage.multiplication();
        Assert.assertEquals(EXPECTED_RESULT_32, resultMultiplication);

    }

    @Test
    public void printButtonText(){
        CalculatorMainPage calculatorMainPage = new CalculatorMainPage();
        calculatorMainPage.buttonTextPrint();
    }



}
