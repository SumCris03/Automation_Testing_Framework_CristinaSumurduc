import Managers.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class TestRunner {
    public static void main(String[] args ) {
        WebDriverManager webDriverManager=new WebDriverManager ("CHROME");
        webDriverManager.getDriver().get("https://demo.opencart.com/");

        WebElement myAcountButton = webDriverManager.getDriver().findElement(By.xpath("//*[@id=\"carousel-banner-0\"]/div[2]/div[2]"));
        myAcountButton.click();

        WebElement registerButton = webDriverManager.getDriver().findElement(By.xpath("//*[@id=\"carousel-banner-0\"]/button[2]"));
        registerButton.click();


        WebElement firstNameInput =webDriverManager.getDriver().findElement(By.name("common-home-firstNameInput"));
        firstNameInput.sendKeys("First Text Input");

        try {
            sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        webDriverManager.getDriver().close();


    }
}
