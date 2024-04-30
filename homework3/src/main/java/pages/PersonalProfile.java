package pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class PersonalProfile extends BasePage {
    public void OpenUser() {
        $(UserPage).shouldBe(visible).click();
    }
}
