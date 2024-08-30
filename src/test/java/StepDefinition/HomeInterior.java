package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeInterior {

    private WebDriver driver;
    private WebDriverWait wait;

    @Given("I am on MagicBricks home page")
    public void i_am_on_magic_bricks_home_page() {
        // Set the path to your ChromeDriver executable
        // Initialize WebDriver and WebDriverWait
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.magicbricks.com/");
        driver.manage().window().maximize();
    }

    @When("I click on Home Interiors dropdown")
    public void i_click_on_home_interiors_dropdown() {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#homeInteriorsDropdown")));
        dropdown.click();
    }

    @When("I click on Full Home Interiors Design Ideas")
    public void i_click_on_full_home_interiors_design_ideas() {
        WebElement designIdeas = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#fullHomeInteriorsDesignIdeas")));
        designIdeas.click();
    }

    @When("I click on {string}")
    public void i_click_on(String option) {
        WebElement optionElement = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(option)));
        optionElement.click();
    }

    @Then("{string} page will be displayed")
    public void page_will_be_displayed(String pageTitle) {
        WebElement page = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".page-title"))); // Update the selector based on the actual page structure
        String actualTitle = page.getText();
        if (!actualTitle.contains(pageTitle)) {
            throw new AssertionError("Expected page title to contain '" + pageTitle + "' but was '" + actualTitle + "'");
        }
    }

    @When("I choose {string} from dropdown")
    public void i_choose_from_dropdown(String value) {
        WebElement dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#cityDropdown"))); // Update as needed
        Select select = new Select(dropdown);
        select.selectByVisibleText(value);
    }

    @When("I choose {string} from price range dropdown")
    public void i_choose_price_range_from_dropdown(String priceRange) {
        WebElement priceDropdown = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#priceRangeDropdown"))); // Update as needed
        Select select = new Select(priceDropdown);
        select.selectByVisibleText(priceRange);
    }

    @Then("the 2BHK Interior Design page should be filtered by {string} and {string}")
    public void the_2bhk_interior_design_page_should_be_filtered_by_and(String city, String priceRange) {
       
}
}