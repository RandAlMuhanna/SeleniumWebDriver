package pages.lambdaTesting;

import engine.ActionsBot;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.expandTesting.Secure;

public class Registration {

    private final WebDriver driver;
    private final ActionsBot bot;
    private final String url = "https://ecommerce-playground.lambdatest.io/index.php?route=account/register";
    private final By firstnameTextArea = By.id ("input-firstname");

    private final By lastnameTextArea = By.id ("input-lastname");

    private final By emailTextArea = By.id("input-email");
    private final By telephoneTextArea = By.id("input-telephone");

    private final By passwordTextArea = By.id("input-password");

    private final By passwordConfirmTextArea = By.id("input-confirm");

    private final By subscribe = By.xpath("//label[@for='input-newsletter-no']");

    private final By agreeThePrivacyPolicy= By.xpath("//label[@for='input-agree']");

    private final By submitButton= By.xpath("//input[@type='submit']");

    private final By flashMessageLabel = By.xpath("//h1[@class='page-title my-3']");



    public Registration(WebDriver driver, ActionsBot bot) {
        this.driver = driver;
        this.bot = bot;
    }

    public Registration goTo(){
        bot.navigate(url);
        return this;

    }


    public Secure successfulRegister(String firstname, String lastname, String email, String telephone, String password, String confirmpassword){
        register(firstname, lastname,  email,  telephone,  password,  confirmpassword);
        return new Secure(driver,bot);
    }


    public void register(String firstname, String lastname, String email, String telephone, String password, String confirmpassword){

        bot.type(firstnameTextArea, firstname);
        bot.type(lastnameTextArea, lastname);
        bot.type(emailTextArea, email);
        bot.type(telephoneTextArea, telephone);
        bot.type(passwordTextArea, password);
        bot.type(passwordConfirmTextArea, confirmpassword);

        bot.click(subscribe);
        bot.click(agreeThePrivacyPolicy);
        bot.click(submitButton);




    }
}
