package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Feature("Auth")
@Microservice("Auth")
@Owner("c5-kateAlmazova")
public class GoogleTest {

    @Test
    @AllureId("3133")
    @JiraIssue("AE-1")
    @Story("External auth")
    @Tags({@Tag("web"), @Tag("smoke")})
    @DisplayName("Auth via Google")
    public void testAuth() {
        step("Open main page");
        step("Log in as a user 'Ms Random'", () -> {
            step("Enter login 'random-user'");
            step("Enter password 'random-password'");
            step("Click on Button 'Log in'");
        });
        step("Verify that profile data was updated from Google account", () -> {
            step("Verify that Name is Ms Random");
            step("Verify that Avatar matches with attach");
        });
    }
}
