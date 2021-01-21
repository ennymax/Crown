package CROWN.EKEDC;

import CROWN.Base.TestBase;
import CROWN.utility.Login;
import CROWN.utility.Utility;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.io.IOException;

public class Login_With_Wrong_Password extends TestBase {

    @Test
    public void LOGIN_WITH_REGISTERED_EMAIL() throws IOException, InterruptedException {
        Login login = new Login(driver);

        login.Login_with_Wrong_PasswordEKEDC(driver);
    }
}
