package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class CasesPage {

    // Айдентика страницы "Кейсы"
    private final SelenideElement CASES_IDENT = $x("//div[text()='КЕЙСЫ']");

    // контструктор проверяет при создании объекта, его принадлженость к данному типу страницы
    public CasesPage() {
        check();
    }

    // проверка подлинности страницы
    public boolean check() {
        CASES_IDENT.shouldBe(visible);
        return true;
    }
}
