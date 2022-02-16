package co.com.tyba.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {
  public static final Target BTN_TRAVEL_OPTIONS =
      Target.the("Button to select travelocity options")
          .locatedBy("//li[@role='presentation']//a//span[contains(.,'{0}')]");
}
