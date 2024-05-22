import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import pageObjects.MainPage;

import static com.codeborne.selenide.Selenide.sleep;

abstract public class BaseTest {

    private final static String BASE_URL = "https://localhost:7165/";

    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.webdriverLogsEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
    }

    // установка браузера
    @BeforeAll
    public static void init(){
        setUp();
    }

    // вход на главную страницу сайта
    @BeforeEach
    public void enterSite(){
        MainPage mainPage = new MainPage(BASE_URL);
        sleep(1500);
    }

    // возвращение на главную страницу
    @AfterEach
    public void backToMain(){
        MainPage mainPage = new MainPage(BASE_URL);
        sleep(1500);
    }

    // закрытие браузера
    @AfterAll
    public static void tearDown(){
        Selenide.closeWebDriver();
    }
}
