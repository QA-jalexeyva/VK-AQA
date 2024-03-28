package homework2;

import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;


// позитивный (добрый) тест открытия страницы с qr-кодом
// через главную страницу авторизации

public class qr_code {

    @Test
    public void qr() {
        open("https://ok.ru/");                     // открыть сайт
        $(By.className("qr-button-label"))          // кнопка для перехода к qr-коду
                .click();                           // нажать
        sleep(2_000);                               // да-да, 2 секунды, даааааа, да
    }
}
