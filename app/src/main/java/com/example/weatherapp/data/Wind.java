package com.example.weatherapp.data;

import org.json.JSONObject;

//JSON Parser for Wind data
public class Wind implements JSON {

    private int speed;

    public int getSpeed() {
        return speed;
    }

    @Override
    public void json(JSONObject data) {
        speed=data.optInt("speed");
    }
}
