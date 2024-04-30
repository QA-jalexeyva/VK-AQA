package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final static By LoginButton = By.xpath(".//input[@data-l='t,sign_in']");
    private final static By UserNameButton = By.xpath(".//input[@data-l='t,login']");
    private final static By PasswordButton = By.xpath(".//input[@data-l='t,password']");
    private final static By PhoneNumberButton = By.xpath(".//input[@data-l='t,phone'");
    private final static By Search = By.xpath(".//input[@name='st.query']");

    public void ValidEmail() {
        $(UserNameButton).shouldBe(visible).sendKeys("technopol34");
    }

    public void ValidPassword() {
        $(PasswordButton)
                .shouldBe(visible)
                .sendKeys("technopolisPassword");
    }

    public void InvalidPassword() {
        $(PasswordButton)
                .shouldBe(visible)
                .sendKeys("technopolisPassword333");
    }

    public void NonExistentPhoneNumber() {
        $(PhoneNumberButton)
                .shouldBe(visible)
                .sendKeys("60000000000000000");
    }

    public void Search() {
        $(Search)
                .shouldBe(visible)
                .pressEnter();
    }

    public void ClickButton() {
        $(LoginButton)
                .shouldBe(visible).click();
    }


}
