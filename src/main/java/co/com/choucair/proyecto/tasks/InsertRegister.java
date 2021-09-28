package co.com.choucair.proyecto.tasks;

import co.com.choucair.proyecto.userinterface.UtestAddressPage;
import co.com.choucair.proyecto.userinterface.UtestFirstPage;
import co.com.choucair.proyecto.userinterface.UtestPasswordPage;
import co.com.choucair.proyecto.userinterface.UtestPersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class InsertRegister implements Task{


    private UtestPersonalPage utestPersonalPage;
    private String strName;
    private String strLastName;
    private String strEmail;
    private String strBirthDay;
    private String strBirthMonth;
    private String strBirthYear;
    private String strCity;
    private String strPostalCode;
    private String strPassword;

    public InsertRegister(String strName, String strLastName, String strEmail, String strBirthDay, String strBirthMonth,
            String strBirthYear, String strCity, String strPostalCode, String strPassword){

        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
        this.strCity = strCity;
        this.strPostalCode = strPostalCode;
        this.strPassword = strPassword;
    }

    public static InsertRegister the(String strName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear, String strCity, String strPostalCode, String strPassword) {
        return Tasks.instrumented(InsertRegister.class, strName, strLastName, strEmail, strBirthMonth, strBirthDay, strBirthYear, strCity, strPostalCode, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(UtestFirstPage.LOGIN_BUTTON),
                Enter.theValue(strName).into(UtestPersonalPage.NAME),
                Enter.theValue(strLastName).into(UtestPersonalPage.LAST_NAME),
                Enter.theValue(strEmail).into(UtestPersonalPage.EMAIL),
                SelectFromOptions.byVisibleText(strBirthMonth).from(UtestPersonalPage.MONTH_SELECT),
                SelectFromOptions.byVisibleText(strBirthDay).from(UtestPersonalPage.DAY_SELECT),
                SelectFromOptions.byVisibleText(strBirthYear).from(UtestPersonalPage.YEAR_SELECT),
                Click.on(UtestPersonalPage.LOCATION_BUTTON),


                Click.on(UtestAddressPage.BUTTON_DEVICES),

                Click.on(UtestAddressPage.LAST_STEP_BUTTON),


                Enter.theValue(strPassword).into(UtestPasswordPage.PASSWORD),
                Enter.theValue(strPassword).into(UtestPasswordPage.CONFIRM_PASSWORD),
                Click.on(UtestPasswordPage.CB_TERM_CONDITIONS),
                Click.on(UtestPasswordPage.CB_PRIVACY_POLICY),
                Click.on(UtestPasswordPage.BUTTON_COMPLETE));
    }
}
