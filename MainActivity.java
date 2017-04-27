package com.effotracka.effotracka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.effotracka.effotracka.DataPackage.YearMakeDatabaseHandler;
import com.effotracka.effotracka.DataPackage.Make;
import com.effotracka.effotracka.DataPackage.Year;

import java.util.List;

import static android.util.Log.d;

public class MainActivity extends AppCompatActivity {
    private YearMakeDatabaseHandler yearMakeDatabaseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yearMakeDatabaseHandler = new YearMakeDatabaseHandler(this);

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
