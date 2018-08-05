package com.giveout.nyika.giveoutapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);
        Button donorButton = findViewById(R.id.donorBtn);
        Button center = findViewById(R.id.centersBtn);
       donorButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(WelcomeActivity.this,HomeActivity.class));
           }
       });
    }
}
