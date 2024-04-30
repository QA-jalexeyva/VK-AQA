package tests;

import pages.LoginPage;
import pages.PersonalProfile;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class CheckPersonalProfile extends BaseTest {

    @Tag("PersonalProfile")
    @Test
    public void SeeUser() {
        LoginPage Login = new LoginPage();
        Login.ValidEmail();
        Login.ValidPassword();
        Login.ClickButton();
        PersonalProfile SeeUser = new PersonalProfile();
        SeeUser.OpenUser();
        sleep(5000);
    }
}
