package com.ra.proyecticeandfire.ApiManeger;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientAnime {

    private static RetrofitClientAnime instance = null;
    private ApiAnime myApi;

    public RetrofitClientAnime(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(ApiAnime.Base_URL2).addConverterFactory(GsonConverterFactory.create()).build();
        myApi = retrofit.create(ApiAnime.class);
    }

    public static synchronized RetrofitClientAnime getInstance(){
        if (instance == null){
            instance = new RetrofitClientAnime();
        }
        return instance;
    }

    public ApiAnime getMyApi(){
        return myApi;
    }
}
