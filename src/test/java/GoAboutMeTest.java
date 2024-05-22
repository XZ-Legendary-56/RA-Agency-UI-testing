import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.AboutMePage;
import pageObjects.MainPage;

import static com.codeborne.selenide.Selenide.sleep;

public class GoAboutMeTest extends BaseTest {
    @Test
    // проверка перехода на страницу "Обо мне" через шапку
    public void checkGoAboutMe(){
        MainPage mainPage1 = new MainPage();
        mainPage1.pressAboutMe();
        sleep(1500);
        AboutMePage aboutMePage = new AboutMePage();
        Assertions.assertTrue(aboutMePage.check());
    }
}
