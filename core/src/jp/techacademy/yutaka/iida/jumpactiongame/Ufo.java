package jp.techacademy.yutaka.iida.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by iiday on 2018/01/08.
 */

public class Ufo extends GameObject{
    public static final float UFO_WIDTH = 2.0f;
    public static final float UFO_HEIGET = 1.3f;

    public Ufo(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight){
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(UFO_WIDTH, UFO_HEIGET);
    }
}
