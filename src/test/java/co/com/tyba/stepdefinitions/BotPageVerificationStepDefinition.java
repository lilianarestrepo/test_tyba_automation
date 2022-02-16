package co.com.tyba.stepdefinitions;

import static co.com.tyba.user_interfaces.FlightPage.BTN_SEARCH_FLIGHT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.tyba.interactions.OpenBrowser;
import co.com.tyba.questions.BotVerification;
import co.com.tyba.tasks.Search;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.Map;
import net.serenitybdd.screenplay.actions.Click;

public class BotPageVerificationStepDefinition {

  @Given("^that (.*) searchs the flight options$")
  public void thatTheUserWantsToLookSomeFlights(
      String nameActor, Map<String, String> detailsFlight) {
    theActorCalled(nameActor)
        .wasAbleTo(OpenBrowser.withSpecificUrl(), Search.flight(detailsFlight));
  }

  @When("^she searchs the flight$")
  public void heSelectsTheFlight() {
    theActorInTheSpotlight().attemptsTo(Click.on(BTN_SEARCH_FLIGHT));
  }

  @Then("^she should see the bot page asking for verification$")
  public void heShouldSeeTheTicket() {
    theActorInTheSpotlight().should(seeThat(BotVerification.isPresent()));
  }
}
