import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CheckingTitles extends TestBase {

    @ParameterizedTest
    @ValueSource(strings = {"Kemp Login Screen"})
    @DisplayName("Test verify if title of page sii portal is correct")
    @Tag("Regression")
    @Tag("sii_portal")
    @Order(1)
    void checkTitleSii(String title) {
        getDriver().get("https://siiportal.sii.pl/");
        getDriver().manage().window().maximize();
        String actualTitle = getDriver().getTitle();
        assertThat(title, equalTo(actualTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Onet – Jesteś na bieżąco"})
    @DisplayName("Test verify if title of page onet is correct")
    @Tag("Regression")
    @Tag("onet")
    @Order(2)
    void checkTitleOnet(String title) {
        getDriver().get("https://www.onet.pl/");
        getDriver().manage().window().maximize();
        String actualTitle = getDriver().getTitle();
        assertThat(title, equalTo(actualTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Kotuszkowo- blog o kotach"})
    @DisplayName("Test verify if title of page kotuszkowo is correct")
    @Tag("Regression")
    @Tag("Kotuszkowo")
    @Order(3)
    void checkTitleKotuszkowo(String title) {
        getDriver().get("http://kotuszkowo.pl/");
        getDriver().manage().window().maximize();
        String actualTitle = getDriver().getTitle();
        assertThat(title, equalTo(actualTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Filmweb - filmy takie jak Ty!"})
    @DisplayName("Test verify if title of page filmweb is correct")
    @Tag("Regression")
    @Tag("FilmWeb")
    @Order(4)
    void checkTitleFilmWeb(String title) {
        getDriver().get("https://www.filmweb.pl/");
        getDriver().manage().window().maximize();
        String actualTitle = getDriver().getTitle();
        assertThat(title, equalTo(actualTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = {"WebDriver :: Documentation for Selenium"})
    @DisplayName("Test verify if title of page selenium is correct")
    @Tag("Regression")
    @Tag("FilmWeb")
    @Order(5)
    void checkTitleSelenium(String title) {
        getDriver().get("https://www.selenium.dev/documentation/en/webdriver/");
        getDriver().manage().window().maximize();
        String actualTitle = getDriver().getTitle();
        assertThat(title, equalTo(actualTitle));
    }
}
