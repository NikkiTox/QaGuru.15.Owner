package ru.ozon;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class OzonTest extends TestBase{
    @Test
    @Description("Поиск товара через строку поиска")
    @DisplayName("Search Test")
    void searchTest() {
        step("Открыть сайт Ozon.ru", () -> {
            open("https://www.ozon.ru");
        });

        step("Ввести в поле поиска Iphone 11", () -> {
            $("[name=text]").setValue("Iphone 11").pressEnter();
        });

        step("Проверить, что поисковой запрос выполнен с результатами", () -> {
            $("[data-widget='fulltextResultsHeader']").shouldHave(Condition.text("По запросу"));
        });
    }
}

