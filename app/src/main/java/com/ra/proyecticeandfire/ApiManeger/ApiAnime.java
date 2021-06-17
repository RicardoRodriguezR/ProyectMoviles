package com.ra.proyecticeandfire.ApiManeger;

import com.ra.proyecticeandfire.Models.Animes;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiAnime {

    String Base_URL2="https://www.breakingbadapi.com/api/";

    @GET("episodes")
    Call<ArrayList<Animes>> getAnimes();
}
