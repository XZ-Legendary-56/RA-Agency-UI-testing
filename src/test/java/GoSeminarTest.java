import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.MainPage;
import pageObjects.SeminarPage;

import static com.codeborne.selenide.Selenide.sleep;

public class GoSeminarTest extends BaseTest {
    @Test
    // проверка перехода на страницу "Семинары" через шапку
    public void checkGoSeminar(){
        MainPage mainPage = new MainPage();
        mainPage.pressSeminar();
        sleep(1500);
        SeminarPage seminarPage = new SeminarPage();
        Assertions.assertTrue(seminarPage.check());
    }
}
