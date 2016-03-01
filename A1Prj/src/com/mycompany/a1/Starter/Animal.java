package com.mycompany.a1.Starter;
import java.util.Random;

/**
 * Created by Varun on 2/25/16.
 */
public abstract class Animal extends GameObject implements IMoving {
    private int speed = 0;
    private int direction = 0;

   /* public Animal() {
        //just need this here for compiling?
        //lol wtf is java
    }*/

    //get
    public int getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }

    //set
    public void setSpeed(int speed)
    {
        this.speed = speed;

    }

    public void setDirection(int direction)
    {
        this.direction = direction;
    }

    //i like to... MOVE IT

    public void move()
    {
        double newLocationX, newLocationY, deltaX, deltaY;

        deltaX = (double)Math.cos(90-getDirection())*getSpeed();
        deltaY = (double)Math.sin(90-getDirection())*getSpeed();

        newLocationX = getX()+deltaX;
        newLocationY = getY()+deltaY;

        //todo- logic
        //why the hell is that syntax highlighted?
        //nick_young_wat.jpg
        if( newLocationX < 1024-(this.getSize()/2) && newLocationX > (this.getSize()/2) && newLocationY < 1024-(this.getSize()/2) && newLocationY > (this.getSize()/2)){
            setLocation(newLocationX,newLocationY);
        }


    }



}
