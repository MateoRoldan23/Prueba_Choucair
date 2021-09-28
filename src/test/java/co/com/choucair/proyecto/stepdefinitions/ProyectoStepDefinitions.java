package co.com.choucair.proyecto.stepdefinitions;

import co.com.choucair.proyecto.model.ProyectoRegistarData;
import co.com.choucair.proyecto.questions.Answer;
import co.com.choucair.proyecto.tasks.InsertRegister;
import co.com.choucair.proyecto.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ProyectoStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than Mateo Open Utest Page and Click Join Button$")
    public void thanMateoOpenUtestPageAndClickJoinButton() {
        OnStage.theActorCalled("Mateo").wasAbleTo(OpenUp.thePage());
    }

    @When("^he finds and registers on the platform$")
    public void heFindsAndRegistersOnThePlatform(List<ProyectoRegistarData> proyectoRegistarData) {
        OnStage.theActorInTheSpotlight().attemptsTo(InsertRegister.the(proyectoRegistarData.get(0).getStrName(), proyectoRegistarData.get(0).getStrLastName(),
                proyectoRegistarData.get(0).getStrEmail(), proyectoRegistarData.get(0).getStrBirthMonth(),
                proyectoRegistarData.get(0).getStrBirthDay(), proyectoRegistarData.get(0).getStrBirthYear(),
                proyectoRegistarData.get(0).getStrCity(), proyectoRegistarData.get(0).getStrPostalCode(),
                proyectoRegistarData.get(0).getStrPassword()
        ));

    }

    @Then("^he finds button complete Register$")
    public void heFindsButtonCompleteRegister() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe()));
    }
}
