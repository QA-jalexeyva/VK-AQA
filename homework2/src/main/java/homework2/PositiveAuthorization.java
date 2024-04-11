package homework2;

import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.By;

import javax.security.auth.login.LoginException;
import java.security.AuthProvider;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class PositiveAuthorization {

    @Test
    public void Authorization() {
        open("https://ok.ru/");       // open site
        $(byName("st.email"))                         // in login field
                .setValue("technopol34");             // valid login
        $(byName("st.password"))                      // in password field
                .setValue("technopolisPassword")      // valid password
                .pressEnter();
    }
    @AfterAll
    public void after () {
        clearBrowserLocalStorage();
        clearBrowserCookies();
    }
}