package com.uni.petgame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;

public class Player {
    Context context;

    int x, y;
    int screenX, screenY;
    Bitmap bitmap;
    Bitmap walkLeft, walkRight;
    String direction = "left";
    int speed = 8;
    Rect collisionDetection;


    public Player(Context context, int sizeX, int sizeY){
        this.context = context;
        this.screenX = sizeX/3;
        this.screenY = sizeY/6;

        Bitmap image = BitmapFactory.decodeResource(context.getResources(), R.drawable.dog_walk_right);
        walkRight = Bitmap.createScaledBitmap(image, screenX, screenY, true);

        image = BitmapFactory.decodeResource(context.getResources(), R.drawable.dog_walk_left);
        walkLeft = Bitmap.createScaledBitmap(image, screenX, screenY, true);

        bitmap = walkLeft;

        x = sizeX / 2 - bitmap.getWidth() / 2;
        y = sizeY / 2 - bitmap.getHeight() / 2 + screenY;

        collisionDetection = new Rect(x, y, x + bitmap.getWidth(), y + bitmap.getHeight());
    }

    public void update(){
        switch (direction){
            case "right":
                bitmap = walkRight;
                break;
            case "left":
                bitmap = walkLeft;
                break;
        }

        collisionDetection.top = y + 50;
        collisionDetection.left = x + 50;
        collisionDetection.right = x + bitmap.getWidth() - 50;
    }

}
