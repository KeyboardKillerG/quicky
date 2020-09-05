package com.dodhall.quicky;

public class SQLiteUtitilites {
    //Table names constants
    public static final String TABLE_CONTACTS = "Contacts";

    //Column names constants
    public static final String COLUMN_ID_CONTACS = "contactId";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_URL = "url";

    //SQL sentence to create DB
    public static String sqlCreate = "CREATE DATABASE "+TABLE_CONTACTS+" ("+COLUMN_ID_CONTACS+" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "+COLUMN_NAME+" TEXT, "+COLUMN_PHONE+" TEXT, "+COLUMN_URL+" TEXT)";



}
