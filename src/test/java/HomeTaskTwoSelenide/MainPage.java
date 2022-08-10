package HomeTaskTwoSelenide;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {


    private final SelenideElement checkBox = $x("//span[@class='a-language-switcher__trigger']");
    private final SelenideElement text = $x("(//span[@class='nav-horizontal__el-title'])[6]");



    public MainPage(String url){
        Selenide.open(url);
    }


    public String getAttribute() {
        checkBox.click();
        text.getAttribute("value");
        String result = text.getText();
        return result;

    }



}
