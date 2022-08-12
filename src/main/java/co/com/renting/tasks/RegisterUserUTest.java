package co.com.renting.tasks;

import co.com.renting.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class RegisterUserUTest implements Task {

    private final String nombre;
    private final String lastname;
    private final String email;
    private final String month;
    private final String day;
    private final String year;


    public RegisterUserUTest(String nombre, String lastname, String email, String month, String day, String year) {
        super();
        this.nombre = nombre;
        this.lastname = lastname;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(HomeUTest.BOTON_REGISTRO),
                SendKeys.of(nombre).into(Personal.TXT_FIRST_NAME),
                Enter.theValue(lastname).into(Personal.TXT_LAST_NAME),
                SendKeys.of(email).into(Personal.TXT_EMAIL),
                Click.on(Personal.SELECT_MONTH.of(month)),
              Click.on(Personal.SELECT_DAY.of(day)),
                Click.on(Personal.SELECT_YEAR.of(year)),
                Scroll.to(Personal.BOTON_NEXT_LOCATION),
                Click.on(Personal.BOTON_NEXT_LOCATION),
                Scroll.to(Location.BOTON_NEXT_DEVICES),
                WaitUntil.the(Location.BOTON_NEXT_DEVICES,isVisible()).forNoMoreThan(5).seconds(),
                Click.on(Location.BOTON_NEXT_DEVICES),
                WaitUntil.the(Devices.SELECT_COMPUTER,isVisible()).forNoMoreThan(5).seconds(),
                Click.on(Devices.SELECT_COMPUTER),
                Click.on(Devices.SELECT_WINDOWS),
                Click.on(Devices.SELECT_VERSION),
                Click.on(Devices.SELECT_DOSMILTRES),
                Click.on(Devices.SELECT_LENGUAJE),
                Click.on(Devices.SELECT_INGLES),
                Scroll.to(Devices.BOTON_LAST_FINAL),
                Click.on(Devices.BOTON_LAST_FINAL),
                WaitUntil.the(Complete.TXT_PASSWORD,isVisible()).forNoMoreThan(5).seconds(),
                SendKeys.of("Probando@T12").into(Complete.TXT_PASSWORD),
                SendKeys.of("Probando@T12").into(Complete.TXT_CONFIRM_PASSWORD),
                Scroll.to(Complete.CHECK_ACCEPT_TERMINOS),
                Click.on(Complete.CHECK_ACCEPT_TERMINOS),
                Click.on(Complete.CHECK_ACCEPT_POLITICAS),
                Click.on(Complete.BOTON_COMPLETE)

        );
    }

    public static RegisterUserUTest makeinformation(String nombre, String lastname, String email, String month, String day, String year){
        return Tasks.instrumented(RegisterUserUTest.class, nombre, lastname, email, month, day, year);
    }

}
