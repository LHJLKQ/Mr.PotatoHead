package com.example.mrpotatohead;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     ImageView imArray[] = new ImageView[10];
     CheckBox cbArray[] = new CheckBox[10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initImArray();
        initCbArray();
        giveCbListener();
    }

    public void initImArray(){
        imArray[0] = findViewById(R.id.arm);
        imArray[1] = findViewById(R.id.ears);
        imArray[2] = findViewById(R.id.eyebrows);
        imArray[3] = findViewById(R.id.eyes);
        imArray[4] = findViewById(R.id.glasses);
        imArray[5] = findViewById(R.id.hat);
        imArray[6] = findViewById(R.id.mouth);
        imArray[7] = findViewById(R.id.mustache);
        imArray[8] = findViewById(R.id.nose);
        imArray[9] = findViewById(R.id.shoes);

        for(int i = 0;i<10;i++){
            imArray[i].setVisibility(View.INVISIBLE);
        }
    }

    public void initCbArray(){
        cbArray[0] = findViewById(R.id._arms);
        cbArray[1] = findViewById(R.id._ears);
        cbArray[2] = findViewById(R.id._eyebrows);
        cbArray[3] = findViewById(R.id._eyes);
        cbArray[4] = findViewById(R.id._glasses);
        cbArray[5] = findViewById(R.id._hat);
        cbArray[6] = findViewById(R.id._mouth);
        cbArray[7] = findViewById(R.id._mustache);
        cbArray[8] = findViewById(R.id._nose);
        cbArray[9] = findViewById(R.id._shoes);
    }

    public void  giveCbListener(){


        for(int index = 0;index < 10;index++){
            final int i= index;
            cbArray[i].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(imArray[i].getVisibility() == View.INVISIBLE)
                        imArray[i].setVisibility(View.VISIBLE);
                    else imArray[i].setVisibility(View.INVISIBLE);
                }
            });
        }
        ;



    }
}
