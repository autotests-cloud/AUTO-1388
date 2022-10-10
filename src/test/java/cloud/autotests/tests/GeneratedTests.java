package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("dsdsd")
    void generatedTest() {
        step("Open 'https://miro.com'", () -> {
            step("// todo: just add selenium action");
        });

        step("Click button login", () -> {
            step("// todo: just add selenium action");
        });

        step("Checking logo miro is visible", () -> {
            step("// todo: just add selenium action");
        });

        step("Click the product button", () -> {
            step("// todo: just add selenium action");
        });

        step("Click on the product overview block", () -> {
            step("// todo: just add selenium action");
        });

        step("Check for text 40M", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://miro.com'", () ->
            open("https://miro.com"));

        step("Page title should have text 'The Visual Collaboration Platform for Every Team | Miro'", () -> {
            String expectedTitle = "The Visual Collaboration Platform for Every Team | Miro";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://miro.com'", () ->
            open("https://miro.com"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}