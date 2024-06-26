package sauceDemoTests.wrapMenuTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sauceDemo.steps.LoginSteps;
import sauceDemoTests.BaseTest;

@DisplayName("Tests on 'Logout' button in the wrap menu")
public class LogoutUsersTest extends BaseTest {

    @DisplayName("Check 'Logout' button in the wrap menu")
    @Test
    public void checkLogoutBtn() {
        LoginSteps.open("https://www.saucedemo.com")
                .waitPageLoading()
                .successfulLogin(usernameS, passwordS)
                .clickOnLoginBtnSuccessful()
                .checkURL("https://www.saucedemo.com/inventory.html")
                .checkStaticElementsOnAllItemsPage()
                .clickOnWrapMenu()
                .clickOnLogoutBtn()
                .checkURL("https://www.saucedemo.com/");
    }
}
