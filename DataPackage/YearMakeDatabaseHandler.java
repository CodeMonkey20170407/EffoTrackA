package com.effotracka.effotracka.DataPackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class YearMakeDatabaseHandler extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "DataManager";

    // Contacts Table Columns names

    public YearMakeDatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + Year.TABLE  + "(" + Year.KEY_ID + " INTEGER PRIMARY KEY, " + Year.KEY_VALUE + " TEXT)");
        db.execSQL("CREATE TABLE " + Make.TABLE  + "(" + Make.KEY_ID + " INTEGER PRIMARY KEY, " + Make.KEY_NAME + " TEXT)");
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + Year.TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + Make.TABLE);

        // Create tables again
        onCreate(db);
    }

    // Adding new contact
    void addYear() {
        SQLiteDatabase db = this.getWritableDatabase();
        int counter = 1950;
        ContentValues values = new ContentValues();

        while(counter != 2020) {
            values.put(Year.KEY_VALUE, counter); // Contact Name
            db.insert(Year.TABLE, null, values);
            counter++;
        }

        // Inserting Row
        db.close();
    }

    // Getting All Contacts
    public List<Year> getAllYear() {
        List<Year> yearList = new ArrayList<>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + Year.TABLE;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        cursor.close();

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Year year = new Year();
                year.setKeyId(Integer.parseInt(cursor.getString(0)));
                year.setValue(cursor.getString(1));
                // Adding contact to list
                yearList.add(year);
            } while (cursor.moveToNext());
        }

        // return contact list
        return yearList;
    }

    void addMake(){
        ArrayList<Make> makeArrayList = new ArrayList<>();
        makeArrayList.add(new Make("Acura"));
        makeArrayList.add(new Make("Alfa Romeo"));
        makeArrayList.add(new Make("AMC"));
        makeArrayList.add(new Make("Ariel"));
        makeArrayList.add(new Make("Aston Martin"));
        makeArrayList.add(new Make("Audi"));
        makeArrayList.add(new Make("Austin Healey"));
        makeArrayList.add(new Make("Bentley"));
        makeArrayList.add(new Make("BMW"));
        makeArrayList.add(new Make("Bugatti"));
        makeArrayList.add(new Make("Buick"));
        makeArrayList.add(new Make("Cadillac"));
        makeArrayList.add(new Make("Callaway"));
        makeArrayList.add(new Make("Caterham"));
        makeArrayList.add(new Make("Chevrolet"));
        makeArrayList.add(new Make("Chrysler"));
        makeArrayList.add(new Make("Citroen"));
        makeArrayList.add(new Make("Daewoo"));
        makeArrayList.add(new Make("Daihatsu"));
        makeArrayList.add(new Make("Datsun"));
        makeArrayList.add(new Make("De Tomaso"));
        makeArrayList.add(new Make("Dodge"));
        makeArrayList.add(new Make("Eagle"));
        makeArrayList.add(new Make("Ferrari"));
        makeArrayList.add(new Make("FIAT"));
        makeArrayList.add(new Make("Fisker"));
        makeArrayList.add(new Make("Ford"));
        makeArrayList.add(new Make("Genesis"));
        makeArrayList.add(new Make("GEO"));
        makeArrayList.add(new Make("GMC"));
        makeArrayList.add(new Make("Holden"));
        makeArrayList.add(new Make("Honda"));
        makeArrayList.add(new Make("Hummer"));
        makeArrayList.add(new Make("Hyundai"));
        makeArrayList.add(new Make("Infiniti"));
        makeArrayList.add(new Make("Isuzu"));
        makeArrayList.add(new Make("Jaguar"));
        makeArrayList.add(new Make("Jeep"));
        makeArrayList.add(new Make("KIA"));
        makeArrayList.add(new Make("Koenigsegg"));
        makeArrayList.add(new Make("Lamborghini"));
        makeArrayList.add(new Make("Lancia"));
        makeArrayList.add(new Make("Land Rover"));
        makeArrayList.add(new Make("Lexus"));
        makeArrayList.add(new Make("Lincoln"));
        makeArrayList.add(new Make("Lotus"));
        makeArrayList.add(new Make("Maserati"));
        makeArrayList.add(new Make("Maybach"));
        makeArrayList.add(new Make("Mazda"));
        makeArrayList.add(new Make("Mclaren"));
        makeArrayList.add(new Make("Mercedes"));
        makeArrayList.add(new Make("Mercury"));
        makeArrayList.add(new Make("MG"));
        makeArrayList.add(new Make("Mini"));
        makeArrayList.add(new Make("Mitsubishi"));
        makeArrayList.add(new Make("Morgan"));
        makeArrayList.add(new Make("Mosler/Rossion"));
        makeArrayList.add(new Make("Nissan"));
        makeArrayList.add(new Make("Noble"));
        makeArrayList.add(new Make("Oldsmobile"));
        makeArrayList.add(new Make("OPEL"));
        makeArrayList.add(new Make("Pagani"));
        makeArrayList.add(new Make("Peugeot"));
        makeArrayList.add(new Make("Plymouth"));
        makeArrayList.add(new Make("Pontiac"));
        makeArrayList.add(new Make("Porsche"));
        makeArrayList.add(new Make("Proton"));
        makeArrayList.add(new Make("RAM"));
        makeArrayList.add(new Make("Renault"));
        makeArrayList.add(new Make("Rolls-Royce"));
        makeArrayList.add(new Make("SAAB"));
        makeArrayList.add(new Make("Saleen"));
        makeArrayList.add(new Make("Saturn"));
        makeArrayList.add(new Make("Scion"));
        makeArrayList.add(new Make("Seat"));
        makeArrayList.add(new Make("Shelby"));
        makeArrayList.add(new Make("Skoda"));
        makeArrayList.add(new Make("Smart"));
        makeArrayList.add(new Make("SSangYong"));
        makeArrayList.add(new Make("Subaru"));
        makeArrayList.add(new Make("Suzuki"));
        makeArrayList.add(new Make("Tesla"));
        makeArrayList.add(new Make("Toyota"));
        makeArrayList.add(new Make("Triumph"));
        makeArrayList.add(new Make("Vauxhall"));
        makeArrayList.add(new Make("VW"));
        makeArrayList.add(new Make("Volvo"));
        makeArrayList.add(new Make("Westfield"));

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        for (Make carMake:makeArrayList) {
            values.put(Make.KEY_NAME, carMake.getName()); // Contact Name
            db.insert(Make.TABLE, null, values);
        }

        db.close();
    }

    public List<Make> getAllMake(){
        List<Make> makeList = new ArrayList<>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + Make.TABLE;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        cursor.close();

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Make make = new Make();
                make.setKeyId(Integer.parseInt(cursor.getString(0)));
                make.setName(cursor.getString(1));
                // Adding contact to list
                makeList.add(make);
            } while (cursor.moveToNext());
        }

        // return contact list
        return makeList;
    }
}
