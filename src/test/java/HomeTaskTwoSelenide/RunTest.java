package HomeTaskTwoSelenide;

import HomeTaskTwoSelenium.Ide4;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class RunTest {

    private final static String BASE_URL_Ide3 = "https://eva.ua/ua/brnd-72860/";
    private final static String BASE_URL_Ide4 = "https://eva.ua/ua/";
    private final static String EXPECTED_WORD_Ide3 = "Продукт України!";
    private final static String EXPECTED_WORD_Ide4 = "порошок ariel";



    @Test
    public void checkLanguagesOnPage(){
        MainPageId3 mainPageId3 = new MainPageId3(BASE_URL_Ide3);
        String result = mainPageId3.getAttribute();
        System.out.println(result);
        Assert.assertNotEquals(EXPECTED_WORD_Ide3,result);

    }

    @Test
    public void checkCount(){
        MainPageId4 mainPageId4 = new MainPageId4(BASE_URL_Ide4);
        mainPageId4.enterInput(EXPECTED_WORD_Ide4);
        String outPutUcr = mainPageId4.getAttribute();
        System.out.println(outPutUcr);
        mainPageId4.clickCheckBox();
        String outPutRus = mainPageId4.getAttribute();
        System.out.println(outPutRus);
        Assert.assertNotEquals(outPutUcr,outPutRus);

    }
}
