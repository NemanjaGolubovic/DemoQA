package swag.lab.all.tests;

import org.testng.annotations.Test;
import swag.lab.all.utility.BeforeAndAfterAll;
import swag.lab.all.utility.fun.AccauntFun;
import swag.lab.all.utility.fun.LogOutFun;

public class ValidLogiInLogOutTest extends BeforeAndAfterAll {

    @Test
    public void LogInLogOutTest(){

        AccauntFun.LogInValidAccaunt(driver,wait);
        LogOutFun.LogOut(driver, wait);



    }

}
