package com.example.smartkids1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SmartKids2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart_kids2);
    }
    public void intentScreenHuruf(View view ){
        Intent myIntent = new Intent(this,SmartKids3.class);
        startActivity(myIntent);
    }

}