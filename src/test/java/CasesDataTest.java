import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.MainPage;

import static com.codeborne.selenide.Selenide.sleep;

public class CasesDataTest extends BaseTest {
    @Test
    // проверка появления данных кейса при наведении курсора
    public void checkCasesData(){
        MainPage mainPage = new MainPage();
        mainPage.pressSignUpConsult();
        mainPage.pressSend();
        sleep(1500);
        mainPage.hoverCursorCase();
        sleep(1000);
        Assertions.assertTrue(mainPage.checkCasesData());
    }
}
