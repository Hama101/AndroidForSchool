package com.example.examtp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.HashMap;


public class MainActivity2 extends AppCompatActivity {

    HashMap<String,String> map;
    Etudiant etudiant = new Etudiant();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView list = findViewById(R.id.list);
        Intent intent = getIntent();

        String name = intent.getStringExtra(MainActivity.EXTRA_name);
        String email = intent.getStringExtra(MainActivity.EXTRA_email);
        String option = intent.getStringExtra(MainActivity.EXTRA_option);
        String na = intent.getStringExtra(MainActivity.EXTRA_na);

        map = new HashMap<String,String>();

        map.put("name",name);
        map.put("email",email);
        map.put("option",option);
        map.put("na",na);
        etudiant.values.add(map);

        SimpleAdapter adapter = new SimpleAdapter(this,e.values,R.layout.item,
                new String[]{
                    "name",
                    "email",
                    "na",
                    "option"
                },
                new int[]{
                    R.id.nom,
                    R.id.mail,
                    R.id.ab,
                    R.id.op
                });
        list.setAdapter(adapter);
    }

}