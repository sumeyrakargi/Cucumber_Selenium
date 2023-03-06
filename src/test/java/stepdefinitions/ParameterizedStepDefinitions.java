package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class ParameterizedStepDefinitions {
    @Given("Kullanıcı Google sayfasındadır")
    public void kullanıcıGoogleSayfasındadır() {
    }

    @When("Kullanıcı {string} arattığında")
    public void kullanıcıArattığında(String key) {
        GoogleSearchPage sp=new GoogleSearchPage(Driver.getDriver());
        sp.searchFor(key);
    }

    @Then("Kullanıcı title da {string} görür")
    public void kullanıcıTitleDaGörür(String key) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(key));
        Driver.getDriver().quit();
    }
}

