package swag.lab.all.utility.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import swag.lab.all.utility.page_objeckt.PlpPageObjekt;
import swag.lab.all.utility.page_objeckt.ValidLogInPageObjeckt;

public class InvalidAccauntFun {

    public static void LogInInvalidAccaunt (WebDriver driver, WebDriverWait wait) {

        driver.findElement(ValidLogInPageObjeckt.userNameFild).click();
        driver.findElement(ValidLogInPageObjeckt.userNameFild).sendKeys(ValidLogInPageObjeckt.invalidPasseword);
        driver.findElement(ValidLogInPageObjeckt.passwordNameFild).click();
        driver.findElement(ValidLogInPageObjeckt.passwordNameFild).sendKeys(ValidLogInPageObjeckt.invalidPasseword);
        driver.findElement(ValidLogInPageObjeckt.logINFild).click();
        String errorMessage = driver.findElement(By.tagName("h3")).getText();

        Assert.assertEquals(errorMessage, ValidLogInPageObjeckt.invalidMessage);



    }

}
