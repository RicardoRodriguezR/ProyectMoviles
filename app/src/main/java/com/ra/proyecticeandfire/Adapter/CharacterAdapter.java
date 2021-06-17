package com.ra.proyecticeandfire.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ra.proyecticeandfire.Models.Characters;
import com.ra.proyecticeandfire.R;

import java.util.List;

public class CharacterAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<Characters> myCharacters;

    public CharacterAdapter(Activity activity, List<Characters> myCharacters) {
        this.activity = activity;
        this.myCharacters = myCharacters;
    }

    @Override
    public int getCount() {
        return myCharacters.size();
    }

    @Override
    public Object getItem(int position) {
        return myCharacters.get(position);
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
            v = inf.inflate(R.layout.characteritem, null);
        }

        Characters character = myCharacters.get(position);

        TextView nameCharacter = v.findViewById(R.id.txtNameCharacter);
        TextView genderCharacter = v.findViewById(R.id.txtGender);
        TextView cultureCharacter = v.findViewById(R.id.txtCulture);
        TextView bornCharacter = v.findViewById(R.id.txtBorn);
        TextView diedCharacter = v.findViewById(R.id.txtDied);

        nameCharacter.setText(character.getChareacterName());
        genderCharacter.setText(character.getChareacterGender());
        cultureCharacter.setText(character.getChareacterCulture());
        bornCharacter.setText(character.getChareacterBorn());
        diedCharacter.setText(character.getChareacterDied());

        return v;
    }
}
