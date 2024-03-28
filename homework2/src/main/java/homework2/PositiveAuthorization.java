package homework2;

import org.junit.Test;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PositiveAuthorization {

    @Test
    public void Authorization() {
        open("https://ok.ru/");       // open site
        $(byName("st.email"))                         // in login field
                .setValue("technopol34");             // valid login
        $(byName("st.password"))                      // in password field
                .setValue("technopolisPassword")      // valid password
                .pressEnter();                        // press Enter
    }
}
