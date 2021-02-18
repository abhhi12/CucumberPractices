package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {
	
	@Given("User Wants to select a car Type {string} from Uber aap")
	public void user_wants_to_select_a_car_type_from_uber_aap(String carType) {
	    System.out.println("Step 1: "+ carType);
	}

	@When("User selects car {string} and pick point {string} and drop location {string}")
	public void user_selects_car_and_pick_point_and_drop_location(String carType, String pickupPoint, String DropPoint) {
		System.out.println("Step 2: " +carType+ " " +pickupPoint+ " " + DropPoint);
	}

	@Then("Driver Starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("Step 3: ");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("Step 4: ");
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer price) {
		System.out.println("Step 5: ");
	}

}
