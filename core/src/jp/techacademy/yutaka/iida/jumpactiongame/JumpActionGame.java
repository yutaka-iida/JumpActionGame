package jp.techacademy.yutaka.iida.jumpactiongame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class JumpActionGame extends Game {
	public SpriteBatch batch;
	public ActivityRequestHandler mRequestHandler;

	public JumpActionGame(ActivityRequestHandler requestHandler){
		super();
		mRequestHandler = requestHandler;
	}

	@Override
	public void create () {
		batch = new SpriteBatch();

		setScreen(new GameScreen(this));
	}

}
