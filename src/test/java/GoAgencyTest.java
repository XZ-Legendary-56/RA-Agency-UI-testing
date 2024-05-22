import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.AgencyPage;
import pageObjects.MainPage;

import static com.codeborne.selenide.Selenide.sleep;

public class GoAgencyTest extends BaseTest {
    @Test
    // проверка перехода на страницу "Агенство" через шапку
    public void checkGoAgency(){
        MainPage mainPage = new MainPage();
        mainPage.pressAgency();
        sleep(1500);
        AgencyPage agencyPage = new AgencyPage();
        Assertions.assertTrue(agencyPage.check());
    }
}
