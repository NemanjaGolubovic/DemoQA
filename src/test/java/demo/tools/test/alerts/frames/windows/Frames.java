package demo.tools.test.alerts.frames.windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Frames {
    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://demoqa.com/frames";

    }

    @Test
    public void frames ()  throws InterruptedException {

        driver.get(baseURL);

        //Swich to Frame1
        driver.switchTo().frame("frame1");
        driver.findElement(By.xpath("//h1[@id='sampleHeading']")).isDisplayed();
        driver.switchTo().defaultContent();



    }

    @AfterTest
    public void endTest(){
        driver.quit();
    }
}
