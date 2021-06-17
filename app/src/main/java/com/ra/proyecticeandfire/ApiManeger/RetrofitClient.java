package com.ra.proyecticeandfire.ApiManeger;

import com.ra.proyecticeandfire.R;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static RetrofitClient instance = null;
    private ApiIceAndFire myApi;

    public RetrofitClient(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(ApiIceAndFire.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        myApi = retrofit.create(ApiIceAndFire.class);
    }

    public static synchronized RetrofitClient getInstance(){
        if(instance == null){
            instance = new RetrofitClient();
        }
        return instance;
    }

    public ApiIceAndFire getMyApi(){
        return myApi;
    }
}
