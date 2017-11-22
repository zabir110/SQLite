package com.example.user.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by User on 11/22/2017.
 */

public class StudentDbHelper extends SQLiteOpenHelper
{
    public StudentDbHelper(Context context) {
        super(context,"student.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Create a table 3 row elements named (name,id,marks)
        db.execSQL("Create table student (name text,id text,marks text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //If a table already exists then delete/drop it
        db.execSQL("drop table if exists student");
        //then create for just call oncreate method
        onCreate(db);
    }
}
