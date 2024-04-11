package homework2;

import com.codeborne.selenide.selector.ByText;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class NegativeAuthorization {

    @Test
    public void Authorization() {
        open("https://ok.ru/");       // open site
        $(byName("st.email"))                         // in login field:
                .setValue("technopol343");            // invalid login
        $(byName("st.password"))                      // in password field
                .setValue("technopolisPassword")      // invalid password
                .pressEnter();                        // press Enter;
        $(new ByText("Неправильно указан логин и/или пароль"))
                .shouldBe(visible
                        .because("Не отображается элемент на странице"));
    }
    @AfterAll
    public void after () {
        clearBrowserLocalStorage();
        clearBrowserCookies();
    }
}
