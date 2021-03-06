/*
Author -> Praveen Kumar
 */

package stepDefinitions;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TemporaryStore {

    private RequestSpecification fullSpec;
    private Response response;
    private static String place_id;

    private static TemporaryStore obj;
    private TemporaryStore() {}

    public static TemporaryStore getInstance()
    {
        if (obj==null)
            obj = new TemporaryStore();
        return obj;
    }

    public RequestSpecification getFullSpec() {
        return this.fullSpec;
    }

    public void setFullSpec(RequestSpecification fullSpec) {
        this.fullSpec = fullSpec;
    }

    public Response getResponse() {
        return this.response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        TemporaryStore.place_id = place_id;
    }


}
