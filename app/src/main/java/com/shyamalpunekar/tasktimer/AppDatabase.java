package com.shyamalpunekar.tasktimer;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by spunek on 11/6/17.
 */

//Basic Database class for an application

// The only class should use this is AppProvider

class AppDatabase extends SQLiteOpenHelper {

    public static final String TAG = "AppDatabase";
    public static final String  DATABASE_NAME = "TaskTimer.db";

    public static final int DATABASE_VERSION = 1;


    // we want only single instance of class to exist, connect to database.
    private AppDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        Log.d(TAG, "AppDatabase: Constructor");
    }

    /**
     * Get an instance of the app's singleton database helper object
     * @param context the content provider's context
     * @return a SQLite database helper Object
     */
    static AppDatabase getInstance(Context context){

    }
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
