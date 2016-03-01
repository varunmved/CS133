package com.mycompany.a1.Starter;

/**
 * Created by Varun on 2/25/16.
 */
public class Cat extends Animal
{
    public String toString()
    {
        String myDesc = ("Cat: "+ "loc = " + getX() + ", " + getY() +
                ", color = " + getColor() + ", size = " + getSize()+
                "speed = " + getSpeed() + "direction = " + getDirection());
        return myDesc;

    }
}
