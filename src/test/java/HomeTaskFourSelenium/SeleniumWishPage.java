package HomeTaskFourSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumWishPage extends SeleniumBasePage{

    @FindBy(xpath = "//button[@title='Удалить из списка желаний']")
    WebElement iconDel;


    public SeleniumWishPage() {
        PageFactory.initElements(driver, this);
    }

    public SeleniumWishPage removeFromWishList(){
        iconDel.click();
        return this;
    }
}
