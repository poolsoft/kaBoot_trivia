package com.mygdx.game;

/**
 * Created by jackn on 7/31/2017.
 */
import java.util.*;
import com.badlogic.gdx.Gdx;

import java.sql.*;
public abstract class Database {
    protected static String db_name = "kaBoot";
    protected static Database instance = null;
    protected static int version = 1;

    //runs sql query
    public abstract void execute(String sql);
    //returns number of rows
    public abstract int executeUpdate(String sql);

  /*  public void onCreate(SQLiteDatabase database){
        database.execSQL(SQL_CREATE_ENTRIES);
        createshit();
        createinsertsnshit();
    }
*/
}
