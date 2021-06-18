package com.ra.proyecticeandfire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnBooks;
    private Button btnHouses;
    private Button btnCharacters;
    private Button btnAnimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBooks = findViewById(R.id.btnBooks);
        btnHouses = findViewById(R.id.btnHouses);
        btnCharacters = findViewById(R.id.btnCharacters);
        btnAnimes = findViewById(R.id.btnAnimes);

        btnBooks.setOnClickListener(this);
        btnHouses.setOnClickListener(this);
        btnCharacters.setOnClickListener(this);
        btnAnimes.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnBooks){
        Intent BooksIntent = new Intent(this, MainBooks.class);
        startActivity(BooksIntent);
        }
        if(v.getId() == R.id.btnHouses){
            Intent HousesIntent = new Intent(this, MainHouses.class);
            startActivity(HousesIntent);
        }
        if (v.getId() == R.id.btnCharacters){
            Intent CharactersIntent = new Intent(this, MainCharacters.class);
            startActivity(CharactersIntent);
        }
        if (v.getId()==R.id.btnAnimes){
            Intent AnimesIntent = new Intent(this, MainEpisodesBB.class);
            startActivity(AnimesIntent);
        }
    }
}