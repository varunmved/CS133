package com.mycompany.a1.Starter;

/**
 * Created by Varun on 2/25/16.
 */
public class Dog extends Animal
{
    private int scratch;

    public Dog()
    {
        scratch =0;
    }

    public int getScratch()
    {
        return scratch;
    }

    public void setScratch(int scratch)
    {
        this.scratch = scratch;
    }

    public String toString()
    {

        String myDesc = ("Dog: "+ "loc = " + getX() + ", " + getY() +
                ", color = " + getColor() + ", size = " + getSize())+
                "speed = " + getSpeed() + "direction = " + getDirection() +
                "scratches " + getScratch();
        return myDesc;

        //return "asdf";

    }

}
