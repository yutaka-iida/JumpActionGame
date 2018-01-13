package jp.techacademy.yutaka.iida.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by iiday on 2018/01/13.
 */

public class Enemy extends GameObject {

    public static final float ENEMY_WIDTH = 0.8f;
    public static final float ENEMY_HEIGHT = 0.8f;

    public static final int ENEMY_EXIST = 0;
    public static final int ENEMY_NONE = 1;

    int mState;

    public Enemy(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight){
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT);
        mState = ENEMY_EXIST;
    }
    public void get(){
        mState = ENEMY_NONE;
        setAlpha(0);
    }
}
