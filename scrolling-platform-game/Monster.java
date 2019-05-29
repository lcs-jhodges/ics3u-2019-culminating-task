import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Decoration
{
    /**
     * Instance variables
     * 
     * These are available for use in any method below.
     */ 

    private GreenfootImage standingStillImages[];
    private static final int STANDING_ANIMATION_DELAY = 8;
    private static final int COUNT_OF_STANDING_IMAGES = 3;
    private int standingFrames;

    /**
     * Constructor
     * 
     * Called once when object is created.
     */
    Monster(int scrollableWorldX, int scrollableWorldY)
    {
        super(scrollableWorldX, scrollableWorldY);

        // Initialize the 'walking' arrays
        standingStillImages = new GreenfootImage[COUNT_OF_STANDING_IMAGES];

        // Load walking images from disk
        for (int i = 0; i < standingStillImages.length; i++)
        {
            standingStillImages[i] = new GreenfootImage("monster-" + i + ".png");

        }
        // Track animation frames for walking
        standingFrames = 0;

    }

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
        animateStanding();
    }

    private void animateStanding()
    {
        // Track walking animation frames
        standingFrames += 1;

        // Get current animation stage
        int stage = standingFrames / STANDING_ANIMATION_DELAY;

        // Animate
        if (stage < standingStillImages.length)
        {
            // Set image for this stage of the animation
            setImage(standingStillImages[stage]);

        }
        else
        {
            // Start animation loop from beginning
            standingFrames = 0;
        }
    }
}    

