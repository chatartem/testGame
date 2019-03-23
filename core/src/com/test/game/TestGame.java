package com.test.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TestGame extends Game {
	SpriteBatch batch;
	Texture img;
	float delta = 0016;
	@Override
	public void create () {
		//batch = new SpriteBatch();
		//img = new Texture("badlogic.jpg");
		Gdx.app.log("ZBGame", "created");



	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.app.log("GameScreen FPS", (1/delta) + "");
		//batch.begin();
		//batch.draw(img, 950, 250);
		//batch.end();
	}
	
	@Override
	public void dispose () {
		//batch.dispose();
		//img.dispose();
	}
}
