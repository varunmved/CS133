package com.mycompany.a1.Starter;
import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.geom.Point;

/**
 * Created by Varun on 2/16/16.
 */
public class GameWorld {
    public void initLayout() {
        //code here to create the
        //initial game objects/layout
    }

    // additional methods here to
    // manipulate world objects and
    // related game state data

    abstract class GameObject extends GameWorld {
        //location shit, fix this later
        private double locationX = 0.00;
        private double locationY = 0.00;

        //color
        private int color = ColorUtil.rgb(0,0,0);

        //moving or guided
        private boolean isMoving = false;
        private boolean isGuided = false;

    }

    abstract class Animal extends GameObject implements IMoving{
        private double speed = 0.00;
        private double direction = 0.00;

        private final double size = 0.00;


    }

    abstract class Catcher extends GameObject implements IGuided{
        private int size = 100;


    }



}
