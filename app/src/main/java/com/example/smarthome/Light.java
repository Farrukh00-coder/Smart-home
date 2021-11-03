package com.example.smarthome;

import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class Light {
    private boolean turnedOn; //если включен - true, если выключен - false
    private int brightness; //яркость от 0 до 100
    private Color color; //цвет

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Light()
    {
        this.turnedOn = false;
        this.brightness = 0;
        this.color = Color.valueOf(0xffffff);
    }

    public Light(boolean turnedOn, int brightness, Color color)
    {
        this.turnedOn = turnedOn;
        this.brightness = brightness;
        this.color = color;
    }

    public boolean getTurnedOn() {
        return this.turnedOn;
    }

    public int getBrightness()
    {
        return this.brightness;
    }

    public void setBrightness(int brightness)
    {
        this.brightness = brightness;
    }

    public Color getColor()
    {
        return this.color;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    //включить свет
    public void turnOn()
    {
        this.turnedOn = true;
    }

    //выключить свет
    public void turnOff()
    {
        this.turnedOn = false;
    }
}
