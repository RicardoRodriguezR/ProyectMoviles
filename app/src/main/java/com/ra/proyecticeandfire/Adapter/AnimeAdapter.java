package com.ra.proyecticeandfire.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ra.proyecticeandfire.Models.Animes;
import com.ra.proyecticeandfire.Models.Books;
import com.ra.proyecticeandfire.R;

import java.util.List;
import java.util.zip.Inflater;

public class AnimeAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<Animes> myAnimes;

    public AnimeAdapter(Activity activity, List<Animes> myAnimes) {
        this.activity = activity;
        this.myAnimes = myAnimes;
    }


    @Override
    public int getCount() {
        return myAnimes.size();
    }

    @Override
    public Object getItem(int position) {
        return myAnimes.get(position);
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
            v = inf.inflate(R.layout.animeitem, null);
        }

        Animes animes = myAnimes.get(position);
        TextView nameAnime = v.findViewById(R.id.txtAnimeName);
        nameAnime.setText(animes.getAnimeTitle());

        return v;
    }
}
