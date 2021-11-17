package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Home extends AppCompatActivity {

     ImageButton IB_Light ,IB_temp , IB_electricity, IB_Locks, IB_VidAud;
     Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        IB_Light = findViewById(R.id.IB_Light);
        IB_temp = findViewById(R.id.IB_Temp);
        IB_electricity = findViewById(R.id.IB_Electricity);
        IB_Locks = findViewById(R.id.IB_Locks);
        IB_VidAud = findViewById(R.id.IB_VidAud);

        btn_back = findViewById(R.id.btn_backhome);




        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),HelloAdminscrn.class);
                startActivity(i);
                setContentView(R.layout.content_hello_admin_scrn);
            }
        });

       IB_VidAud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),AudioVideo.class);
                startActivity(i);
                setContentView(R.layout.activity_audio_video);
            }
        });

/*
        IB_Locks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Doors.class);
                startActivity(i);
                setContentView(R.layout.activity_doors);
            }
        });
*/
        IB_electricity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),ElectricityControl.class);
                startActivity(i);
                setContentView(R.layout.activity_electricity_control);
            }
        });




    }
}