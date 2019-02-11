package com.example.trombinoscope;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
// ROMAIN FIEVEZ TAYFUN BILGEN SHINY SAING
public class PersonAdapter extends ArrayAdapter<Person> {
    public PersonAdapter(Context context, List<Person> lesPersonnes){
        super(context, 0, lesPersonnes);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.person_item,parent, false);


        PersonView viewHolder = (PersonView) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new PersonView();
            viewHolder.nom = (TextView) convertView.findViewById(R.id.nom);
            viewHolder.prenom = (TextView) convertView.findViewById(R.id.prenom);
            viewHolder.avatar = (ImageView) convertView.findViewById(R.id.avatar);
            convertView.setTag(viewHolder);

        }

        Person unePer = getItem(position);

        viewHolder.nom.setText(unePer.getNom());
        viewHolder.prenom.setText(unePer.getPrenom());
        viewHolder.avatar.setImageDrawable(new ColorDrawable(unePer.getCouleur()));


        return convertView;
    }

    private class PersonView{
        public TextView nom;
        public TextView prenom;
        public ImageView avatar;
    }
}
