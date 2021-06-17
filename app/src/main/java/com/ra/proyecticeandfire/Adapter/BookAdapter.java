package com.ra.proyecticeandfire.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ra.proyecticeandfire.Models.Books;
import com.ra.proyecticeandfire.R;

import java.util.List;

public class BookAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<Books> myBooks;

    public BookAdapter(Activity activity, List<Books> myBooks) {
        this.activity = activity;
        this.myBooks = myBooks;
    }


    @Override
    public int getCount() {
        return myBooks.size();
    }

    @Override
    public Object getItem(int position) {
        return myBooks.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.bookitem, null);
        }

        Books book = myBooks.get(position);
        TextView nameBook = v.findViewById(R.id.txtName);
        nameBook.setText(book.getBookName());

        return v;
    }
}
