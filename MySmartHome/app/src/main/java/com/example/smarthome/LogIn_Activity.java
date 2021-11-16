package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.smarthome.ui.login.RegisterFragment;

public class LogIn_Activity extends AppCompatActivity
{
    TextView txt_smathome;
    AppCompatEditText edt_username,edt_password;
    TextView tv_forgetPass,tv_register;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        btn_login =   findViewById(R.id.btn_Login);
        txt_smathome = findViewById(R.id.txt_smathome);
        edt_username = findViewById(R.id.edt_username);
        edt_password = findViewById(R.id.edt_password);
        tv_forgetPass = findViewById(R.id.tv_forgotPass);
        tv_register = findViewById(R.id.tv_register);



        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),HelloAdminscrn.class);
                startActivity(i);
                setContentView(R.layout.activity_hello_adminscrn);
            }
        });

    }


}
