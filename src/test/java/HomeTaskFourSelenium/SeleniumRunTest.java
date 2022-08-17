package HomeTaskFourSelenium;

import org.junit.Assert;
import org.junit.Test;

public class SeleniumRunTest extends BaseTest {




    @Test
    public void checkCount(){
        String enter = "порошок ariel";
        SeleniumMainPageID1708_5 idE4 = new SeleniumMainPageID1708_5();
        idE4.enterInput(enter);
        String outPutUcr = idE4.getAttribute();
        System.out.println(outPutUcr);
        idE4.clickCheckBox();
        String outPutRus = idE4.getAttribute();
        System.out.println(outPutRus);
        Assert.assertNotEquals(outPutUcr,outPutRus);

    }

}
