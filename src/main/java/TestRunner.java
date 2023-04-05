import Managers.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

import static java.lang.Thread.sleep;

public class TestRunner {
    public static void main(String[] args ) throws InterruptedException {
        WebDriverManager webDriverManager=new WebDriverManager ("CHROME");
        webDriverManager.getDriver().get("https://demo.opencart.com/");

        HomePage homePage= new HomePage(webDriverManager.getDriver());
        homePage.navigateToRegisterPage();

        RegisterPage registerPage = new RegisterPage(webDriverManager.getDriver());
        registerPage.fillInTheRegisterForm("Maria","Palea", "maria.palea@gmail.md","123456789");

        Thread.sleep(1000000);



        webDriverManager.getDriver().close();


    }
}
