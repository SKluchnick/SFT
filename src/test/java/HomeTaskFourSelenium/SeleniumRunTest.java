package HomeTaskFourSelenium;

import org.junit.Assert;
import org.junit.Test;

public class SeleniumRunTest extends BaseTest {


    @Test
    public void checkPlaceholders() {
        SeleniumMainPageId1708_3 seleniumMainPageId1708_3 = new SeleniumMainPageId1708_3();
        String outPut = seleniumMainPageId1708_3.getAttributeTwo();
        System.out.println(outPut);
        seleniumMainPageId1708_3.changeLanguages();
        String outPutTwo = seleniumMainPageId1708_3.getAttributeTwo();
        System.out.println(outPutTwo);
        Assert.assertNotEquals(outPut,outPutTwo);


    }
}
