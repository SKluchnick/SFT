package HomeTaskTwo;

import org.junit.Assert;
import org.junit.Test;

public class RunTest extends BaseTest{


    @Test
    public void checkLanguagesOnPage(){
    IdE3 idE3 = new IdE3();
    String result = idE3.getAttribute();
    System.out.println(result);
    Assert.assertEquals("Продукт України!",result);


    }

    @Test
    public void checkCount(){
        String enter = "порошок ariel";
        IdE4 idE4 = new IdE4();
        idE4.enterInput(enter);
        String outPutUcr = idE4.getAttribute();
        System.out.println(outPutUcr);
        idE4.clickCheckBox();
        String outPutRus = idE4.getAttribute();
        System.out.println(outPutRus);
        Assert.assertEquals(outPutUcr,outPutRus);

    }

}
