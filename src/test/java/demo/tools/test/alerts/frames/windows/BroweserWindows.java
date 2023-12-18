package demo.tools.test.alerts.frames.windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BroweserWindows {
    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://demoqa.com/browser-windows";

    }

    @Test (priority = 1, description = "Open new tab")
    public void newTab ()  throws InterruptedException {

        driver.get(baseURL);

        //Tab button
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(2000);
        //List of tabs
        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        //Swich to new tab
        driver.switchTo().window(browserTabs.get(1));
        //Check is it correct page
        String myURL = driver.getCurrentUrl();
        System.out.println(myURL);
        driver.findElement(By.xpath("//h1[@id='sampleHeading']")).isDisplayed();
        //Close tab and get back
        driver.close();
        driver.switchTo().window(browserTabs.get(0));


       // Assert.assertEquals();






    }

    @AfterTest
    public void endTest(){
        driver.quit();
    }
}
