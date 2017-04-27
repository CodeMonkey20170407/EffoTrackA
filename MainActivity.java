package com.effotracka.effotracka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.effotracka.effotracka.DataPackage.YearMakeDatabaseHandler;
import com.effotracka.effotracka.DataPackage.Make;
import com.effotracka.effotracka.DataPackage.Year;
import com.effotracka.effotracka.ViewManager.CAdapter;
import com.effotracka.effotracka.ViewManager.selected_activity;

import java.util.List;

import static android.util.Log.d;

public class MainActivity extends AppCompatActivity {
    private YearMakeDatabaseHandler yearMakeDatabaseHandler;
    android.widget.GridView GridView;
    int logos[] = {R.drawable.ic_launcher};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yearMakeDatabaseHandler = new YearMakeDatabaseHandler(this);

        GridView = (GridView) findViewById(R.id.gridview);
        GridView.setAdapter(new CAdapter(this,logos));

        GridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("onClick","position ["+position+"]");
                Intent i = new Intent(getApplicationContext(), selected_activity.class);
                // passing array index
                i.putExtra("id", position);
                i.putExtra("array", logos);
                startActivity(i);
            }
        });

        List<Year> contacts = yearMakeDatabaseHandler.getAllYear();

        for (Year cn : contacts) {
            String log = "Id: " + cn.getKeyId() + " yes: " + cn.getValue();
            // Writing Contacts to log
            d("Name: ", log);
        }

        List<Make> mklist = yearMakeDatabaseHandler.getAllMake();
        for (Make mk : mklist) {
            String log = "Id: " + mk.getKeyId() + " yes: " + mk.getName();
            // Writing Contacts to log
            d("Name: ", log);
        }
    }
}
