package stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

   @Given("^user is on netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("navigated to landing page successfully");
    }

    
    @When("^user has to login into app with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_has_to_login_into_app_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    	System.out.println(" login validation successful");
    }

    @Then("^Netbanking home page is populated$")
    public void netbanking_home_page_is_populated() throws Throwable {
        System.out.println("home page validation");
    }

    @And("^the cards are \"([^\"]*)\"$")
    public void the_cards_are_something(String strArg1) throws Throwable {
       System.out.println("the cards are"+strArg1);
    }


}