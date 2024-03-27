package pages.lambdaTesting;

import engine.ActionsBot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Secure extends Pages {


    private final By flashMessageLabel = By.xpath("//h1[@class='page-title my-3']");

    public Secure(WebDriver driver, ActionsBot bot) {
        super(driver, bot);
    }


    public String readSuccessMessage(){
        return bot.getText(flashMessageLabel);
    }
}