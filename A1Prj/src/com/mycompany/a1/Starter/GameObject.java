package com.mycompany.a1.Starter;

import com.codename1.charts.util.ColorUtil;
import java.util.Vector;
/**
 * Created by Varun on 2/25/16.
 */

    public abstract class GameObject extends GameWorld {

        //location shit, fix this later
        //should i use a touple.. or a 2d array?
        /*
        private double locationX = 0.00;
        private double locationY = 0.00;

        //private double[] location = new double[2];
        */

        //declare vars
        private int color = ColorUtil.rgb(0,0,0);
        private Vector<Double> location;
        private int size = 0;


        //moving or guided
        private boolean isMoving = false;
        private boolean isGuided = false;

        public GameObject()
        {
            location = new Vector<Double>();
            location.setSize(2);
        }

        //get
        public int getColor()
        {
            return color;
        }

        public double getX()
        {
            return location.get(0);
        }

        public double getY()
        {
            return location.get(1);
        }

        public int getSize()
        {
            return size;
        }

        //set
        public void setColor(int rgbIn)
        {
            color = rgbIn;
        }

        public void setLocation(double x, double y)
        {
            location.set(0,x);
            location.set(0,y);
        }

        //abstract methods
        public abstract void moveUp();
        public abstract void moveDown();
        public abstract void moveRight();
        public abstract void moveLeft();
        public abstract boolean jumpToCat();
        public abstract boolean jumpToDog();


    }

