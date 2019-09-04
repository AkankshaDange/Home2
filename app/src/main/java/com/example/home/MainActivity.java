package com.example.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Pie Chart Add
        /*PieChartView pieChartView = findViewById(R.id.chart);
        // List<SliceValue> pieData =pieData =new ArrayList<>();
        List pieData = new ArrayList<>();
        pieData.add(new SliceValue(15, Color.BLUE).setLabel("Clothes"));
        pieData.add(new SliceValue(25, Color.GRAY).setLabel("Education"));
        pieData.add(new SliceValue(10, Color.RED).setLabel("Shopping"));
        pieData.add(new SliceValue(60, Color.MAGENTA).setLabel("Others"));

        PieChartData pieChartData = new PieChartData(pieData);
        pieChartData.setHasLabels(true).setValueLabelTextSize(14);
        pieChartData.setHasCenterCircle(true).setCenterText1("Daily Expenses!!");

        pieChartView.setPieChartData(pieChartData);*/


       ImageButton button6 = findViewById(R.id.imageButton6);


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOptionsMenu();
            }
        });


    }

    public void openOptionsMenu() {

        Intent intent = new Intent(this, MENU.class);
        startActivity(intent);
    }

    }

