package com.test.game.com.test.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.test.game.GameWorld;

public class GameScreen implements Screen {

    public GameScreen() {

        Gdx.app.log("GameScreen", "Attached");

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

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
    public void hide() {

    }

    @Override
    public void dispose() {

    }

    private class GameRenderer {
        public GameRenderer(GameWorld world) {
            
        }

        public void render() {
            Gdx.app.log("GameRenderer", "render");
        }
    }
}