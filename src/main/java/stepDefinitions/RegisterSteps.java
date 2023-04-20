package stepDefinitions;

import ContextManagers.TestContext;
import cucumber.api.java.en.Given;

public class RegisterSteps {
    private TestContext testContext;
    public RegisterSteps (TestContext Context){
        testContext=Context;

    }
    @Given("^\"([^\"]*)\" is accesed$")
    public void isAccesed(String adresaURL){
        testContext.getWebDriverManager().getDriver().get(adresaURL);
    }
}
