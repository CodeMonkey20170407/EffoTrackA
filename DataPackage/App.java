package com.effotracka.effotracka.DataPackage;

import android.app.Application;
import android.content.Context;

public class App extends Application {
    private static YearMakeDatabaseHandler yearMakeDatabaseHandler;

    @Override
    public void onCreate()
    {
        super.onCreate();
        yearMakeDatabaseHandler = new YearMakeDatabaseHandler(this);
        yearMakeDatabaseHandler.addYear();

        yearMakeDatabaseHandler.addMake();

    }
}
