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

}
