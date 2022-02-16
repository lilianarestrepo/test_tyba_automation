package co.com.tyba.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BotPage {
  public static final Target BTN_TITLE_BOT_VERIFICATION =
      Target.the("Bot title").located(By.xpath("//h2[contains(.,'Show us your human side...')]"));
}
