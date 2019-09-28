package edu.temple.ColorApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Spinner spinner = findViewById(R.id.spinner);

        String[] colors = {"WHITE", "RED", "BLUE", "GREEN","CYAN", "YELLOW", "GRAY", "MAGENTA","TEAL", "AQUA", "NAVY", "FUCHSIA"};
        final ConstraintLayout layout = findViewById(R.id.layout);

        ColorAdapter adapter = new ColorAdapter(ColorActivity.this, colors);



        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected = (String) parent.getItemAtPosition(position);
                view.setBackgroundColor(Color.parseColor("white"));
                layout.setBackgroundColor(Color.parseColor(selected));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
