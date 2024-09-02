package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration; 

public class HomeInteriorsPage {
    WebDriver driver;
    Actions actions;
    WebDriverWait wait; // WebDriverWait to handle dynamic content

    // Locate web elements
    @FindBy(xpath = "//div[@class='mb-header__sub__tabs__dropdown js-menu-drop homeinterior-drop swiper-created']\r\n")
    private WebElement homeInteriorsLink;  // This is the clickable link

    @FindBy(xpath = "//a[contains(text(), 'Modular Kitchen Design Ideas')]")
    WebElement modularKitchenDesignIdeas;

    @FindBy(xpath = "//a[contains(text(), 'Bedroom Design Ideas')]")
    WebElement bedroomDesignIdeas;

    @FindBy(xpath = "//a[contains(text(), 'TV Unit Design')]")
    WebElement tvUnitDesign;

    @FindBy(xpath = "//a[contains(text(), '1BHK Interior Design')]")
    WebElement oneBHKInteriorDesign;

    @FindBy(xpath = "//a[contains(text(), '2BHK Interior Design')]")
    WebElement twoBHKInteriorDesign;
    
    @FindBy(xpath = "//div[text()='Select City']")
    WebElement cityDropdown;

    @FindBy(xpath = "//div[text()='Price Range']")
    WebElement priceRangeDropdown;

    public HomeInteriorsPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Initialize WebDriverWait with Duration
        
        PageFactory.initElements(driver, this);
    }

    public void hoverOnHomeInteriorsDropdown() {
        wait.until(ExpectedConditions.visibilityOf(homeInteriorsLink)); // Ensure element is visible
        actions.moveToElement(homeInteriorsLink).perform();
    }
    public void clickModularKitchenDesignIdeas() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(modularKitchenDesignIdeas));
        element.click();
    }

    public void clickBedroomDesignIdeas() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(bedroomDesignIdeas));
        element.click();
    }

    public void clickTVUnitDesign() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(tvUnitDesign));
        element.click();
    }
    
    public void clickOneBHKInteriorDesign() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(oneBHKInteriorDesign));
        element.click();
    }

    public void clickTwoBHKInteriorDesign() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(twoBHKInteriorDesign));
        element.click();
    }
    
    public void clickCityDropdown() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(cityDropdown));
        element.click();
    }

    public void clickPriceRangeDropdown() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(priceRangeDropdown));
        element.click();
    }
}
