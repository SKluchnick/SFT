package HomeTaskTwoSelenium;

import org.junit.Assert;
import org.junit.Test;

public class SeleniumRunTest extends BaseTest{


    @Test
    public void checkLanguagesOnPage(){
    SeleniumMainPageIde3 idE3 = new SeleniumMainPageIde3();
    String result = idE3.getAttribute();
    System.out.println(result);
    Assert.assertEquals("Продукт України!",result);


    }

    @Test
    public void checkCount(){
        String enter = "порошок ariel";
        SeleniumMainPageIde4 idE4 = new SeleniumMainPageIde4();
        idE4.enterInput(enter);
        String outPutUcr = idE4.getAttribute();
        System.out.println(outPutUcr);
        idE4.clickCheckBox();
        String outPutRus = idE4.getAttribute();
        System.out.println(outPutRus);
        Assert.assertNotEquals(outPutUcr,outPutRus);

    }

}
