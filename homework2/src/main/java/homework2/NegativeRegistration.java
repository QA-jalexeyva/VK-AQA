package homework2;

import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class NegativeRegistration {

    @Test
    public void abdv() {
        open("https://ok.ru/");      // открыть сайт
        $(By.linkText("Зарегистрироваться"))         // найти текст == "Зарегистрироваться"
                .click();                            // нажать на найденный текст
        $(By.name("st.r.phone"))                     // в поле ввода номера телефона
                .setValue("+700000000000")           // вести невалидный номер
                .pressEnter();                       // нажать кнопку Enter
    }
}