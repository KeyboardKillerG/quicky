package com.dodhall.quicky.db.models;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.dodhall.quicky.SQLiteUtitilites;

public class ContacsSQLiteHelper extends SQLiteOpenHelper {

    public ContacsSQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQLiteUtitilites.sqlCreate);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //Delete old table if exists
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+SQLiteUtitilites.TABLE_CONTACTS);
        //Create new database
        sqLiteDatabase.execSQL(SQLiteUtitilites.sqlCreate);

    }
}
