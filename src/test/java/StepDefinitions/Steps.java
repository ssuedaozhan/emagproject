package StepDefinitions;

import Pages.Elements;
import Utilities.PageDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps {
    Elements el=new Elements();

    @Given("Navigate to page")
    public void navigateToPage() {
        PageDriver.getDriver().get("https://www.emag.ro/");
    }

    @Then("User should go home successfully")
    public void userShouldGoHomeSuccessfully() {

    }
    @And("search and add product")
    public void searchAndAddProduct() {
        el.scrollToElement(el.search);
        el.sendKeysFunction(el.search,"iphone");
        el.clickFunction(el.clicksearch);
el.clickFunction(el.sepeteekle);
el.clickFunction(el.carpiisareti);
el.clickFunction(el.anasayfadakisepetegider);

    }
}
