package swag.lab.all.tests;

import org.testng.annotations.Test;
import swag.lab.all.utility.BeforeAndAfterAll;
import swag.lab.all.utility.fun.InvalidAccauntFun;

public class InvalidLogINtest extends BeforeAndAfterAll {

    @Test
    public void InvalidLogInTest (){
        InvalidAccauntFun.LogInInvalidAccaunt(driver, wait);
    }



}
