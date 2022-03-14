package com.danifitrianto.viewandevents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView t1;
    Button btnChanged;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // connect to the reference
        t1 = (TextView) findViewById(R.id.t1);
        btnChanged = (Button) findViewById(R.id.b1);

        // handling this click listener only in this class
        btnChanged.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        t1.setText("Halo,Dani!");
    }

    // using xml implementation with button 2
    public void changeText(View v) {
        t1.setText("Halo Lagi, Dani!");
    }
}