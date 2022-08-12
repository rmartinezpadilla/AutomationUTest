package co.com.renting.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Personal extends PageObject {
    public static final Target TXT_FIRST_NAME= Target.the("txt nombre")
            .located(By.xpath("//div//input[@id='firstName']"));

    public static final Target TXT_LAST_NAME= Target.the("txt apellidos")
            .located(By.xpath("//div//input[@id='lastName']"));

    public static final Target TXT_EMAIL= Target.the("txt email")
            .located(By.xpath("//div//input[@id='email']"));

    public static final Target MONTHS_ALL= Target.the("todos los meses")
            .locatedBy("//div//select[@id='birthMonth']");

    public static final Target SELECT_MONTH= Target.the("select month")
            .locatedBy("//div//select[@id='birthMonth']//option[contains(text(),'{0}')]");

    public static final Target SELECT_DAY= Target.the("select day")
            .locatedBy("//div//select[@id='birthDay']//option[contains(text(),'{0}')]");

    public static final Target SELECT_YEAR= Target.the("select year")
            .locatedBy("//div//select[@id='birthYear']//option[contains(text(),'{0}')]");

    public static final Target BOTON_NEXT_LOCATION= Target.the("boton next location")
            .located(By.xpath("//a//i[@class='material-icons']"));



}
