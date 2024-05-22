package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ContactsPage {

    // Айдентика страницы "Контакты"
    private final SelenideElement CONTACTS_IDENT = $x("//p[text()='КОНТАКТЫ']");
    private final SelenideElement CONTACTS_ADRESS = $x("//div[@class='contacts-adress']");
    private final SelenideElement CONTACTS_EMAIL = $x("//div[@class='contacts-email']");

    // конструктор проверяет при создании объекта, его принадлженость к данному типу страницы
    public ContactsPage() {
        check();
    }

    // проверка подлинности страницы
    public boolean check() {
        CONTACTS_IDENT.shouldBe(visible);
        CONTACTS_ADRESS.shouldBe(visible);
        CONTACTS_EMAIL.shouldBe(visible);
        return true;
    }
}
