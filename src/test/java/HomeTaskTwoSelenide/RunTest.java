package HomeTaskTwoSelenide;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class RunTest {

    private final static String BASE_URL_Ide3 = "https://eva.ua/ua/brnd-72860/";



    @Test
    public void checkLanguagesOnPage(){
        MainPageId3 mainPageId3 = new MainPageId3(BASE_URL_Ide3);
        String result = mainPageId3.getAttribute();
        System.out.println(result);
        Assert.assertNotEquals("Продукт України!",result);

    }
}
