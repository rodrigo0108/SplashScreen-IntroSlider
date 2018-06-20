package com.example.alumno.splashscreenintroslider.actividades;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.alumno.splashscreenintroslider.R;
import com.example.alumno.splashscreenintroslider.Utilidades.ManejadorPreferencias;
import com.example.alumno.splashscreenintroslider.Utilidades.MyViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verHistoria(View view) {
        ManejadorPreferencias prefManager = new ManejadorPreferencias(getApplicationContext());

        // make first time launch TRUE
        prefManager.setFirstTimeLaunch(true);

        startActivity(new Intent(MainActivity.this, HistoriaActivity.class));
        finish();
    }
}
