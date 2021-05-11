import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Tag("Regression")
public class CheckingTitlesTest extends TestBase {

    @ParameterizedTest
    @ValueSource(strings = {"Kemp Login Screen"})
    @DisplayName("Test verify if title of page sii portal is correct")
    @Tag("sii_portal")

    void checkTitleSii(String title) {
        getDriver().get("https://siiportal.sii.pl/");
        getDriver().manage().window().maximize();
        String actualTitle = getDriver().getTitle();
        assertThat(title, equalTo(actualTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Onet – Jesteś na bieżąco"})
    @DisplayName("Test verify if title of page onet is correct")
    @Tag("onet")

    void checkTitleOnet(String title) {
        getDriver().get("https://www.onet.pl/");
        getDriver().manage().window().maximize();
        String actualTitle = getDriver().getTitle();
        assertThat(title, equalTo(actualTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Kotuszkowo- blog o kotach"})
    @DisplayName("Test verify if title of page kotuszkowo is correct")
    @Tag("Kotuszkowo")

    void checkTitleKotuszkowo(String title) {
        getDriver().get("http://kotuszkowo.pl/");
        getDriver().manage().window().maximize();
        String actualTitle = getDriver().getTitle();
        assertThat(title, equalTo(actualTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Filmweb - filmy takie jak Ty!"})
    @DisplayName("Test verify if title of page filmweb is correct")
    @Tag("FilmWeb")

    void checkTitleFilmWeb(String title) {
        getDriver().get("https://www.filmweb.pl/");
        getDriver().manage().window().maximize();
        String actualTitle = getDriver().getTitle();
        assertThat(title, equalTo(actualTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = {"WebDriver :: Documentation for Selenium"})
    @DisplayName("Test verify if title of page selenium is correct")
    @Tag("selenium")

    void checkTitleSelenium(String title) {
        getDriver().get("https://www.selenium.dev/documentation/en/webdriver/");
        getDriver().manage().window().maximize();
        String actualTitle = getDriver().getTitle();
        assertThat(title, equalTo(actualTitle));
    }
}
