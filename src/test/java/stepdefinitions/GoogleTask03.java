package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class GoogleTask03 {
    @Given("Kullanıcı Google a gider")
    public void kullanıcıGoogleAGider() {
        Driver.getDriver().get("http://www.google.com");
    }

    @When("Kullanıcı arama kısmında cucumber kelimesini aratır")
    public void kullanıcıAramaKısmındaCucumberKelimesiniAratır() {
        GoogleSearchPage sp=new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("cucumber");
    }

    @Then("Kullanıcı title da cucumber kelimesinin geçtiğini doğrular")
    public void kullanıcıTitleDaCucumberKelimesininGeçtiğiniDoğrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("cucumber"));
    }
}
