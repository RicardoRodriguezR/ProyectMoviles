package com.ra.proyecticeandfire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.ra.proyecticeandfire.Adapter.BookAdapter;
import com.ra.proyecticeandfire.ApiManeger.RetrofitClient;
import com.ra.proyecticeandfire.Models.Books;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainBooks extends AppCompatActivity {

    ListView listBook;
    ArrayList<Books> myBooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_books);

        listBook = findViewById(R.id.ListBook);

        getFromInternetBooks();
    }

    private void getFromInternetBooks() {
        Call<ArrayList<Books>> call = RetrofitClient.getInstance().getMyApi().getBooks();
        call.enqueue(new Callback<ArrayList<Books>>() {


            @Override
            public void onResponse(Call<ArrayList<Books>> call, Response<ArrayList<Books>> response) {
                myBooks = response.body();
                BookAdapter adapter = new BookAdapter(MainBooks.this, myBooks);
                listBook.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ArrayList<Books>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Ocurrio un error", Toast.LENGTH_SHORT).show();
            }

        });
    }
}