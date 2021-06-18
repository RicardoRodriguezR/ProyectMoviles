package com.ra.proyecticeandfire.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ra.proyecticeandfire.Models.EpisodesBB;
import com.ra.proyecticeandfire.R;

import java.util.List;

public class EpisodesBBAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<EpisodesBB> myAnimes;

    public EpisodesBBAdapter(Activity activity, List<EpisodesBB> myAnimes) {
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
            v = inf.inflate(R.layout.episodesbbitem, null);
        }

        EpisodesBB episodesBB = myAnimes.get(position);
        TextView nameAnime = v.findViewById(R.id.txtAnimeName);
        nameAnime.setText(episodesBB.getAnimeTitle());

        return v;
    }
}
