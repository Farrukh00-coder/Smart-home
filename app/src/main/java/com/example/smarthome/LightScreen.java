package com.example.smarthome;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class LightScreen extends AppCompatActivity {

    private ListView list;
    private ArrayList<Light> lights = new ArrayList<Light>();

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light);
        list();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void list()
    {
        addLight(new Light(1, "light1", false, 0, Color.valueOf(0xffffff)));
        addLight(new Light(2, "light2", false, 0, Color.valueOf(0xffffff)));
        addLight(new Light(3, "light3", false, 0, Color.valueOf(0xffffff)));
        addLight(new Light(4, "light4", false, 0, Color.valueOf(0xffffff)));
        list = (ListView) findViewById(R.id.list);
        ArrayList <String> lightNames = new ArrayList<String>();
        lightNames.add(lights.get(0).getName());
        lightNames.add(lights.get(1).getName());
        lightNames.add(lights.get(2).getName());
        lightNames.add(lights.get(3).getName());
        ArrayAdapter<String> adapter = new ArrayAdapter <String> (this, R.layout.light_collection, lightNames);
        list.setAdapter(adapter);
        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
                    {

                    }
                }
        );

    }

    public void addLight(Light light)
    {
        lights.add(light);
    }
}