import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.collections.Texts;
import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class OrderCardTest {

    @Test
    void shouldSendRequestTest () {
        open("http://localhost:9999");
        $("[data-test-id=name] input").setValue("Виталий");
        $("[data-test-id=phone] input").setValue("+79231111111");
        $("[data-test-id=agreement]").click();
        $(".button").click();
        $(".paragraph").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }

}
