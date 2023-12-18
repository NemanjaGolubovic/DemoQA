package swag.lab.all.utility.fun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import swag.lab.all.utility.page_objeckt.ValidLogInPageObjeckt;
import swag.lab.all.utility.page_objeckt.PlpPageObjekt;

public class AccauntFun {
    public static void LogInValidAccaunt (WebDriver driver, WebDriverWait wait) {

        driver.findElement(ValidLogInPageObjeckt.userNameFild).click();
        driver.findElement(ValidLogInPageObjeckt.userNameFild).sendKeys(ValidLogInPageObjeckt.validUser);
        driver.findElement(ValidLogInPageObjeckt.passwordNameFild).click();
        driver.findElement(ValidLogInPageObjeckt.passwordNameFild).sendKeys(ValidLogInPageObjeckt.validPasseword);
        driver.findElement(ValidLogInPageObjeckt.logINFild).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(PlpPageObjekt.producktText));


    }
}
