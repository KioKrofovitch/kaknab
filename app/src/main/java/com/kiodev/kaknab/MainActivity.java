package com.kiodev.kaknab;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickTulum(View view){
        Uri tulumUri = Uri.parse("google.streetview:cbll=20.2152725,-87.4287996");
        launchMapView(tulumUri);
    }

    public void onClickAkumal(View view){
        Uri akumalUri = Uri.parse("google.streetview:cbll=20.3959299,-87.3100734");
        launchMapView(akumalUri);
    }

    public void onClickXpuHa(View view){
        Uri xpuHaUri = Uri.parse("google.streetview:cbll=20.4683153,-87.2604617");
        launchMapView(xpuHaUri);
    }

    public void onClickXelHa(View view){
        Uri xelHaUri = Uri.parse("google.streetview:cbll=20.4347062,-87.2862159");
        launchMapView(xelHaUri);
    }
    private void launchMapView(Uri locUri){
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, locUri);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            mapIntent.setFlags(Intent.FLAG_ACTIVITY_LAUNCH_ADJACENT);
        }
        mapIntent.setPackage("com.google.android.apps.maps");

        // Attempt to start an activity that can handle the Intent
        startActivity(mapIntent);
    }
}
