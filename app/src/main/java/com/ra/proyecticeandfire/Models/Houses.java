package com.ra.proyecticeandfire.Models;

import com.google.gson.annotations.SerializedName;

public class Houses {

    @SerializedName("name")
    private String HouseName;

    @SerializedName("region")
    private  String HouseRegion;

    @SerializedName("coatOfArms")
    private String HouseCoatOfArms;

    @SerializedName("words")
    private String HouseWords;

    public String getHouseName() {
        return HouseName;
    }

    public void setHouseName(String houseName) {
        HouseName = houseName;
    }

    public String getHouseRegion() {
        return HouseRegion;
    }

    public void setHouseRegion(String houseRegion) {
        HouseRegion = houseRegion;
    }

    public String getHouseCoatOfArms() {
        return HouseCoatOfArms;
    }

    public void setHouseCoatOfArms(String houseCoatOfArms) {
        HouseCoatOfArms = houseCoatOfArms;
    }

    public String getHouseWords() {
        return HouseWords;
    }

    public void setHouseWords(String houseWords) {
        HouseWords = houseWords;
    }

}
