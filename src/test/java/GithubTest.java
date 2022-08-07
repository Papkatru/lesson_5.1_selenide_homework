import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class GithubTest {

    @BeforeAll
    public static void testBase(){
        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    @DisplayName("Проверка что в selenide wiki есть упоминание JUnit5")
    public void softAssertionTest(){
        open("/selenide/selenide");
        GithubPage.openWikiPage();
        GithubPage.openSoftAssertionPage();
    }
}
