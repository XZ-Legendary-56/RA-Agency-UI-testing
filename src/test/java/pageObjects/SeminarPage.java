package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class SeminarPage {

    // Айдентика для страницы "Семинары"
    private final SelenideElement SEMINAR_HEADER = $x("//h2[text()='СЕМИНАР ДЛЯ СОБСТВЕННИКОВ НЕДВИЖИМОСТИ']");
    private final SelenideElement SEMINAR_DATE = $x("//h3[text()='Место и дата проведения']");

    // Форма записи на семинар
    // поле "Имя"
    private final SelenideElement FIELD_NAME = $x("//input[contains(@class, 'field') and @name='Name']");
    // поле "Телефон"
    private final SelenideElement FIELD_PHONE = $x("//input[contains(@class, 'field') and @name='Phone']");
    // поле "Почта"
    private final SelenideElement FIELD_EMAIL = $x("//input[contains(@class, 'field') and @name='Email']");
    // кнопка "Отправить"
    private final SelenideElement BTN_SEND = $x("//input[@value='Отправить' and @type='button']");

    public SeminarPage() {
        check();
    }

    // нажать кнопку отправки формы
    public void pressSend(){
        BTN_SEND.shouldBe(visible).click();
    }
    // заполнить форму
    // ввести имя
    public void enterName(String name){
        FIELD_NAME.shouldBe(visible).setValue(name);
    }
    // ввести телефон
    public void enterPhone(String phone){
        FIELD_PHONE.shouldBe(visible).setValue(phone);
    }
    // ввести email
    public void enterEmail(String email){
        FIELD_EMAIL.shouldBe(visible).setValue(email);
    }
    public void signUpForm(String name, String phone, String email){
        enterName(name);
        enterPhone(phone);
        enterEmail(email);
    }

    // проверка подлинности страницы
    public boolean check() {
        SEMINAR_HEADER.shouldBe(visible);
        SEMINAR_DATE.shouldBe(visible);
        return true;
    }
}