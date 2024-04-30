package tests;

import pages.LoginPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class SearchPageViaTheLoginPage extends BaseTest {

    @Tag("Search")
    @Test
    public void TestSearch() {
        LoginPage Search = new LoginPage();
        Search.Search();
        sleep(2000);
    }
}
