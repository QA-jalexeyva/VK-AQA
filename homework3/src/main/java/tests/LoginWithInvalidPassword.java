package tests;

import pages.LoginPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class LoginWithInvalidPassword extends BaseTest {

    @Tag("Login")
    @Test
    public void TestLogin () {
        LoginPage Login = new LoginPage();
        Login.ValidEmail();
        Login.InvalidPassword();
        Login.ClickButton();
    }
}
