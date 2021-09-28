package co.com.choucair.proyecto.userinterface;

import org.openqa.selenium.By;

public class UtestAddressPage {

    public static final net.serenitybdd.screenplay.targets.Target BUTTON_DEVICES = net.serenitybdd.screenplay.targets.Target.the("Button next location").
            located(By.xpath("(//*[text()='Next: Devices'"));

    public static final net.serenitybdd.screenplay.targets.Target LAST_STEP_BUTTON = net.serenitybdd.screenplay.targets.Target.the("Button next location").
            located(By.xpath("(//*[text()='Next: Last Step'"));
}
