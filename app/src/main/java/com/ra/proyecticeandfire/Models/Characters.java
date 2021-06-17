package com.ra.proyecticeandfire.Models;

import com.google.gson.annotations.SerializedName;

public class Characters {

    @SerializedName("name")
    private String ChareacterName;

    @SerializedName("gender")
    private String ChareacterGender;

    @SerializedName("culture")
    private String ChareacterCulture;

    @SerializedName("born")
    private String ChareacterBorn;

    @SerializedName("died")
    private String ChareacterDied;

    public String getChareacterName() {
        return ChareacterName;
    }

    public void setChareacterName(String chareacterName) {
        ChareacterName = chareacterName;
    }

    public String getChareacterGender() {
        return ChareacterGender;
    }

    public void setChareacterGender(String chareacterGender) {
        ChareacterGender = chareacterGender;
    }

    public String getChareacterCulture() {
        return ChareacterCulture;
    }

    public void setChareacterCulture(String chareacterCulture) {
        ChareacterCulture = chareacterCulture;
    }

    public String getChareacterBorn() {
        return ChareacterBorn;
    }

    public void setChareacterBorn(String chareacterBorn) {
        ChareacterBorn = chareacterBorn;
    }

    public String getChareacterDied() {
        return ChareacterDied;
    }

    public void setChareacterDied(String chareacterDied) {
        ChareacterDied = chareacterDied;
    }
}
