package com.mycompany.a1.Starter;

/**
 * Created by Varun on 2/25/16.
 */
public class Catcher extends GameObject implements IGuided {

    public void move() {
        //super
    }

    public void moveUp()
    {
        double x,y;

        x = getX();
        y = getY();

        setLocation(x,y);

    }

    public void moveDown()
    {
        double x,y;

        x = getX();
        y = getY();

        setLocation(x,y);


    }

    public void moveLeft()
    {
        double x,y;

        x = getX();
        y = getY();

        setLocation(x,y);

    }

    public void moveRight() {
        double x, y;

        x = getX();
        y = getY();

        setLocation(x,y);


    }





}
