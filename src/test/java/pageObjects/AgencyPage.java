package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class AgencyPage {

    // Айдентика страницы "Агенство"
    private final SelenideElement AGENCY_IDENT = $x("//h2[text()='АГЕНТСТВО']");
    private final SelenideElement COMMUNITY_IDENT = $x("//h2[text()='СООБЩЕСТВО']");

    // контструктор проверяет при создании объекта, его принадлженость к данному типу страницы
    public AgencyPage() {
        check();
    }

    // проверка подлинности страницы
    public boolean check() {
        AGENCY_IDENT.shouldBe(visible);
        COMMUNITY_IDENT.shouldBe(visible);
        return true;
    }
}
