package stepDefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomeInteriorsPage;

public class HomeInterior
{
	HomeInteriorsPage homePage;
	WebDriverWait wait;
	WebDriver driver;
	
	@Given("I am on MagicBricks home page")
	public void i_am_on_magic_bricks_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.get("https://www.magicbricks.com/");
        driver.manage().window().maximize();
        
        homePage = new HomeInteriorsPage(driver);

        // Disable notifications using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("Notification.permission = 'denied';");
	}
	
	@When("I hover on Home Interiors dropdown")
	public void i_hover_on_home_interiors_dropdown(){
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		homePage.hoverOnHomeInteriorsDropdown();
		
	}

/*	@When("I click on Modular Kitchen Design Ideas under Home Interiors Design Ideas")
	public void i_click_on_modular_kitchen_design_ideas_under_home_interiors_design_ideas() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		homePage.clickModularKitchenDesignIdeas();
	}
/*
/*	@Then("Modular Kitchen Design Ideas page will be displayed")
	public void modular_kitchen_design_ideas_page_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I hover on Home Interiors design dropdown")
	public void i_hover_on_home_interiors_design_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click on Bedroom Design Ideas under Home Interiors Design Ideas")
	public void i_click_on_bedroom_design_ideas_under_home_interiors_design_ideas() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Bedroom Design Ideas page will be displayed")
	public void bedroom_design_ideas_page_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click on TV UnitDesign under Home Interiors Design Ideas")
	public void i_click_on_tv_unit_design_under_home_interiors_design_ideas() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("TV Unit Design page will be displayed")
	public void tv_unit_design_page_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click on 1BHK Interior Design under Full Home Interiors Design Ideas")
	public void i_click_on_1bhk_interior_design_under_full_home_interiors_design_ideas() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("1BHK Interior Design page will be displayed")
	public void bhk_interior_design_page_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click on <{string}> under Full Home Interiors Design Ideas")
	public void i_click_on_under_full_home_interiors_design_ideas(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("2BHK Interior Design page will be displayed")
	public void bhk_interior_design_page_will_be_displayed1() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I choose <{string}> from dropdown")
	public void i_choose_from_dropdown(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the 2BHK Interior Design page should be filtered by <{string}> and <{string}>")
	public void the_2bhk_interior_design_page_should_be_filtered_by_and(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}
*/

	

}

