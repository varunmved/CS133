package com.mycompany.a1.Starter;
import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.geom.Point;
import java.util.Random;
import java.util.ArrayList;
import java.util.Objects;


/**
 * Created by Varun on 2/16/16.
 */
public class GameWorld {
    //code here to create the
    //initial game objects/layout

    private ArrayList<GameObject> gameList; //new ArrayList<>();
    private int numOfCats = 0;
    private int reduceCats=0;
    private int numOfDogs = 0;
    private int reduceDogs= 0;
    private Dog dog;
    private Cat cat;
    private Net net;
    private int SIZE = 100;

    Random random = new Random();

    public GameWorld() {

        dog = new Dog();
        cat = new Cat();
        net = new Net();
    }

    public void initLayout()
    {
        gameList = new ArrayList<GameObject>();

        createDog();
        createDog();
        createDog();
        createCat();
        createCat();
        createNet();

    }

    //create
    public void createDog()
    {
        int black = ColorUtil.rgb(0,0,0);
        /*
        for(int i =0; i < numOfDogs; i++)
        {
            int randX = random.nextInt(SIZE);
            int randY = random.nextInt(SIZE);

            dog = new Dog();
            dog.setSpeed(5);
            dog.setColor(black);
            dog.setLocation(randX,randY);
            dog.setSize(100);
            gameList.add(dog);
        }
        */
        int randX = random.nextInt(SIZE);
        int randY = random.nextInt(SIZE);

        Dog dog = new Dog();
        dog.setSpeed(5);
        dog.setColor(black);
        dog.setLocation(randX,randY);
        dog.setSize(100);
        gameList.add(dog);
        numOfDogs++;


    }

    public void createCat()
    {
        /*
        for(int i =0; i < numOfCats; i++)
        {
            int randX = random.nextInt(SIZE);
            int randY = random.nextInt(SIZE);

            cat = new Cat();
            cat.setSpeed(5);
            cat.setColor(0);
            cat.setLocation(randX,randY);
            cat.setSize(100);
            gameList.add(cat);
        }
        */
        int randX = random.nextInt(SIZE);
        int randY = random.nextInt(SIZE);

        Cat cat = new Cat();
        cat.setSpeed(5);
        cat.setColor(0);
        cat.setLocation(randX,randY);
        cat.setSize(100);
        gameList.add(cat);
        numOfCats++;

    }

    public void createNet()
    {
        int randX = random.nextInt(SIZE);
        int randY = random.nextInt(SIZE);

        int black = ColorUtil.rgb(0,0,0);
        Net net = new Net();
        net.setColor(black);
        net.setSize(100);
        //net.setColor(black);
        net.setLocation(randX,randY);

        gameList.add(net);

    }
    //move
    public void moveUp()
    {
        Net net = new Net();
        net.moveUp();
    }

    public void moveDown()
    {
        Net net = new Net();
        net.moveDown();
    }

    public void moveLeft()
    {
        Net net = new Net();
        net.moveLeft();
    }

    public void moveRight()
    {
        Net net = new Net();
        net.moveRight();
    }

    //manipulation


    public void expandNet()
    {
        Net net = new Net();
        int netSize = net.getSize();
        if(netSize < 500)
        {
            net.setSize(netSize+1);
        }
    }

    public void decreaseNet()
    {
        Net net = new Net();
        int netSize = net.getSize();
        if(netSize > 50)
        {
            net.setSize(netSize-1);
        }
    }

    public void scoop()
    {
        Net net = new Net();
        for(int i = gameList.size(); i > 0;i--)
        {
            if(
                    gameList.get(i).getX() >= net.getX()-(net.getSize()/2) &&
                    gameList.get(i).getX() >= net.getX()-(net.getSize()/2) &&
                    gameList.get(i).getX() >= net.getX()-(net.getSize()/2) &&
                    gameList.get(i).getX() >= net.getX()-(net.getSize()/2)

                    )
            {
                if(gameList.get(i)instanceof Cat)
                {
                    reduceCats--;
                    gameList.remove(i);
                }
                if(gameList.get(i)instanceof Dog)
                {
                    reduceDogs--;
                    gameList.remove(i);
                }
            }
        }
    }

    public void populateCats()
    {
        reduceCats++;
        int black = ColorUtil.rgb(0,0,0);
        int randX = random.nextInt(SIZE);
        int randY = random.nextInt(SIZE);
        int randDirection = random.nextInt(360);

        Cat cat = new Cat();


        cat.setSpeed(5);
        cat.setColor(black);
        cat.setLocation(randX,randY);

        cat.setDirection(randDirection);
        gameList.add(cat);

    }

    public void fight()
    {
        //int black = ColorUtil.rgb(0,0,0);
        int silver = ColorUtil.rgb(192,192,192);

        int gameListSize = gameList.size();
        int temp = random.nextInt(gameListSize);
        while(!(gameList.get(temp)instanceof Dog))
        {
            temp = random.nextInt(gameListSize);

        }
        int x = ((Dog)gameList.get(temp)).getScratch();
        if (x < 5)
        {
            int shouldBeBlack = gameList.get(temp).getColor();
            int speed = ((Dog)gameList.get(temp)).getSpeed();

            ((Dog)gameList.get(temp)).setSpeed(speed-1);
            gameList.get(temp).setColor(silver);
            ((Dog)gameList.get(temp)).setScratch(x+1);
        }

    }

    //print points
    public void printPoints()
    {

        int y = 0;
        for(int i = 0; i < gameList.size(); i++)
        {
            if(gameList.get(i) instanceof Dog)
            {
                int x = ((Dog)gameList.get(i)).getScratch();
                y+=10-x;
            }
        }

        int dogsCaptured = numOfDogs - reduceDogs;
        int catsCaptured = numOfCats - reduceCats;

        System.out.println("Score: " + y);
        System.out.println("Number of Cats: " + catsCaptured);
        System.out.println("Number of Dogs: " + dogsCaptured);
        System.out.println("Number of Cats Captured: " + reduceCats);
        System.out.println("Number of Dogs Captured: " + reduceDogs);

    }

    public void printMap()
    {
        for (int i=0; i< gameList.size(); i++) {
            if (gameList.get(i) instanceof IMoving) {
                IMoving mObj = (IMoving) gameList.get(i);
                System.out.println(mObj);
            }
        }

    }

    public void tick()
    {
        for(int i =0; i <gameList.size();++i)
        {
            if(gameList.get(i)instanceof Animal)
            {
                ((Animal)gameList.get(i)).move();

            }
        }
    }

    public void quit()
    {

        System.out.println("Quit? Y/N");


    }


}
