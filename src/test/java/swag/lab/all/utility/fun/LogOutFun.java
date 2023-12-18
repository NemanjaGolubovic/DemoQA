package swag.lab.all.utility.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOutFun {

    public static void LogOut (WebDriver driver, WebDriverWait wait){

        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();
     //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")))



    }
}
