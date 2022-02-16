package co.com.tyba.tasks;

import static co.com.tyba.interactions.SelectTravelocity.selectTravelocity;
import static co.com.tyba.user_interfaces.FlightPage.*;
import static co.com.tyba.utils.TravelocityOptionsConstants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class Search implements Task {
  private Map<String, String> detailsFlight;

  public Search(Map<String, String> detailsFlight) {
    this.detailsFlight = detailsFlight;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        selectTravelocity(FLIGHTS_OPTION),
        Click.on(DIV_FLYING_FROM),
        SendKeys.of(detailsFlight.get("originCity")).into(TXT_FLYING_FROM).thenHit(Keys.ENTER),
        Click.on(DIV_FLYING_TO),
        SendKeys.of(detailsFlight.get("destinyCity")).into(TXT_FLYING_TO).thenHit(Keys.ENTER));
  }

  public static Performable flight(Map<String, String> detailsFlight) {
    return instrumented(Search.class, detailsFlight);
  }
}
