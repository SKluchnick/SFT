package HomeTaskTwoSelenium;

import org.junit.Assert;
import org.junit.Test;

public class SeleniumRunTest extends BaseTest{


    @Test
    public void checkLanguagesOnPage(){
    SeleniumMainPageId3 idE3 = new SeleniumMainPageId3();
    idE3.clickCheckBox();
    String result = idE3.getText();
    System.out.println(result);
    Assert.assertEquals("Продукт України!",result);


    }

    @Test
    public void checkCount(){
        String enter = "порошок ariel";
        SeleniumMainPageId4 idE4 = new SeleniumMainPageId4();
        idE4.enterInput(enter);
        idE4.clickButton();
        String outPutUcr = idE4.getText();
        System.out.println(outPutUcr);
        idE4.clickCheckBox();
        String outPutRus = idE4.getText();
        System.out.println(outPutRus);
        Assert.assertNotEquals(outPutUcr,outPutRus);

    }

}
