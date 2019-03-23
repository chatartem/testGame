package com.test.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.test.game.com.test.screens.GameScreen;

public class TestGame extends Game {


    @Override
    public void create() {
        setScreen(new GameScreen());

    }

    public void render(float delta){



    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }



    @Override
    public void dispose() {

    }
}
