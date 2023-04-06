import Managers.WebDriverManager;
import org.junit.jupiter.api.*;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class JunitPractice {
    WebDriverManager webDriverManager=new WebDriverManager ("CHROME");
    @BeforeEach
    public void beforeTestprocedures(){
        webDriverManager.getDriver().get("https://demo.opencart.com/");

    }
@AfterEach
public void afterTestInstructions(){
    webDriverManager.getDriver().close();
}

    @Test
    @DisplayName("Adresa URL a paginii Register este disponibila din pagina HOME")
    public void verifyIfTheregisterPageIsAccesible(){

        HomePage homePage= new HomePage(webDriverManager.getDriver());
        homePage.navigateToRegisterPage();


boolean urlIsValid = webDriverManager.getDriver().getCurrentUrl().contains("register");
Assertions.assertTrue(urlIsValid, "Adresa URL nu este valida");



    }
    @Test
    @DisplayName("Register page elements are displayed")
    public void registerPageElementsaredisplayed(){

        HomePage homePage= new HomePage(webDriverManager.getDriver());
        homePage.navigateToRegisterPage();

RegisterPage registerPage = new RegisterPage(webDriverManager.getDriver());
Assertions.assertTrue(registerPage.allTheElementsAreDisplayed(),"Cel putin unul dintre elemente nu a fost afisat");




    }
}
