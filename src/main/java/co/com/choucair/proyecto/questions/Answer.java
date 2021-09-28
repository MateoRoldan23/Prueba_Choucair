package co.com.choucair.proyecto.questions;

import co.com.choucair.proyecto.userinterface.UtestPasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Answer implements Question<Boolean> {


    public static Answer toThe(){
        return  new Answer();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = UtestPasswordPage.BUTTON_COMPLETE.resolveFor(actor).isVisible();
        return result;
    }


}
