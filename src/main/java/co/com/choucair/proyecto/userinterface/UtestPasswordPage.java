package co.com.choucair.proyecto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPasswordPage {


    public static final Target PASSWORD = Target.the("Enter the password").
            located(By.id("password")) ;
    public static final Target CONFIRM_PASSWORD = Target.the("Enter confirm password").
            located(By.id("confirmPassword"));
    public static final Target CB_TERM_CONDITIONS = Target.the("Accept T&C")
            .located(By.id("termOfUsetermOfUse"));
    public static final Target CB_PRIVACY_POLICY = Target.the("Accept P&S").
            located(By.id("privacySetting"));
    public static final Target BUTTON_COMPLETE = Target.the("Complete Setup")
            .located(By.id("laddaBtn"));

}
