package tests;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


@Tag("selenide_android")
public class WikiAppSearchTests extends BaseForTest {

    @Test
    @DisplayName("Wikipedia search test")
    void searchTest() {
        back();
        step("Type search", () -> {
            $(MobileBy.AccessibilityId("Search Wikipedia")).click();
            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).val("Github");
        });
        step("Verify content found", () ->
                $$(MobileBy.id("org.wikipedia.alpha:id/search_results_container"))
                        .shouldHave(sizeGreaterThan(0)));
    }
}