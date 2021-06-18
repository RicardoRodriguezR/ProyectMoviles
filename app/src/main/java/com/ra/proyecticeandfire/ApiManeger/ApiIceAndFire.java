package com.ra.proyecticeandfire.ApiManeger;

import com.ra.proyecticeandfire.Models.Books;
import com.ra.proyecticeandfire.Models.Characters;
import com.ra.proyecticeandfire.Models.Houses;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiIceAndFire {
    String BASE_URL="https://anapioficeandfire.com/api/";

    @GET("books")
    Call<ArrayList<Books>>getBooks();

    @GET("houses")
    Call<ArrayList<Houses>> getHouses();

    @GET("characters")
    Call<ArrayList<Characters>> getCharacters();
}
