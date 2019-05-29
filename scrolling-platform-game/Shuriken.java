import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shuriken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shuriken extends Decoration

{
    /**
     * Instance variables
     * 
     * These are available for use in any method below.
     */

    private GreenfootImage shurikenMovingImages[];
    private static final int SHURIKEN_ANIMATION_DELAY = 5;
    private static final int COUNT_OF_SHURIKEN_IMAGES = 3;
    private int shurikenFrames;

    /**
     * Constructor
     * 
     * Called once when object is created.
     */
    Shuriken(int scrollableWorldX, int scrollableWorldY)
    {
        super(scrollableWorldX, scrollableWorldY);

        // Initialize the 'walking' arrays
        shurikenMovingImages = new GreenfootImage[COUNT_OF_SHURIKEN_IMAGES];

        // Load walking images from disk
        for (int i = 0; i < shurikenMovingImages.length; i++)
        {
            shurikenMovingImages[i] = new GreenfootImage("shuriken-" + i + ".png");

        }
        // Track animation frames for walking
        shurikenFrames = 0;

    }

    /**
     * Act - do whatever the Shuriken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        // Add your action code here.
        animateShuriken();
        move(-3);
    }    

    private void animateShuriken()
    {
        // Track walking animation frames
        shurikenFrames += 1;

        // Get current animation stage
        int stage = shurikenFrames / SHURIKEN_ANIMATION_DELAY;

        // Animate
        if (stage < shurikenMovingImages.length)
        {
            // Set image for this stage of the animation
            setImage(shurikenMovingImages[stage]);

        }
        else
        {
            // Start animation loop from beginning
            shurikenFrames = 0;
        }
    }
}
