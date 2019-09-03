package com.example.studentinfomationapp.db;

import android.provider.BaseColumns;

public final class StudentInfoConstract {
    private StudentInfoConstract(){

    }
    public static class Student implements BaseColumns{
        public static final String TABLE_NAME = "students";
        public static final String COLUMN_ID = "sid";
        public static final String COLUMN_NAME = "sname";
        public static final String COLUMN_DOB = "dob";
    }

    public static class Course implements BaseColumns{
        public static final String TABLE_NAME = "course";
        public static final String COLUMN_ID = "cid";
        public static final String COLUMN_NAME = "name";
    }

//    public static final String SQL_CREATE_STUDENT_TABLE = "CREATE_TABLE "+ Student.TABLE_NAME + " " +
//            "(\n"+
//            "\t"+ Student._ID + "\tINTEGER PRIMARY KEY AUTOINCREMENT , \n" +
//            "\t"+ Student.COLUMN_ID + "\tTEXT,\n" +
//            "\t"+ Student.COLUMN_NAME+ "\tTEXT,\n" +
//            "\t"+ Student.COLUMN_DOB + "\tINTEGER\n" +
//            ");";


    public static final String SQL_CREATE_STUDENT_TABLE=" CREATE TABLE "+Student.TABLE_NAME+" "+
            "(\n"+
            "\t"+Student._ID+"\tINTEGER PRIMARY KEY AUTOINCREMENT,\n"+
            "\t"+Student.COLUMN_ID+"\tTEXT,\n"+
            "\t"+Student.COLUMN_NAME+"\tTEXT,\n"+
            "\t"+Student.COLUMN_DOB+"\tINTEGER\n"+
            ");";



    public static final String SQL_DROP_STUDENT_TABLE = "DROP TABLE" + Student.TABLE_NAME;


}
