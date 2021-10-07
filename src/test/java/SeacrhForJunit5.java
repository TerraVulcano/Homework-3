import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;

public class SeacrhForJunit5 {


    @Test
    void SearchForJunit5() {

        Selenide.open("https://github.com");
        Selenide.$("[name=q]").setValue("selenide").pressEnter();
        Selenide.$$("ul.repo-list li").first().$("a").click();
        Selenide.$("[data-content=Wiki]").click();
        Selenide.$("#wiki-body").shouldHave(text("Soft assertions")).click();
        Selenide.$("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));
    }

}
