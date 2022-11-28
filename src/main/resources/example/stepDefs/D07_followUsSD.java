package example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D07_followUsStepDef {

    WebDriver driver = null;
    P03_homePage home = new P03_homePage(driver);

    @When("clicking on the fb icon")
    public void facebookIcon() throws InterruptedException {
        home.facebookIcon().click();

        home.switchTab1();

    }


    @Then("verify the fb url")
    public void facebookURL() {

        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://web.facebook.com/nopCommerce?_rdc=1&_rdr");
    }

    @When("clicking on the twit icon")
    public void clickingOnTheTwitterIcon() throws InterruptedException {
        home.twitterIcon().click();

        home.switchTab1();
    }

    @Then("verify the twit url")
    public void twitterURL() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://twitter.com/nopCommerce");
    }

    @When("clicking on the Rss icon")
    public void clickingOnTheRssIcon() throws InterruptedException {
        home.rssIcon().click();

    }
    @Then("verify the Rss url")
    public void rssURL() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/new-online-store-is-open" );
    }

    @When("clicking on the yout icon")
    public void clickingOnTheYoutubeIcon() throws InterruptedException {

        home.youtubeIcon().click();

        home.switchTab1();
    }

    @Then("verify the yout url")
    public void youtubeURL() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.youtube.com/user/nopCommerce");
    }
}
