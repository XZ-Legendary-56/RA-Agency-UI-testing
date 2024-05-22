import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.CasesPage;
import pageObjects.MainPage;

import static com.codeborne.selenide.Selenide.sleep;

public class GoCasesTest extends BaseTest {
    @Test
    // проверка перехода на страницу "Кейсы" через шапку
    public void checkGoCases(){
        MainPage mainPage = new MainPage();
        mainPage.pressCases();
        sleep(1500);
        CasesPage casesPage = new CasesPage();
        Assertions.assertTrue(casesPage.check());
    }
}
