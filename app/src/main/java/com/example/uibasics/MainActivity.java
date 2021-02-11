package com.example.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView citiesList;
    private Spinner studentSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citiesList = findViewById(R.id.cityList);
        studentSpinner = findViewById(R.id.studentSpinner);

//        final ArrayList<String> students = new ArrayList<>();
//        students.add("Meisam");
//        students.add("Manohar");
//        students.add("Macy");
//        students.add("Gulzar");
//        students.add("JasPreet");
//        students.add("Venkat");
//
//        ArrayAdapter<String> studentsAdapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_spinner_dropdown_item,
//                students
//        );
//        studentSpinner.setAdapter(studentsAdapter);
        studentSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, studentSpinner.getSelectedItem().toString() + " selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final ArrayList<String> cities = new ArrayList<>();
        cities.add("Zurich");
        cities.add("New York");
        cities.add("Berlin");
        cities.add("Nairobi");
        cities.add("Moscow");
        cities.add("Madrid");

        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                cities
        );

        citiesList.setAdapter(citiesAdapter);

        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, cities.get(position) + " selected.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
