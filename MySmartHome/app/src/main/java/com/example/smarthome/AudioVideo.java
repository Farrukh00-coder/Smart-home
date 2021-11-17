package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AudioVideo extends AppCompatActivity {

    Button btn_backaudvid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_video);


        btn_backaudvid = findViewById(R.id.btn_backaudvid);


        btn_backaudvid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Home.class);
                startActivity(i);
                setContentView(R.layout.activity_home);
            }
        });
    }
}