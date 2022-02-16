package co.com.tyba.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightPage {
  public static final Target DIV_FLYING_FROM =
      Target.the("Input to Select Origin Flight").located(By.id("location-field-leg1-origin-menu"));
  public static final Target TXT_FLYING_FROM =
      Target.the("Input to Select Origin Flight").located(By.id("location-field-leg1-origin"));
  public static final Target DIV_FLYING_TO =
      Target.the("Input to Select Destiny Flight")
          .located(By.id("location-field-leg1-destination-menu"));
  public static final Target TXT_FLYING_TO =
      Target.the("Input to Select Destiny Flight")
          .located(By.id("location-field-leg1-destination"));
  public static final Target BTN_SEARCH_FLIGHT =
      Target.the("The button to search flight").locatedBy("//button[@data-testid='submit-button']");
}
