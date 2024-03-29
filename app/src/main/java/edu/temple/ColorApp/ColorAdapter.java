package edu.temple.ColorApp;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

import androidx.constraintlayout.widget.ConstraintLayout;

public class ColorAdapter extends BaseAdapter {

    String[] colors;
    Context context;

    public ColorAdapter(Context context, String... colors){
        this.colors = colors;
        this.context = context;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final TextView text;

        if(convertView != null && convertView instanceof TextView){
            text = (TextView) convertView;
        }else{
            text = new TextView(context);
        }


        final String color = colors[position];

        text.setText(color);
        text.setBackgroundColor(Color.parseColor(color));
        text.setTextSize(25);

        return text;
    }
}
