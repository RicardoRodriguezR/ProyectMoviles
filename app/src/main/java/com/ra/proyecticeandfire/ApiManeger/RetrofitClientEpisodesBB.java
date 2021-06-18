package com.ra.proyecticeandfire.ApiManeger;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientEpisodesBB {

    private static RetrofitClientEpisodesBB instance = null;
    private ApiEpisodesBB myApi;

    public RetrofitClientEpisodesBB(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(ApiEpisodesBB.Base_URL2).addConverterFactory(GsonConverterFactory.create()).build();
        myApi = retrofit.create(ApiEpisodesBB.class);
    }

    public static synchronized RetrofitClientEpisodesBB getInstance(){
        if (instance == null){
            instance = new RetrofitClientEpisodesBB();
        }
        return instance;
    }

    public ApiEpisodesBB getMyApi(){
        return myApi;
    }
}
