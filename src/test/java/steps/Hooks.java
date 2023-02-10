package steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;

public class Hooks {

    @Given("Open the site")
    public void  openUrl(){
        Selenide.open("https://www.saucedemo.com");
    }
}
