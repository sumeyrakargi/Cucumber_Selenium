package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepDefination {
    @Given("Ilk feature icin cucumber indirdim")
    public void ilk_feature_icin_cucumber_indirdim() {
        System.out.println("Given stepi calisti");
    }
    @When("Senaryoyu calistirdigimda")
    public void senaryoyu_calistirdigimda() {
        System.out.println("When step calisti");
    }
    @Then("Senaryomun calistigini konsolda gormeliyim")
    public void senaryomun_calistigini_konsolda_gormeliyim() {
        System.out.println("Then step calisti");
    }


}
