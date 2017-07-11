package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.android.pets.data.PetsContract.PetsEntry;

/**
 * Created by Harshit Maheshwari on 11-07-2017.
 */
public class PetDbHelper extends SQLiteOpenHelper{

    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    // Name of the database
    public static final String DATABASE_NAME = "shelter.db";

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + PetsEntry.TABLE_NAME + " ("
            + PetsEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + PetsEntry.COLUMN_PET_NAME + " TEXT NOT NULL, "
            + PetsEntry.COLUMN_PET_BREED + " TEXT, "
            + PetsEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL, "
            + PetsEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";

    private static final String SQL_DELETE_ENTRIES = "DROP TABLE " + PetsEntry.TABLE_NAME;

    /**
     * Constructor
     */
    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }


}
