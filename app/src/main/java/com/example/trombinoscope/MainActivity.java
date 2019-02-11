package com.example.trombinoscope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
// ROMAIN FIEVEZ TAYFUN BILGEN SHINY SAING
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();
    Button btn_trombi;
    Button btn_addperson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_trombi =(Button) findViewById(R.id.btn_trombi);
        btn_trombi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Log.i(TAG, "redirection vers personnslist");
                Toast.makeText(getApplicationContext(), "bienvenue au trombinoscope", Toast.LENGTH_LONG).show();
                Intent activityChangeIntent = new Intent(MainActivity.this, PersonsListActivity.class);
                MainActivity.this.startActivity(activityChangeIntent);
            }
        });

        btn_addperson =(Button) findViewById(R.id.btn_addperson);
        btn_addperson.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Log.i(TAG, "Rediction vers add person");
                Toast.makeText(getApplicationContext(), "bienvenue au add person", Toast.LENGTH_LONG).show();
                Intent activityChangeIntent = new Intent(MainActivity.this, AddPersonActivity.class);
                MainActivity.this.startActivity(activityChangeIntent);
            }
        });
    }


}
