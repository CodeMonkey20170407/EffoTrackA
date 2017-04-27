package com.effotracka.effotracka.ViewManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.effotracka.effotracka.R;

public class selected_activity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selected);

        // get intent data
        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");
        int[] logos2 = i.getExtras().getIntArray("array");

        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(logos2[position]);
    }

}
