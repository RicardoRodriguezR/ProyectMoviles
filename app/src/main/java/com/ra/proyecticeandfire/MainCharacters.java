package com.ra.proyecticeandfire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.ra.proyecticeandfire.Adapter.CharacterAdapter;
import com.ra.proyecticeandfire.ApiManeger.RetrofitClient;
import com.ra.proyecticeandfire.Models.Characters;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainCharacters extends AppCompatActivity {

    ListView listCharacter;
    ArrayList<Characters> myCharacters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_characters);

        listCharacter = findViewById(R.id.ListCharacters);

        getFromInternetCharacters();
    }

    private void getFromInternetCharacters() {
        Call<ArrayList<Characters>> call = RetrofitClient.getInstance().getMyApi().getCharacters();
        call.enqueue(new Callback<ArrayList<Characters>>() {
            @Override
            public void onResponse(Call<ArrayList<Characters>> call, Response<ArrayList<Characters>> response) {
                myCharacters = response.body();
                CharacterAdapter adapter = new CharacterAdapter(MainCharacters.this, myCharacters);
                listCharacter.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ArrayList<Characters>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Ocurrio un error", Toast.LENGTH_SHORT).show();
            }
        });
    }
}