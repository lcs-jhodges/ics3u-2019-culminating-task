import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Actor
{
   /**
     * Constructor
     * 
     * This runs once.
     *

    /**
     * Move to left (to make hero look like they are moving right)
     *

    /**
     * Move to right (to make hero look like they are moving left)
     *
    
    /**
     * Move to left (to make hero look like they are moving right)
     */
    
    public void moveLeft(int speed)
    {
        setLocation(getX() - speed, getY());
    }
    
   public void moveRight(int speed)
    {
        setLocation(getX() + speed, getY());
    }
    
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
