package loginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.testng.annotations.Test;
import pages.Login;

public class LoginTest {
    final Login login = new Login();
    @Test
    public void LoginWithValidCredentials(){
        login.LoginValidUser();



    }
}
