package com.ra.proyecticeandfire.ApiManeger;

import com.ra.proyecticeandfire.Models.EpisodesBB;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEpisodesBB {

    String Base_URL2="https://www.breakingbadapi.com/api/";

    @GET("episodes")
    Call<ArrayList<EpisodesBB>> getAnimes();
}
