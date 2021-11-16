package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelloAdminscrn extends AppCompatActivity {

    Button btn_home;
    Button btn_back_hel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_adminscrn);
        btn_home = findViewById(R.id.btn_home);
        btn_back_hel = findViewById(R.id.btn_back_hel);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Home.class);
                startActivity(i);
                setContentView(R.layout.activity_home);
            }
        });




        btn_back_hel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),LogIn_Activity.class);
                startActivity(i);
                setContentView(R.layout.activity_log_in);
            }
        });
    }
}