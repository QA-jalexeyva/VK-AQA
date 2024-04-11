package homework2;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;


// тест поисковых запросов на главной странице авторизации

public class search {

    @Test
    public void search () {
        open("https://ok.ru/");     // открыть сайт
        $(By.name("st.query"))                      // найти поле поиска
                .setValue("Мистер Дудец")           // ввести значение
                .pressEnter();                      // нажать кнопку Enter
        sleep(4_000);                    // эххх, хорошая мелодия.....
    }                                              // я заплакал

    @AfterAll
    public void after () {
        clearBrowserLocalStorage();
        clearBrowserCookies();
    }
}
