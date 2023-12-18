package demo.tools.test.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Links {
    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://demoqa.com/links";

    }

    @Test
    public void Links ()  throws InterruptedException {

        driver.get(baseURL);
        String link = driver.findElement(By.id("simpleLink")).getAttribute("href");
        System.out.println(link);
        Assert.assertEquals(link, "https://demoqa.com/");




        //Thread.sleep(2000);


    }

    @AfterTest
    public void endTest(){
        driver.quit();
    }

}
