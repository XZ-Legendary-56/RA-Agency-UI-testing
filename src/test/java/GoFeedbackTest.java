import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.FeedbackPage;
import pageObjects.MainPage;

import static com.codeborne.selenide.Selenide.sleep;

public class GoFeedbackTest extends BaseTest {
    @Test
    // проверка перехода на страницу "Отзывы" через шапку
    public void checkGoFeedback(){
        MainPage mainPage = new MainPage();
        mainPage.pressFeedback();
        sleep(1500);
        FeedbackPage feedbackPage = new FeedbackPage();
        Assertions.assertTrue(feedbackPage.check());
    }
}
