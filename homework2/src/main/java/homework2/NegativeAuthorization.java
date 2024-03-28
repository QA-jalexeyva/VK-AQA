package homework2;

import org.junit.Test;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class NegativeAuthorization {

    @Test
    public void Authorization() {
        open("https://ok.ru/");       // open site
        $(byName("st.email"))                         // in login field:
                .setValue("technopol343");            // invalid login
        $(byName("st.password"))                      // in password field
                .setValue("technopolisPassword")      // invalid password
                .pressEnter();                        // press Enter
    }
}
