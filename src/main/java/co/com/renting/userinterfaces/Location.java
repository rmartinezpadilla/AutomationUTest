package co.com.renting.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Location extends PageObject {


    public static final Target BOTON_NEXT_DEVICES= Target.the("boton next devices")
            .located(By.xpath("//div[@class='pull-right next-step']"));

}
