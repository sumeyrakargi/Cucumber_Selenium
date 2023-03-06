package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class GoogleTask04 {
    @Given("Kullanıcı Google sayfasına açar")
    public void kullanıcıGoogleSayfasınaAçar() {
        Driver.getDriver().get("http://www.google.com");
    }
    @When("Kullanıcı arama kısmında selenium kelimesini aratır")
    public void kullanıcıAramaKısmındaSeleniumKelimesiniAratır() {
        GoogleSearchPage sp=new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("selenium");
    }
    @Then("Kullanıcı titleda selenium kelimesinin geçtiğini doğrular")
    public void kullanıcıTitledaSeleniumKelimesininGeçtiğiniDoğrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("selenium"));
    }
}
