package swag.lab.all.utility.page_objeckt;

import org.openqa.selenium.By;

public class ValidLogInPageObjeckt {
    public static By userNameFild = By.id("user-name");
    public static By passwordNameFild = By.id("password");
    public static String validUser = "standard_user";
    public static String validPasseword = "secret_sauce";
    public static String invalidUser = "standard_user";
    public static String invalidPasseword = "secret_sauce";
    public static By logINFild = By.id("login-button");
    public static String invalidMessage = "Epic sadface: Username and password do not match any user in this service";

}
