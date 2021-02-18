package stepdefinitions;

import AmazonImplimentation.Product;
import AmazonImplimentation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SearchSteps {
	Product product;
	Search search;
	
	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
	    System.out.println("Step 1 : I a on Search Page");
	}

	@When("I search for a product with the name {string} and price {int}")
	public void i_search_for_a_product_with_the_name_and_price(String productName, Integer price) {
		 System.out.println("Step 2 : Search The product nme with" +productName+ "price:" +price);
		 
		 product = new Product(productName, price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		 System.out.println("Step 3 : product" +productName+ "is displayed");
		 
		 search = new Search();
		 
		 String name=search.displayproduct(product);
		 System.out.println("Searched Product is :" +product);
		 
		 Assert.assertEquals(product.getProductName(), name);
	}

}
