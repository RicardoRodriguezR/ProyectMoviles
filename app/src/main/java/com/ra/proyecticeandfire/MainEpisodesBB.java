package com.ra.proyecticeandfire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.ra.proyecticeandfire.Adapter.EpisodesBBAdapter;
import com.ra.proyecticeandfire.ApiManeger.RetrofitClientEpisodesBB;
import com.ra.proyecticeandfire.Models.EpisodesBB;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainEpisodesBB extends AppCompatActivity {

    ListView listAnime;
    ArrayList<EpisodesBB> myAnimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_episodesbb);

        listAnime = findViewById(R.id.ListAnimes);

        getFromInternetAnimes();
    }

    private void getFromInternetAnimes() {
        Call<ArrayList<EpisodesBB>> call = RetrofitClientEpisodesBB.getInstance().getMyApi().getAnimes();
        call.enqueue(new Callback<ArrayList<EpisodesBB>>(){


            @Override
            public void onResponse(Call<ArrayList<EpisodesBB>> call, Response<ArrayList<EpisodesBB>> response) {
                myAnimes = response.body();
                EpisodesBBAdapter adapter = new EpisodesBBAdapter(MainEpisodesBB.this, myAnimes);
                listAnime.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ArrayList<EpisodesBB>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Ocurrio un error", Toast.LENGTH_SHORT).show();
            }
        });
    }
}