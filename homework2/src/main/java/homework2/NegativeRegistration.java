package homework2;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class NegativeRegistration {

    @Test
    public void abdv() {
        open("https://ok.ru/");      // открыть сайт
        $(By.linkText("Зарегистрироваться"))         // найти текст == "Зарегистрироваться"
                .click();                            // нажать на найденный текст
        $(By.name("st.r.phone"))                     // в поле ввода номера телефона
                .setValue("+700000000000")           // ввести невалидный номер
                .pressEnter();                       // нажать кнопку Enter
    }
    @AfterAll
    public void after () {
        clearBrowserLocalStorage();
        clearBrowserCookies();
    }
}