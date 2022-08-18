package HomeTaskFourSelenium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SeleniumRunTest extends BaseTest {


    @Test
    public void checkPlaceholders() {
        SeleniumMainPageId1708_3 seleniumMainPageId1708_3 = new SeleniumMainPageId1708_3();
        String[] result = seleniumMainPageId1708_3.getAttribute();
        String outPut = result[1];
        seleniumMainPageId1708_3.changeLanguages();
        result = seleniumMainPageId1708_3.getAttribute();
        String outPutTwo = result[1];
        Assert.assertEquals(outPut,outPutTwo);

    }
}
