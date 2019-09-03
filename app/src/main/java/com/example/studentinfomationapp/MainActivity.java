package com.example.studentinfomationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.example.studentinfomationapp.db.StudentInfoConstract;
import com.example.studentinfomationapp.db.StudentInfoDbHelper;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private StudentInfoDbHelper dbHelper;
    private SQLiteDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHelper = new StudentInfoDbHelper(this);
        database = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(StudentInfoConstract.Student.COLUMN_ID,"e20160584");
        values.put(StudentInfoConstract.Student.COLUMN_NAME,"Virak");
        Calendar calendar = Calendar.getInstance();
        calendar.set(1997,7,18);
        values.put(StudentInfoConstract.Student.COLUMN_DOB,calendar.getTimeInMillis());
        database.insert(StudentInfoConstract.Student.TABLE_NAME, StudentInfoConstract.Student._ID, values);
    }

    @Override
    protected void onDestroy() {
        database.close();
        super.onDestroy();
    }
}
