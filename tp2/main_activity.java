package com.example.tp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCalImc(View view){
    
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        RadioButton radioButton = findViewById(radioGroup.getCheckedRadioButtonId());
        
        EditText poid = findViewById(R.id.Poid);
        double poidValue = Double.parseDouble(poid.getText().toString());
        
        EditText taill = findViewById(R.id.taill);s
        double taillValue = Double.parseDouble(taill.getText().toString());
        
        TextView res = findViewById(R.id.textResult);
        double result ;

        if(radioButton.getText().toString().equals("Metre")){

            result = poidValue / taillValue;
            res.setText("Resulat: " + Math.round(result * 100.0)/100.0 );
        
        } else {
             
            result = poidValue / ( taillValue / 100);
            res.setText("Resulat: " + Math.round(result * 100.0)/100.0 );
        
        }
    }
}