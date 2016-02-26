package com.mycompany.a1.Starter;

/**
 * Created by Varun on 2/25/16.
 */
public class Net extends Catcher {
    public String toString()
    {
        String parentDesc = super.toString();
        String myDesc = ("Net: "+ "loc = " + getX() + ", " + getY() + ", color = " + getColor() + ", size = " + getSize());
        return myDesc;

    }

}
