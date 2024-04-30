package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeAll
    public static void SetUpClass() {
        Configuration.baseUrl="https://ok.ru/";

    }
    @BeforeEach
    public void Setup() {
        open("/");
    }
    @AfterEach
    public void Close() {
        Selenide.closeWindow();
    }
}
