package velmurugan;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demoqa{
	@Given("^The user go to demo web register page$")
	public void the_user_go_to_demo_web_register_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("http://demo.automationtesting.in/Register.html");
	}

	@When("^The user fill the user detail\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"and\"([^\"]*)\"$")
	public void the_user_fill_the_user_detail_and(String fname, String lname, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13, String arg14, String arg15, String arg16) {
	    // Write code here that turns the phrase above into concrete actions
	    type(getFname(), fname);
	    type(getLname(),lname);
	}

	@Then("^The user validate the details$")
	public void the_user_validate_the_details() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("done");
	}


}
