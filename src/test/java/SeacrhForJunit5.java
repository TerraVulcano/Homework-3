import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;

public class SeacrhForJunit5 {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void SearchForJunit5() {

        Selenide.open("https://github.com");
        Selenide.$("[name=q]").setValue("selenide").pressEnter();
        Selenide.$$("ul.repo-list li").first().$("a").click();
        Selenide.$("[data-content=Wiki]").click();
        Selenide.$(byText("Soft assertions")).click();
        Selenide.$("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));
    }


}
