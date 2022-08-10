package HomeTaskTwoSelenide;


import org.junit.Assert;
import org.junit.Test;

public class SelenideRunTest {

    private final static String BASE_URL = "https://eva.ua/ua/brnd-72860/";
    private final static String EXPECTED_WORD = "Продукт України!";

    @Test
    public void checkLanguagesOnPage(){
        SelenideMainPageIde3 mainPage = new SelenideMainPageIde3(BASE_URL);
        String result = mainPage.getAttribute();
        System.out.println(result);
        Assert.assertEquals(EXPECTED_WORD,result);


    }


}
