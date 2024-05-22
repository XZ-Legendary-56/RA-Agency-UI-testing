package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class AboutMePage {

    // Айдентика страницы "Обо мне"
    private final SelenideElement PARAGRAPH_ABOUT = $x("//p[@class='paragraph-about']");
    private final SelenideElement IMAGE_AGENT = $x("//img[@alt='photo-about']");

    // контструктор проверяет при создании объекта, его принадлженость к данному типу страницы
    public AboutMePage() {
        check();
    }

    // проверка подлинности страницы
    public boolean check() {
        PARAGRAPH_ABOUT.shouldBe(visible);
        IMAGE_AGENT.shouldBe(visible);
        return true;
    }
}
