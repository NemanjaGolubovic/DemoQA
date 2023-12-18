package demo.tools.test.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Buttons {
    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://demoqa.com/buttons";

    }

    @Test
    public void Buttons ()  throws InterruptedException {

        driver.get(baseURL);
        Actions act = new Actions(driver);
        WebElement buttonToClick = driver.findElement(By.id("doubleClickBtn"));
        act.doubleClick(buttonToClick).perform();
        driver.findElement(By.id("doubleClickMessage")).isDisplayed();

        //Rightclick
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(elementLocator).perform();
        driver.findElement(By.id("rightClickMessage")).isDisplayed();

        //Dynamic click
        //driver.findElement(By.xpath(""))


    }

    @AfterTest
    public void endTest(){
        driver.quit();
    }
}
