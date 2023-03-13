package com.example.daniel_karp_millionare_m4_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    //On click the button will let the user restart the quiz
    public void btn_click99(View v)
    {

        Intent int_obj = new Intent(this, MainActivity2.class);
        startActivity(int_obj);


    }
}