package com.ra.proyecticeandfire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.ra.proyecticeandfire.Adapter.AnimeAdapter;
import com.ra.proyecticeandfire.ApiManeger.RetrofitClientAnime;
import com.ra.proyecticeandfire.Models.Animes;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainAnimes extends AppCompatActivity {

    ListView listAnime;
    ArrayList<Animes> myAnimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_animes);

        listAnime = findViewById(R.id.ListAnimes);

        getFromInternetAnimes();
    }

    private void getFromInternetAnimes() {
        Call<ArrayList<Animes>> call = RetrofitClientAnime.getInstance().getMyApi().getAnimes();
        call.enqueue(new Callback<ArrayList<Animes>>(){


            @Override
            public void onResponse(Call<ArrayList<Animes>> call, Response<ArrayList<Animes>> response) {
                myAnimes = response.body();
                AnimeAdapter adapter = new AnimeAdapter(MainAnimes.this, myAnimes);
                listAnime.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ArrayList<Animes>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Ocurrio un error", Toast.LENGTH_SHORT).show();
            }
        });
    }
}