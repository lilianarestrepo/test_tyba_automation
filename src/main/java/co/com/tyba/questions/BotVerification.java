package co.com.tyba.questions;

import static co.com.tyba.user_interfaces.BotPage.BTN_TITLE_BOT_VERIFICATION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class BotVerification implements Question<Boolean> {
  @Override
  public Boolean answeredBy(Actor actor) {
    // WaitUntil.the(BTN_TITLE_BOT_VERIFICATION, isVisible()).forNoMoreThan(15).seconds();
    return BTN_TITLE_BOT_VERIFICATION.resolveFor(actor).isPresent();
  }

  public static BotVerification isPresent() {
    return new BotVerification();
  }
}
