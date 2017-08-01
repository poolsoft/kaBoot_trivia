package com.mygdx.game;

/**
 * Created by jackn on 7/31/2017.
 */
import java.util.*;
import com.badlogic.gdx.Gdx;
import android.database.sqlite.*;
import android.content.Context;
public class dbHandle extends data{

    private static dbHandle sInstance;
    protected static String db_name = "kaBoot";
    protected static Database instance = null;
    protected static int version = 1;
    private static final String TABLE_GAME="game";
    private static final String KEY_ID="id";
    private static final String KEY_NAME="name";
    private static final String KEY_MODE="mode";
    //dbHandle = openOrCreateDatabase("Mydatabase",null,version);


}
