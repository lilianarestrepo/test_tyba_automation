package co.com.tyba.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/bot_page_verification.feature",
    glue = "co.com.tyba.stepdefinitions",
    snippets = SnippetType.CAMELCASE)
public class BotPageVerificationRunner {}
