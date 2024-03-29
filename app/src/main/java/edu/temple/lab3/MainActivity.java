package edu.temple.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] colors = {"Red", "Blue", "Green", "Magenta", "Purple", "Black", "Yellow", "White", "Cyan", "Grey"};

        Spinner spinner = findViewById(R.id.spinner);
        ColorAdapter adapter = new ColorAdapter(this,colors);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view;

                findViewById(R.id.backgroundID).setBackgroundColor(Color.parseColor(textView.getText().toString()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
    }
}