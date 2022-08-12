package co.com.renting.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Devices extends PageObject {

    public static final Target SELECT_COMPUTER= Target.the("select computer")
            .locatedBy("(//div[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form'])[1]");

    public static final Target SELECT_WINDOWS= Target.the("select windows")
            .locatedBy("(//span[@class='ui-select-choices-row-inner'])[2]");


    public static final Target SELECT_VERSION= Target.the("select computer")
            .locatedBy("(//div[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form'])[2]");

    public static final Target SELECT_DOSMILTRES= Target.the("select dos mil tres")
            .locatedBy("(//span[@class='ui-select-choices-row-inner'])[3]");

    public static final Target SELECT_LENGUAJE= Target.the("select lenguaje")
            .locatedBy("(//div[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form'])[3]");

    public static final Target SELECT_INGLES= Target.the("select ingles")
            .locatedBy("(//span[@class='ui-select-choices-row-inner'])[11]");

    public static final Target BOTON_LAST_FINAL= Target.the("register last final")
            .located(By.xpath("//a[@aria-label='Next - final step']"));

}
