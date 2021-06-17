package com.ra.proyecticeandfire.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ra.proyecticeandfire.Models.Books;
import com.ra.proyecticeandfire.Models.Houses;
import com.ra.proyecticeandfire.R;

import java.util.List;

public class HouseAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<Houses> myHouses;

    public HouseAdapter(Activity activity, List<Houses> myHouses) {
        this.activity = activity;
        this.myHouses = myHouses;
    }

    @Override
    public int getCount() {
        return myHouses.size();
    }

    @Override
    public Object getItem(int position) {
        return myHouses.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.houseitem, null);
        }

        Houses house = myHouses.get(position);

        TextView nameHouse = v.findViewById(R.id.txtNameHouse);
        TextView regionHouse = v.findViewById(R.id.txtRegion);
        TextView coatOfArmsHouse = v.findViewById(R.id.txtCoatOfArms);
        TextView worsHouse = v.findViewById(R.id.txtWors);

        nameHouse.setText(house.getHouseName());
        regionHouse.setText(house.getHouseRegion());
        coatOfArmsHouse.setText(house.getHouseCoatOfArms());
        worsHouse.setText(house.getHouseWords());

        return v;
    }
}
