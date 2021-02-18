package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationSteps {
	
	@Given("User in on registration page")
	public void user_in_on_registration_page() {
		System.out.println("User navigate to registration page");
	    
	}

	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
		List<List<String>> userlist=dataTable.asLists(String.class);
		
		for(List<String> e : userlist) {
			System.out.println(e);
		}
	}
	
	@When("User enters following user details from column")
	public void user_enters_following_user_details_from_column(DataTable dataTable) {
		List<Map<String, String>> userlist =dataTable.asMaps(String.class, String.class);//First string class is a ky and second is a value
//		System.out.println(userlist);
//		System.out.println(userlist.get(0).get("firstname"));
		
		for(Map<String, String> e : userlist) {
			System.out.println(e.get("firstname"));
			System.out.println(e.get("lastname"));
			System.out.println(e.get("email"));
			System.out.println(e.get("phoneno"));
			System.out.println(e.get("city"));
		}
	}

	@Then("user registration should be successful")
	public void user_registration_should_be_successful() {
	    
	}

	

}
