package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
//import android.support.v7.widget.Toolbar;
import android.view.View;


import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void panggil(View view) {
        String nomor = "087881955222" ;
        Intent panggil = new
                Intent(Intent. ACTION_DIAL);
        panggil.setData(Uri.
                fromParts("tel",nomor,null));
        startActivity(panggil);
    }
    public void buka(View view) {
        String url = "https://developer.android.com";
        Intent bukabrowser = new
                Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }
    public void tentang(View view) {
        Intent tentang = new
                Intent(MainActivity.this, ABOUTUS.class);
        startActivity(tentang);
    }

}
