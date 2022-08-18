package HomeTaskFourSelenium;

import org.junit.Assert;
import org.junit.Test;

public class SeleniumRunTest extends BaseTest {




    @Test
    public void checkTextPlaceholders(){
       Seleniummainpageid1708_3 seleniummainpageid1708_3 = new Seleniummainpageid1708_3();
        seleniummainpageid1708_3.clickMoveToTrackingPage();
        SeleniumTrackingPage seleniumTrackingPage = new SeleniumTrackingPage();
        String placeholder = seleniumTrackingPage.getAttribute();
        seleniumTrackingPage.changeLanguages();
        String placeholderTwo = seleniumTrackingPage.getAttribute();
        Assert.assertNotEquals(placeholder,placeholderTwo);





    }

}
