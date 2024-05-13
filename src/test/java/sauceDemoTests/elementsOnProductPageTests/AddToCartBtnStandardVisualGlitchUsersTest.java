package sauceDemoTests.elementsOnProductPageTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import sauceDemo.steps.LoginPageSteps;

public class AddToCartBtnStandardVisualGlitchUsersTest {

    @ParameterizedTest
    @CsvSource(value = {"standard_user",
            "visual_user",
            "performance_glitch_user"})
    public void addToCartSuccessfulTest(String username) {
        LoginPageSteps.open("https://www.saucedemo.com")
                .waitPageLoading()
                .successfulLogin(username, "secret_sauce")
                .clickOnLoginBtnSuccessful()
                .checkURL("https://www.saucedemo.com/inventory.html")
                .clickOnAddBtnSuccessful()
                .checkClickOnAddBtnSuccessful()
                .clickOnWrapMenu()
                .clickOnResetAppStateBtn();
    }
}