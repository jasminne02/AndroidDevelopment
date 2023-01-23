package com.uni.petgame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;

import java.util.Random;

public class ObjectBase {
    Context context;

    int x, y;
    int screenX, screenY;
    Bitmap bitmap;
    int speed;
    int score;
    Rect collisionDetection;
    Random random;

    public ObjectBase(Context context, int sizeX, int sizeY){
        this.context = context;
        this.screenX = sizeX;
        this.screenY = sizeY;

        random = new Random();
        x = random.nextInt(screenX - 200);
        y = 70;
    }
}
