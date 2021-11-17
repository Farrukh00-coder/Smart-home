package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;

import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class ElectricityControl extends AppCompatActivity {
    private LinearLayout expandableview;
    private TextView tv_eleclabel;
    private CardView cardview;
    private Button btn_backElec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity_control);

        expandableview = findViewById(R.id.expanable_view);
        tv_eleclabel = findViewById(R.id.id_TvelecLabel);
        cardview = findViewById(R.id.id_cardview);
         btn_backElec = findViewById(R.id.btn_backArrow);




         btn_backElec.setOnClickListener(new View.OnClickListener() {
             @Override
              public void onClick(View view) {
                 Intent i = new Intent(getApplicationContext(),Home.class);
                 startActivity(i);
                 setContentView(R.layout.activity_home);
             }
         });

    }



    public void Fridge(View view) {

        if (expandableview.getVisibility() == View.GONE) {
            TransitionManager.beginDelayedTransition(cardview, new AutoTransition());
            expandableview.setVisibility(View.VISIBLE);

        } else {
            TransitionManager.beginDelayedTransition(cardview, new AutoTransition());
            expandableview.setVisibility(View.GONE);

        }



      /*  btn_backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Home.class);
                startActivity(i);
                setContentView(R.layout.activity_home);
            }
        });
*/
    }




}