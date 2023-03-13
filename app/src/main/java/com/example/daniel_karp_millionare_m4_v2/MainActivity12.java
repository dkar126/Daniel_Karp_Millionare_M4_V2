package com.example.daniel_karp_millionare_m4_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
    }
    //This button is for the correct answer. The player will move on in the game.
    public void btn_click12(View v)
    {
        Intent int_obj = new Intent(this, MainActivity13.class);
        startActivity(int_obj);
    }

    //This button is for the wrong answers. The player will be sent to a "you lost" screen
    public void btn_click3(View v)
    {
        Intent int_obj = new Intent(this, MainActivity3.class);
        startActivity(int_obj);
    }
}