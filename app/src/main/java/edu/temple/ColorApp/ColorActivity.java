package edu.temple.ColorApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Spinner;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner spinner = findViewById(R.id.spinner);
        String[] colors = {"RED", "BLUE", "GREEN","CYAN", "YELLOW", "GRAY","MAGENTA"};
        ConstraintLayout layout = findViewById(R.id.layout);

        ColorAdapter adapter = new ColorAdapter(ColorActivity.this, layout, colors);

        spinner.setAdapter(adapter);
    }
}
