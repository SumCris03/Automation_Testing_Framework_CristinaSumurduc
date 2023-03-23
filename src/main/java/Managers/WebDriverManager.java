package Managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {

    public WebDriverManager(String webDriverType){
        this.WebDriverType=webDriverType;

    }
    private WebDriver driver;
    private String  WebDriverType;

    private WebDriver createDriver(){
        switch (WebDriverType) {
            case "CHROME":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--remote-allow-origins=*");
                System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
                driver = new ChromeDriver(chromeOptions);
                break;

            case "FIREFOX":
                System.setProperty("WebDriver.geckodriver","src/main/resources/drivers/geckodriver.exe");
                        driver= new FirefoxDriver();
                break;
            default:
                System.out.println("optiunea de web driver nu este valabila, Mai incearca");

        }
        return driver;

    }

    public WebDriver getDriver() {
        if (driver ==null){
            createDriver();

        }
        return driver;

    }
    public void closeDriver(){
        if(driver !=null){
            driver.close();
            System.out.println("Driver-ul a fost inchis");
        }
    }
}
