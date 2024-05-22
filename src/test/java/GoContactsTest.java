import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.ContactsPage;
import pageObjects.MainPage;

import static com.codeborne.selenide.Selenide.sleep;

public class GoContactsTest extends BaseTest {
    @Test
    // проверка перехода на страницу "Контакты" через шапку
    public void checkGoContacts(){
        MainPage mainPage = new MainPage();
        mainPage.pressContacts();
        sleep(1500);
        ContactsPage contactsPage = new ContactsPage();
        Assertions.assertTrue(contactsPage.check());
    }
}
