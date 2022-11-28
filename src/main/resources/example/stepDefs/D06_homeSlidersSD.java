package example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
    WebDriver driver = null;
    P03_homePage home = new P03_homePage(driver);
    
    
    @When("clicking on the first sliderr")
    public void firstSlider() throws InterruptedException {

        home.slidewaiter(home.firstSliderHref());
        home.firstSliderHref().click();

    }

    @Then("check if you are rotated to nokia pagee")
    public void checkIfUAreRotatedToNokiaPage()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");
    }

    @When("clicking on the second sliderr")
    public void clickingOnTheSecondSlider() {
                home.slidewaiter(home.secondSliderHref());
                home.secondSliderHref().click();
        
    }



    @Then("check if you are rotated to iphone pagee")
    public void checkIfUAreRotatedToIphonePage()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), " https://demo.nopcommerce.com/iphone-6");
    }
}
