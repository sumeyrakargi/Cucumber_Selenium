package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class GoogleStepDefinitions {
    @Given("Kullanıcı Google sayfasına gider")
    public void kullanıcıGoogleSayfasınaGider() {
        Driver.getDriver().get("http://www.google.com");
    }

    @When("Kullanıcı arama kısmında samsung kelimesini ara")
    public void kullanıcıAramaKısmındaSamsungKelimesiniAra() {
        GoogleSearchPage sp=new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("samsung");
    }

    @Then("Kullanıcı sayfada samsung kelimesinin geçtiğini doğrular")
    public void kullanıcıSayfadaSamsungKelimesininGeçtiğiniDoğrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("samsung"));
    }
}
