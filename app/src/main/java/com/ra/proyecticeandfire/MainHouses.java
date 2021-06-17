package com.ra.proyecticeandfire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.ra.proyecticeandfire.Adapter.HouseAdapter;
import com.ra.proyecticeandfire.ApiManeger.RetrofitClient;
import com.ra.proyecticeandfire.Models.Houses;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainHouses extends AppCompatActivity {

    ListView listHouse;
    ArrayList<Houses> myHouses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_houses);

        listHouse = findViewById(R.id.ListHouses);

        getFromInternetHouses();
    }

    private void getFromInternetHouses(){
        Call<ArrayList<Houses>> call = RetrofitClient.getInstance().getMyApi().getHouses();
        call.enqueue(new Callback<ArrayList<Houses>>() {
            @Override
            public void onResponse(Call<ArrayList<Houses>> call, Response<ArrayList<Houses>> response) {
                myHouses = response.body();
                HouseAdapter adapter = new HouseAdapter(MainHouses.this, myHouses);
                listHouse.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ArrayList<Houses>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Ocurrio un error", Toast.LENGTH_SHORT).show();
            }
        });
    }
}