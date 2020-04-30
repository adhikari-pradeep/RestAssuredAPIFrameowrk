/*
Author -> Praveen Kumar
 */

package stepDefinitions;

import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class Whens{

    private Response response;
    BaseClass bc = BaseClass.getInstance();


    @When("User calls {string} using http {string} request")
    public void userCallsUsingHttpRequest(String resource, String method) {
        try {
            if (method.equalsIgnoreCase("post")) {
                response = bc.getFullSpec().when().post(bc.getUtil().getResourceURL(resource));
            } else if (method.equalsIgnoreCase("get")) {
                response = bc.getFullSpec().when().get(bc.getUtil().getResourceURL(resource));
            } else if (method.equalsIgnoreCase("delete")) {
                response = bc.getFullSpec().when().delete(bc.getUtil().getResourceURL(resource));
            } else if (method.equalsIgnoreCase("put")) {
                response = bc.getFullSpec().when().put(bc.getUtil().getResourceURL(resource));
            } else {
                throw new NullPointerException();
            }

            bc.setResponse(response);
        }
        catch(NullPointerException e ){
            System.out.println(method +"  method not found. Please check spelling and provide correct method.");
        }
    }

}