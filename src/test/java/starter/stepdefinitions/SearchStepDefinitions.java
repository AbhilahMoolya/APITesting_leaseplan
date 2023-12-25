package starter.stepdefinitions;


import io.restassured.path.json.JsonPath;
import io.restassured.response.ResponseBody;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.rest.SerenityRest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import starter.common;
import starter.pojo.Product;
import starter.productResponse;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.contains;


public class SearchStepDefinitions {

    @Steps
    public CarsAPI carsAPI;

    public String testresponse;

    Product[] productList;


    @When("he calls endpoint for the {string}")
    public void heCallsEndpoint(String product) {
        String baseuri = "https://waarkoop-server.herokuapp.com/api/v1/search/demo/{product}";
        try {
            ResponseBody body = SerenityRest.given().relaxedHTTPSValidation().get(baseuri.replace("{product}", product)).then().extract().response().body();
            productList = body.as(Product[].class);
        }
        catch (Exception e)
        {
            testresponse= SerenityRest.given().relaxedHTTPSValidation().get(baseuri.replace("{product}", product)).then().extract().response().asString();

        }
    }

    @Then("verify the {string} for the product")
    public void heSeesTheResultsDisplayedForApple( String statuscode) {
        restAssuredThat(response -> response.statusCode(Integer.parseInt(statuscode)));
    }

    @Then("check the response of the {string}")
    public void checkResponse(String product) {
        JsonPath js=new JsonPath(testresponse);
            for (Product prod : productList) {
                if (product.equalsIgnoreCase("cola")) {
                    System.out.println(prod.getTitle());
                    Assert.assertTrue(common.colaTitle.contains(prod.getTitle()));
                }
                if (product.equalsIgnoreCase("pasta")) {
//                    Assert.assertTrue(common.pastaTitle.contains(title));

                        common.validation(prod.getProvider(), prod.getTitle(), prod.getUrl(), prod.getBrand(), prod.getPrice(), prod.getUnit(), prod.getImage());


                }
            }

    }







    @Then("he sees the results displayed for mango")
    public void heSeesTheResultsDisplayedForMango() {
        restAssuredThat(response -> response.body("title", contains("mango")));
    }

    @Then("he doesn not see the results")
    public void he_Doesn_Not_See_The_Results() {
        restAssuredThat(response -> response.body("error", contains("True")));
    }
}
