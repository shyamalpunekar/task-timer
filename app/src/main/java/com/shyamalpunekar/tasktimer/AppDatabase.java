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
    private static AppDatabase instance = null;


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
        if(instance == null){
            Log.d(TAG, "getInstance: creating new instance");
            instance = new AppDatabase(context);
        }
        return instance;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d(TAG, "onCreate: starts");
        String sSQL;
        //sSQL = "CREATE TABLE Tasks (_id INTEGER PRIMARY KEY NOT NULL, Name TEXT NOT NULL, Description TEXT, SortOrder INTEGER, CategoryId INTEGER);";

        sSQL = "CREATE TABLE" + TasksContract.TABLE_NAME + " ("
                + TasksContract.Columns._ID + " INTEGER PRIMARY KEY NOT NULL, "
                + TasksContract.Columns.TASKS_NAME + " TEXT NOT NULL"
                + TasksContract.Columns.TASKS_DESCRIPTION + " TEXT"
                + TasksContract.Columns.TASKS_SORTORDER + " INTEGER);";

        Log.d(TAG, sSQL);
        db.execSQL(sSQL);

        Log.d(TAG, "onCreate: ends");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
