/*
Author -> Praveen Kumar

Create payload for AddPlace
 */

package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AddPlace {

    @JsonProperty("location")
    private Location location;

    @JsonProperty("accuracy")
    private int accuracy;

    @JsonProperty("name")
    private String name;

    @JsonProperty("phone_number")
    private String phone_number;

    @JsonProperty("address")
    private String address;

    @JsonProperty("types")
    private List<String> types;

    @JsonProperty("website")
    private String website;

    @JsonProperty("language")
    private String language;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }





}
