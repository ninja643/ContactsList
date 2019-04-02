package com.example.contactslist;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "CONTACTS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pickContact(View view) {
        Intent intent = new Intent(AlarmClock.ACTION_SHOW_ALARMS);

        Log.i(TAG, "Intent created");

        PackageManager packageManager = getPackageManager();

        ComponentName val = intent.resolveActivity(packageManager);

        Log.i(TAG, val != null ? "Resolved: " + val.toString() : "Could not resolve");

        if (val != null) {
            startActivity(intent);
        }
    }
}
