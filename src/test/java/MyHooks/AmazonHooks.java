package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	
	@Before("@Smoke")
	public void setup_Browser(Scenario sc) {
		System.out.println("Launch chrome browser");
		System.out.println(sc.getName());
		
		
	}
	
//	@Before(order=2)
//	public void setup_url() {
//		System.out.println("Launch the url");
//	}
//	
//	@After(order=2)
//	public void tearDown_Close(Scenario sc) {
//		System.out.println("Close the browser");
//		System.out.println(sc.getName());
//	}
	@After("@Smoke")
	public void tearDown_logout() {
		System.out.println("Logout from Application");
	}
	
//	@BeforeStep
//	public void takescreenshots() {
//		System.out.println("Take screenShots");
//	}
//	
//	@AfterStep
//	public void refreshpage() {
//		System.out.println("Refresh the page");
//	}
	
	
	
	
	
}
