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
import java.util.ArrayList;
import java.util.List;

public class DatePicer {
    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://demoqa.com/date-picker";

    }

    @Test
    public void DatePicer ()  throws InterruptedException {

        driver.get(baseURL);

        driver.findElement(By.id("datePickerMonthYearInput")).click();
        driver.findElement(By.xpath("//option[contains(text(),'March')]")).click();
        driver.findElement(By.xpath("//option[contains(text(),'1987')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'14')]")).click();

        String myDateSelected = driver.findElement(By.id("datePickerMonthYearInput")).getAttribute("value");
        Assert.assertEquals(myDateSelected,"03/14/1987");

        Thread.sleep(1000);


    }

    @AfterTest
    public void endTest(){
        driver.quit();
    }
}
