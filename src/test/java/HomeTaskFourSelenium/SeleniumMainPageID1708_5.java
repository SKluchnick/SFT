package HomeTaskFourSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumMainPageID1708_5 extends SeleniumBasePage {

    @FindBy(xpath = "(//button[@title='Добавить в список желаний'])[1]")
    WebElement iconAdd;

    @FindBy(xpath = "//span[@class='account-wishlist__text']")
    WebElement iconWishList;






    public SeleniumMainPageID1708_5() {
        driver.navigate().to("https://eva.ua/217-297/parfjumerija-muzhskaja/");
        PageFactory.initElements(driver, this);

    }

    public SeleniumMainPageID1708_5  clickProductCardIcon(){
        iconAdd.click();
        return this;
    }


    public SeleniumWishPage moveToWishList (){
        iconWishList.click();
        return new SeleniumWishPage();
    }


}
