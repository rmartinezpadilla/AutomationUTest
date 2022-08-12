package co.com.renting.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

        public class Complete extends PageObject {

                     public static final Target TXT_PASSWORD= Target.the("txt password")
                                                        .located(By.xpath("//div//input[@id='password']"));

            public static final Target TXT_CONFIRM_PASSWORD= Target.the("txt confirmar password")
                                                        .located(By.xpath("//div//input[@id='confirmPassword']"));

            public static final Target CHECK_ACCEPT_TERMINOS= Target.the("check aceptar terminos")
                    .located(By.xpath("(//div//span[@class='checkmark signup-consent__checkbox error'])[1]"));

            public static final Target CHECK_ACCEPT_POLITICAS= Target.the("check aceptar politicas")
                    .located(By.xpath("//span[@ng-class='{error: userForm.privacySetting.$error.required}']"));

            public static final Target BOTON_COMPLETE= Target.the("boton complete")
                    .located(By.xpath("//div//a[@aria-label='Complete Setup']"));



}

