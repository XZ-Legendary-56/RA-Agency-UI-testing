package pageObjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class MainPage {

    // Шапка страницы
    // кнопка "Главная страница" в шапке
    private final SelenideElement MAIN_PAGE_H = $x("//a[@href='/home']");
    // кнопка "Обо мне" в шапке
    private final SelenideElement ABOUT_ME_H = $x("//a[@href='/about']");
    // кнопка "Агентство" в шапке
    private final SelenideElement AGENCY_H = $x("//a[@href='/agency']");
    // кнопка "Семинары" в шапке
    private final SelenideElement SEMINAR_H = $x("//a[@href='/seminars']");
    // кнопка "Кейсы" в шапке
    private final SelenideElement CASES_H = $x("//a[@href='/cases']");
    // кнопка "Отзывы" в шапке
    private final SelenideElement FEEDBACK_H = $x("//a[@href='/feedback']");
    // кнопка "Контакты" в шапке
    private final SelenideElement CONTACTS_H = $x("//a[@href='/contacts']");

    // Айдентика главной страницы
    // заголовочный текст идентифицирующий главную страницу
    private final SelenideElement MAIN_PAGE_IDENT = $x("//div[@class='heading-title']");
    // изображение агента на главной странице
    private final SelenideElement IMAGE_AGENT = $x("//img[@alt='photo-about']");

    // кнопка "Запись на консультацию"
    private final SelenideElement BTN_SIGNUP_CONSULT = $x("//a[@class='consultation-btn']");
    // изображение кейсов
    private final SelenideElement CASES_IMAGES = $x("//img[contains(@alt,'Image 14')]");
    // данные кейса
    private final SelenideElement CASES_DATA = $x("//div[@class='car-text-block']");

    // Форма записи на консультацию
    // поле "Имя"
    private final SelenideElement FIELD_NAME = $x("//input[contains(@class, 'field') and @name='Name']");
    // поле "Телефон"
    private final SelenideElement FIELD_PHONE = $x("//input[contains(@class, 'field') and @name='Phone']");
    // поле "Почта"
    private final SelenideElement FIELD_EMAIL = $x("//input[contains(@class, 'field') and @name='Email']");
    // кнопка "Отправить"
    private final SelenideElement BTN_SEND = $x("//input[@value='Отправить' and @type='button']");


    // Конструктор проверяющий, подлинность страницы
    public MainPage() {
        check();
    }
    // Конструктор входа на страницу
    public MainPage(String url){
        Selenide.open(url);
        sleep(1000);
    }

    // нажать кнопку "Главная страница"
    public void pressMainPage(){
        MAIN_PAGE_H.shouldBe(visible).click();
    }
    // нажать кнопку "Обо мне"
    public void pressAboutMe(){
        ABOUT_ME_H.shouldBe(visible).click();
    }
    // нажать кнопку "Агенство"
    public void pressAgency(){
        AGENCY_H.shouldBe(visible).click();
    }
    // нажать кнопку "Семинар"
    public void pressSeminar(){
        SEMINAR_H.shouldBe(visible).click();
    }
    // нажать кнопку "Кейсы"
    public void pressCases(){
        CASES_H.shouldBe(visible).click();
    }
    // нажать кнопку "Отзывы"
    public void pressFeedback(){
        FEEDBACK_H.shouldBe(visible).click();
    }
    // нажать кнопку "Контакты"
    public void pressContacts(){
        CONTACTS_H.shouldBe(visible).click();
    }

    // нажать кнопку "Запись на консультацию"
    public void pressSignUpConsult(){
        BTN_SIGNUP_CONSULT.shouldBe(visible).click();
    }
    // навести курсор на карточку кейса
    public void hoverCursorCase(){
        CASES_IMAGES.shouldBe(visible).hover();
    }

    // проверка появления данных кейса
    public boolean checkCasesData(){
        CASES_IMAGES.shouldBe(visible);
        return true;
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
    public boolean checkSending(){
        if (FIELD_NAME.getValue().equals("") && FIELD_PHONE.getValue().equals("") && FIELD_EMAIL.getValue().equals(""))
            return true;
        else return false;
    }

    // проверка подлинности страницы
    public boolean check() {
        MAIN_PAGE_IDENT.shouldBe(visible);
        IMAGE_AGENT.shouldBe(visible);
        return true;
    }
}