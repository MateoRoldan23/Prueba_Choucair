package co.com.choucair.proyecto.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestPersonalPage {

    public static final Target NAME = Target.the("Enter the Name").located(By.id("fistName"));
    public static final Target LAST_NAME = Target.the("Enter the LastName").located(By.id("lastName"));
    public static final Target EMAIL =  Target.the("Enter the E-mail").located(By.id("email"));
    public static final Target MONTH_SELECT = Target.the("Enter the Mount").located(By.id("birthMonth"));
    public static final Target DAY_SELECT = Target.the("Enter the day").located(By.id("birthDay"));
    public static final Target YEAR_SELECT = Target.the("Enter the year").located(By.id("birthYear"));
    public static final Target LOCATION_BUTTON = Target.the("Button next location").
            located(By.xpath("(//*[text()='Next: Location'"));
}
