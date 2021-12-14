package com.example.examtp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static  String EXTRA_name = "com.example.examtp.EXTRA_name";
    public static  String EXTRA_email = "com.example.examtp.EXTRA_email";
    public static  String EXTRA_option = "com.example.examtp.EXTRA_option";
    public static String EXTRA_na = "com.example.examtp.EXTRA_na";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View v){

        EditText xName = findViewById(R.id.flname);
        EditText xEmail = findViewById(R.id.email);
        EditText xOption = findViewById(R.id.option);
        EditText xNa = findViewById(R.id.na);

        String name = flname.getText().toString();
        String email = xEmail.getText().toString();
        String option = xOption.getText().toString();
        String na = xNa.getText().toString();

        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra(EXTRA_name,name);
        intent.putExtra(EXTRA_email,email);
        intent.putExtra(EXTRA_option,option);
        intent.putExtra(EXTRA_na,na);
        startActivity(intent);

    }
}