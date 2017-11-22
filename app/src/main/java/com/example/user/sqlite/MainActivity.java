package com.example.user.sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StudentDbHelper helper=new StudentDbHelper(this);
        //This to write data into table
//        SQLiteDatabase db = helper.getWritableDatabase();
//        //to put into database we need Contentvalues
//        ContentValues values=new ContentValues();
//
//        values.put("name","zabir");
//        values.put("id","1507110");
//        values.put("marks","80");
//
//        values.put("name","saeed");
//        values.put("id","1507100");
//        values.put("marks","88");
//
//        values.put("name","manik");
//        values.put("id","1507114");
//        values.put("marks","90");
//       // now insert into the database
//      long row= db.insert("student",null,values);
//      System.out.println("row number " +row);
      //This is to fetch data from table
        //so we need Cursur
        SQLiteDatabase database=helper.getReadableDatabase();
        //here we need to specify that which element need to fetch as string
        String string[] ={"name","id","marks"};
        Cursor cursor=database.query("student",string,null,null,null,null,null);
        //selected 1st row
        cursor.moveToFirst();
        //indicets as column no
        System.out.println("name:" +cursor.getString(0)+" id: "+cursor.getString(1)+" marks: "+cursor.getString(2));


    }
}
