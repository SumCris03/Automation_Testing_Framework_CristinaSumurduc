package stepDefinitions;

import ContextManagers.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class RegisterSteps {
    private TestContext testContext;
    public RegisterSteps (TestContext Context){
        testContext=Context;

    }
    @Given("^\"([^\"]*)\" is accesed$")
    public void isAccesed(String adresaURL){
        testContext.getWebDriverManager().getDriver().get(adresaURL);
    }

    @Then("^\"([^\"]*)\" is present within the current url$")
    public void isPresentWithinTheCurrentUrl(String urlKeyWord) {
        Assertions.assertTrue(testContext.getWebDriverManager().contains(urlKeyWord));

    }
}
