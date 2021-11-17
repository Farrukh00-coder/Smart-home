package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AddUserScreen extends AppCompatActivity {
     private Button btn_addUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user_screen);

        btn_addUser=findViewById(R.id.btn_addUser);


        btn_addUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Show Toast message
                Toast.makeText(AddUserScreen.this,"User Added",Toast.LENGTH_LONG).show();

                Intent i = new Intent(getApplicationContext(),HelloAdminscrn.class);
                startActivity(i);
                setContentView(R.layout.content_hello_admin_scrn);
            }
        });


    }
}