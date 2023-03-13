package com.example.daniel_karp_millionare_m4_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
    }
    //This button will return the winner to the starting screen
    public void btn_click13(View v)
    {
        Intent int_obj = new Intent(this, MainActivity.class);
        startActivity(int_obj);
    }
}