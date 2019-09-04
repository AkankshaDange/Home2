package com.example.home;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class MENU extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

PieChartView pieChartView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        PieChartView pieChartView = findViewById(R.id.chart);
        // List<SliceValue> pieData =pieData =new ArrayList<>();
        List pieData = new ArrayList<>();
        pieData.add(new SliceValue(15, Color.BLUE).setLabel("Clothes"));
        pieData.add(new SliceValue(25, Color.GRAY).setLabel("Education"));
        pieData.add(new SliceValue(10, Color.RED).setLabel("Shopping"));
        pieData.add(new SliceValue(60, Color.MAGENTA).setLabel("Others"));

        PieChartData pieChartData = new PieChartData(pieData);
        pieChartData.setHasLabels(true).setValueLabelTextSize(15);
        pieChartData.setHasCenterCircle(true).setCenterText1("Daily Expenses!!");

        //pieChartData.setCenterText1(true).setValueLabelTextSize(10);
        pieChartView.setPieChartData(pieChartData);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        switch (item.getItemId()) {
            case R.id.nav_group:
                Intent intent = new Intent(this, Grouppage.class);
                this.startActivity(intent);
                break;
            case R.id.nav_gallery:
                Intent intent1 = new Intent(this, creategroup.class);
                this.startActivity(intent1);
                break;
            case R.id.nav_slideshow:
                Intent intent2 = new Intent(this, Grouppage.class);
                this.startActivity(intent2);
                break;
            case R.id.nav_tools:
                Intent intent3 = new Intent(this, Grouppage.class);
                this.startActivity(intent3);
                break;
            case R.id.nav_settings:
                Intent intent4 = new Intent(this, Grouppage.class);
                this.startActivity(intent4);
                break;
            case R.id.nav_logout:
                Intent intent5 = new Intent(this, Grouppage.class);
                this.startActivity(intent5);
                break;

        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

//


        //
        return true;
    }

}
