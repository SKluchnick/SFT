package HomeTaskTwoSelenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class SelenideMainPageIde3 {


    private final SelenideElement checkBox = $x("//span[@class='a-language-switcher__trigger']");

    private final SelenideElement text = $x("(//span[@class='nav-horizontal__el-title'])[6]");


    public SelenideMainPageIde3(String url) {
        Selenide.open(url);
    }

    public void clickCheckBox(){
        checkBox.shouldBe(Condition.visible).click();
    }

    public String getText() {
        return text.getText();

    }


}
