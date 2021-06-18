package com.ra.proyecticeandfire.Models;

import com.google.gson.annotations.SerializedName;

public class EpisodesBB {

    @SerializedName("title")
    private String  AnimeTitle;

    public String getAnimeTitle(){
        return AnimeTitle;
    }

    public void setAnimeName(String animeTitle){
        animeTitle = animeTitle;
    }
}
