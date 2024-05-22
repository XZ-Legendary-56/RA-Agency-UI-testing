import org.junit.jupiter.api.Test;
import pageObjects.MainPage;
import pageObjects.SeminarPage;

import static com.codeborne.selenide.Selenide.sleep;

public class SignUpSeminarTest extends BaseTest {
    private final static String NAME = "test_seminar";
    private final static String PHONE = "89281234567";
    private final static String EMAIL = "pochta@mail.ru";

    @Test
    // проверка работы кнопки записаться на семинар и отправки формы
    public void checkGoSeminar(){
        MainPage mainPage = new MainPage();
        mainPage.pressSeminar();
        SeminarPage seminarPage = new SeminarPage();
        sleep(1500);
        seminarPage.signUpForm(NAME, PHONE, EMAIL);
        sleep(1000);
        seminarPage.pressSend();
    }
}
