import org.junit.jupiter.api.Test;
import pageObjects.MainPage;

import static com.codeborne.selenide.Selenide.sleep;

public class SignUpConsultTest extends BaseTest {
    private final static String NAME = "test_consult";
    private final static String PHONE = "89281234567";
    private final static String EMAIL = "pochta@mail.ru";

    @Test
    // проверка работы кнопки записаться на консультацию и отправки формы
    public void checkGoSeminar(){
        MainPage mainPage = new MainPage();
        mainPage.pressSignUpConsult();
        sleep(1500);
        mainPage.signUpForm(NAME, PHONE, EMAIL);
        sleep(1000);
        mainPage.pressSend();
    }
}
