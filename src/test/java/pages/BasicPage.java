package pages;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static config.UserConfig.USER_LOGIN;
import static config.UserConfig.USER_PASSWORD;

public class BasicPage {

    BasicPage basicPage = new BasicPage();

   private final SelenideElement log = $(By.xpath("//*[@id=\"user-name\"]"));
   private final SelenideElement pas = $(By.xpath("//*[@id=\"password\"]"));
   private final SelenideElement sub = $(By.xpath("//*[@id=\"login-button\"]"));

   @Then("Enter login")
   public void enterLogin() {
       basicPage.log.sendKeys(USER_LOGIN);
   }

   @Then("Enter password")
   public void enterPass() {
       basicPage.pas.sendKeys(USER_PASSWORD);
   }

    @Then("Click submit button")
    public void clickSubmit() {
        basicPage.sub.click();
    }


    }

