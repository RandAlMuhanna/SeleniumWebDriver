package tests.testng.lamdaTesting;
import org.testng.annotations.Test;
import pages.lambdaTesting.Registration;
import tests.testng.Tests;

public class FluentAccountRegistration extends Tests {

    @Test
    public void register() {
        String registration = String.valueOf(new Registration(driver, bot)
                .goTo()
                .successfulRegister("Rand", "AlMuhanna", "Rand.y.almuhanna@gmail.com", "0536608515", "RandQAEngineer", "RandQAEngineer"));

    }
    }