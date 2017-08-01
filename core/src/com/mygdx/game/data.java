package com.mygdx.game;

/**
 * Created by jackn on 7/31/2017.
 */
//database helper class
public class data {
    private int id;
    private String name;
    private String mode;
    data context = this;
    public data()
    {

    }
    public data(int id, String name, String mode){
        this.id=id;
        this.name=name;
        this.mode=mode;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMode(String mode){
        this.mode=mode;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getMode(){
        return mode;
    }
}
