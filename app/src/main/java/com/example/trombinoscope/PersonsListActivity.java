package com.example.trombinoscope;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
// ROMAIN FIEVEZ TAYFUN BILGEN SHINY SAING
public class PersonsListActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    private ListView mListView;
    private ArrayList<Person> selectedPersons = new ArrayList<Person>();
    private ArrayList<View> selectedChilds = new ArrayList<View>();

    Button btn_del;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persons_list);

        mListView = (ListView) findViewById(R.id.LV_list);
        PersonAdapter adapter = new PersonAdapter(this, AddPersonActivity.lesPersonnes);
        mListView.setAdapter(adapter);

        mListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

             @Override
             public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                 Person person = (Person) arg0.getItemAtPosition(arg2);
                 Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_LONG).show();
                 View child = arg0.getChildAt(arg2);
                 if(!selectedChilds.contains(child)){
                     Log.i(TAG, "SELECT");
                     //Change background
                     arg0.getChildAt(arg2).setBackgroundColor(Color.GRAY);
                     Log.i(TAG, "SET MARKER");
                     //ADD in selected list
                     selectedChilds.add(child);
                     selectedPersons.add(person);


                 }
                 return true;
             }
         });

        btn_del =(Button) findViewById(R.id.btn_del);
        btn_del.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Log.i(TAG, "Suppression");
                Toast.makeText(getApplicationContext(), "suppriessssssssssssion", Toast.LENGTH_LONG).show();
                //Intent activityChangeIntent = new Intent(MainActivity.this, PersonsListActivity.class);
               // MainActivity.this.startActivity(activityChangeIntent);
                AddPersonActivity.deletePerson(selectedPersons);
                mListView.invalidateViews();
            }
        });





        mListView.setAdapter(adapter);





    }

}
