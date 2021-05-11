import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeAll
    static void connect() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void SetUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void TearDown() {
        driver.quit();
    }
}
