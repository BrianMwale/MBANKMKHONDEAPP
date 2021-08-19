package com.example.mybankmkhondeapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.telephony.PhoneNumberFormattingTextWatcher;

import androidx.annotation.Nullable;

import java.util.Date;

public class DataBaseManager extends SQLiteOpenHelper {
    public static final String database_name = "BankMkhonde.db";


    public DataBaseManager(Context context) {

        super(context, "BankMkhonde.db", null, 1);
    }


    public DataBaseManager(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase BankMkhondeDB) {
        BankMkhondeDB.execSQL(" create Table Members(Fullname TEXT,PhoneNumber integer primary key, Location TEXT, Date text)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase BankMkhondeDB, int oldVersion, int newVersion) {
        BankMkhondeDB.execSQL("drop Table if exists Members");


    }

    public Boolean insertData(String Fullname, String phoneNumber, String Location, String date ) {
        SQLiteDatabase BankMkhondeDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Fullname", Fullname);
        contentValues.put("PhoneNumber",String.valueOf(phoneNumber));
        contentValues.put("Location", Location);
        contentValues.put("Date", String.valueOf(date));


        long results = BankMkhondeDB.insert("Members", null, contentValues);
        if (results == -1) return false;
        else
            return true;
    }
    public Boolean phoneNumber(String PhoneNumber){
        SQLiteDatabase BankMkhondeDB = this.getWritableDatabase();
        Cursor cursor = BankMkhondeDB.rawQuery("Select * from Members where PhoneNumber =? ", new String[]  {PhoneNumber});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
    public Boolean checkUserNamePass(String Fullname,  Integer PhoneNumber, String Location, String date){
        SQLiteDatabase BankMkhondeDB = this.getWritableDatabase();
        Cursor cursor = BankMkhondeDB.rawQuery("Select * from Members where Fullname =? and PhoneNumber =? and Location =?  and Date =?", new String[] {Fullname, String.valueOf(PhoneNumber), Location, date});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }

}
