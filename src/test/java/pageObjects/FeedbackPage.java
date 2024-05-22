package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class FeedbackPage {

    // Айдентика страницы "Отзывы"
    private final SelenideElement FEEDBACK_IDENT = $x("//p[text()='ОТЗЫВЫ']");
    private final SelenideElement VIDEO_FEEDBACK = $x("//p[text()='ВИДЕО-ОТЗЫВЫ']");

    // контструктор проверяет при создании объекта, его принадлженость к данному типу страницы
    public FeedbackPage() {
        check();
    }

    // проверка подлинности страницы
    public boolean check() {
        FEEDBACK_IDENT.shouldBe(visible);
        VIDEO_FEEDBACK.shouldBe(visible);
        return true;
    }
}
