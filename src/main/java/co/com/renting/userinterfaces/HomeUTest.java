package co.com.renting.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUTest {

    public static final Target BOTON_REGISTRO= Target.the("register boton")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

}
