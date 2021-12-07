package com.example.incrementer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnINC , btnDEC , btnRESET;
    TextView txtVal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // finding the UI element and assigning them to the value of the variables
        btnINC = findViewById(R.id.increment);
        btnDEC = findViewById(R.id.decrement);
        txtVal = findViewById(R.id.value);
        btnRESET = findViewById(R.id.reset);

        // handling the increment function
        btnINC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String currentValue = txtVal.getText().toString();
              int value = Integer.parseInt(currentValue);
              ++value;
              txtVal.setText(String.valueOf(value));
            }
        });

        // handling the decrement function
        btnDEC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String currentValue = txtVal.getText().toString();
            int value = Integer.parseInt(currentValue);
            --value;
            txtVal.setText(String.valueOf(value));
            }
        });

        //handling the rest function
        btnRESET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentValue = txtVal.getText().toString();
                int value = Integer.parseInt(currentValue);
                value = 0;
                txtVal.setText(String.valueOf(value));
            }
        });
    }
}
