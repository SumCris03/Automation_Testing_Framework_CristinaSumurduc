package stepDefinitions;

import ContextManagers.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class homePageSteps {
    private TestContext testContext;
    private HomePage homePage;

    public homePageSteps(TestContext testContext) {
        this.testContext = testContext;
        homePage = new HomePage(testContext.getWebDriverManager().getDriver());
    }

    @When("^My account button is clicked$")
    public void myaccountbuttoniscked() {
        homePage.clickOnMyAccountBtn();

    }

    @And("^Register button is clicked$")
    public void registerButtonIsClicked() {


    }
}