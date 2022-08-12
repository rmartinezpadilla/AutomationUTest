package co.com.renting.stepdefinitions;

import co.com.renting.tasks.RegisterUserUTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.awt.*;


public class RegisterUserStepDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Ruben");

    }

    @Given("^user in the home page$")
    public void userInTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));
    }

    @When("^user create an account filling the fields nombre:(.*) apellido:(.*) correo:(.*) mes:(.*) dia:(.*) anno:(.*)$")
    public void userCreateAnAccountFillingTheFieldsnombreapellidocorreomesdiaanno(String nombre, String lastname, String email, String month, String day, String year) {
        theActorInTheSpotlight().attemptsTo(RegisterUserUTest.makeinformation(nombre, lastname, email, month, day, year));

    }


    @Then("^user sees its username$")
    public void userSeesItsUsername() {

    }
}
