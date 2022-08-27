package HomeTaskFiveSelenium;

import org.junit.Assert;
import org.junit.Test;

public class SeleniumRunTest extends BaseTest{

    private final static String EXPECTED_RESULT_15 = "15";
    private final static String EXPECTED_RESULT_1 = "1";
    private final static String UNEXPECTED_RESULT_2 = "2";
    private final static String EXPECTED_RESULT_32 = "32";
    private final static Double EXPECTED_RESULT_17_6 = 17.6;
    private final static Double EXPECTED_RESULT_DELTA = 0.111;


    @Test
    public void checkString(){
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
    public void checkDouble(){
        CalculatorMainPage calculatorMainPage = new CalculatorMainPage();
        double resultAddDouble = calculatorMainPage.addDouble();
        Assert.assertEquals(EXPECTED_RESULT_17_6,resultAddDouble,EXPECTED_RESULT_DELTA);

    }

    @Test
    public void checkScreen(){
        CalculatorMainPage calculatorMainPage = new CalculatorMainPage();
        Assert.assertFalse(calculatorMainPage.buttonOperator());
    }



}
