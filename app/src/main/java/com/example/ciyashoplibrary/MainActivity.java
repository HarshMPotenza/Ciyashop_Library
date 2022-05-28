package com.example.ciyashoplibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       /* String id = "e06e3871-0f4e-444f-a85e-61a4a57bacb3";

        try {

            OneSignalClass obj = new OneSignalValidator().validator(this, true, id);

            if (obj != null) {
                Log.e(TAG, "onCreate: " + "if" + " ");
                obj.initilizationOneSignal(this,id);
            } else {
                Log.e(TAG, "onCreate: " + "else" + "");
            }
        } catch (Exception e) {
            Log.e(TAG, "onCreate: " + e.getMessage());
        }*/

    }
}