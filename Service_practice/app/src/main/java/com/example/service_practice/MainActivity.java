package com.example.service_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button)findViewById(R.id.play);
        stop = (Button)findViewById(R.id.stop);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v == start){
            startService(new Intent(this, MainActivity2.class));
        }
        else if (v == stop){
            stopService(new Intent(this, MainActivity2.class));
        }
    }
}