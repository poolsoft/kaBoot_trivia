package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
public class kaBoot_versionZero extends Game {
	private Database database;

	public kaBoot_versionZero(final Database MyDatabase) {
		setDatabase(MyDatabase);
	}

	@Override
	public void create() {

	}
	@Override
	public void dispose() {
		super.dispose();
	}
	@Override
	public void pause() {
		super.pause();
	}
	@Override
	public void resume() {
		super.resume();
	}
	public void render(){
		super.render();
	}
	//switching screens
	@Override
	public final void setScreen(final Screen screen){
		super.setScreen(screen);
	}
	public final Database getDatabase(){
		return database;
	}
	public final void setDatabase(final Database MyDatabase){
		database = MyDatabase;
	}
}
