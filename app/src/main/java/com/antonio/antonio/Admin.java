package com.antonio.antonio;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Admin extends SQLiteOpenHelper {

     public Admin(Context context) {

         super(context, estructura_db.DBNAME, null, estructura_db.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

         db.execSQL(estructura_db.TABLA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

         db.execSQL("DROP TABLE IF EXISTS "+ estructura_db.TABLA);
         onCreate(db);

    }
}
