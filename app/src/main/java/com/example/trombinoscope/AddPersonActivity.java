package com.example.trombinoscope;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
// ROMAIN FIEVEZ TAYFUN BILGEN SHINY SAING
public class AddPersonActivity extends AppCompatActivity {



    private static final String TAG = MainActivity.class.getName();



    public static ArrayList<Person> lesPersonnes = new ArrayList<Person>();
    ListView mListView;
    Button btn_add;

    public static void deletePerson(ArrayList<Person> lesPersonnesDel){
        for(Person unePer : lesPersonnesDel){
            lesPersonnes.remove(unePer);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_person);

        //tasks = new ArrayList<String>();





        btn_add =(Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Log.i(TAG, "ajout d'une personne sur le trombi");

                EditText ET_nom = (EditText) findViewById(R.id.ET_nom);
                final String chaine_nom = ET_nom.getText().toString();

                EditText ET_prenom = (EditText) findViewById(R.id.ET_prenom);
                final String chaine_prenom = ET_prenom.getText().toString();
                Person unePer = new Person(ET_nom.getText().toString(), ET_prenom.getText().toString(), Color.BLACK);
                lesPersonnes.add(unePer);

                //Pour voir la valeur que j'ai récupérée
                Log.v("Essai", chaine_nom);
                Log.v("Essai", chaine_prenom);

                Toast.makeText(getApplicationContext(), "Ajout de " + ET_nom.getText().toString() + " " + ET_prenom.getText().toString() + " au trombinoscope", Toast.LENGTH_LONG).show();

                //mListView = (ListView) findViewById(R.id.LV_list);
                //mListView.add(chaine_nom + chaine_prenom);


                Intent activityChangeIntent = new Intent(AddPersonActivity.this, MainActivity.class);
                AddPersonActivity.this.startActivity(activityChangeIntent);
            }
        });



    }
}
