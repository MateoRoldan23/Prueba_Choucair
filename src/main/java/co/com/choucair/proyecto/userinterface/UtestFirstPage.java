package co.com.choucair.proyecto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFirstPage {

    public static final Target LOGIN_BUTTON = Target.the("button that show us the from to join today").
            located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(), 'Join Today')]"));
}



