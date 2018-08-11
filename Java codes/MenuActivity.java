package com.example.bhargav.mithila1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void hit1(View v1){
        Intent i1 = new Intent(MenuActivity.this,MainActivity.class);
        startActivity(i1);
    }

    public void hit2(View v2){
        Intent i2 = new Intent(MenuActivity.this,Main2Activity.class);
        startActivity(i2);
    }

    public void hit3(View v3){
        Intent i3 = new Intent(MenuActivity.this,Main3Activity.class);
        startActivity(i3);
    }

    public void hit4(View v4){
        Intent i4 = new Intent(MenuActivity.this,Main4Activity.class);
        startActivity(i4);
    }

    public void hits(View v5){
        Intent i5 = new Intent(MenuActivity.this,shuffle.class);
        startActivity(i5);

    }
}
