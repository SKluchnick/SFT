package HomeTaskTwoSelenium;

import org.junit.Assert;
import org.junit.Test;

public class RunTest extends BaseTest{


    @Test
    public void checkLanguagesOnPage(){
    Ide3 idE3 = new Ide3();
    String result = idE3.getAttribute();
    System.out.println(result);
    Assert.assertNotEquals("Продукт України!",result);


    }

    @Test
    public void checkCount(){
        String enter = "порошок ariel";
        Ide4 idE4 = new Ide4();
        idE4.enterInput(enter);
        String outPutUcr = idE4.getAttribute();
        System.out.println(outPutUcr);
        idE4.clickCheckBox();
        String outPutRus = idE4.getAttribute();
        System.out.println(outPutRus);
        Assert.assertNotEquals(outPutUcr,outPutRus);

    }

}
