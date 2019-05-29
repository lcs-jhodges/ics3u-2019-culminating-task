import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Template for a side-scrolling platform game.
 * 
 * @author R. Gordon
 * @version May 8, 2019
 */
public class SideScrollingWorld extends World
{
    /**
     * Instance variables
     * 
     * These are available for use in any method below.
     */    
    // Tile size in pixels for world elements (blocks, clouds, etc)
    private static final int TILE_SIZE = 32;
    private static final int HALF_TILE_SIZE = TILE_SIZE / 2;

    // World size constants
    private static final int VISIBLE_WIDTH = 640;
    private static final int VISIBLE_HEIGHT = 480;
    public static final int HALF_VISIBLE_WIDTH = VISIBLE_WIDTH / 2;
    private static final int HALF_VISIBLE_HEIGHT = VISIBLE_HEIGHT / 2;
    public static final int SCROLLABLE_WIDTH = VISIBLE_WIDTH * 3;
    private static final int SCROLLABLE_HEIGHT = VISIBLE_HEIGHT;

    // Hero
    Hero theHero;

    // Track whether game is on
    private boolean isGameOver;

    // backgroundMusic
    GreenfootSound backgroundMusic;

    /**
     * Constructor for objects of class SideScrollingWorld.
     */

    public SideScrollingWorld()
    {    
        // Create a new world with 640x480 cells with a cell size of 1x1 pixels.
        // Final argument of 'false' means that actors in the world are not restricted to the world boundary.
        // See: https://www.greenfoot.org/files/javadoc/greenfoot/World.html#World-int-int-int-boolean-
        super(VISIBLE_WIDTH, VISIBLE_HEIGHT, 1, false);

        // Set up the starting scene
        setup();

        // Game on
        isGameOver = false;

        // Load the background music
        backgroundMusic = new GreenfootSound("music.mp3");

    }

    /**
     * Is called when the 'Run' button is pressed.
     */
    public void started()
    {
        backgroundMusic.playLoop();
    }

    /**
     * Set up the entire world.
     */
    private void setup()
    {

        //addFences();
        //addMetalPlateSteps();
        //addClouds();
        addHero();

        // Add metal plates above the ground level
        for (int i = 0; i <= 4; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 4 * TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }
        for (int i = 5; i <= 10; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 8 * TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }
        for (int i = 12; i <= 15; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 10 * TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }
        for (int i = 15; i <= 19; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 4* TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }
        for (int i = 9; i <= 14; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 6* TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }
        for (int i = 20; i <= 26; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 8* TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }
        for (int i = 22; i <= 23; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 3* TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }
        for (int i = 18; i <= 19; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 10* TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }
        for (int i = 28; i <= 31; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 7* TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }
        for (int i = 31; i <= 33; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 9* TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }
        for (int i = 35; i <= 35; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 4* TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }
        for (int i = 30; i <= 34; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 3* TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }
        for (int i = 39; i <= 42; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 5* TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }
        for (int i = 38; i <= 43; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 8* TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }
        for (int i = 42; i <= 47; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 10* TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }

        for (int i = 48; i <= 48; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 5* TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }
        for (int i = 51; i <= 51; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 8* TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }
        for (int i = 53; i <= 53; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 3* TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }
        for (int i = 53; i <= 54; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 10* TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }
        for (int i = 47; i <= 49; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 11* TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }
        for (int i = 56; i <= 56; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 4* TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            MetalPlate plate = new MetalPlate(x, y);
            addObject(plate, x, y);
        }

        //Ground for the bottom floor
        for (int i = -1; i <= 38; i += 1)
        {
            //Location
            int x = TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 4 * TILE_SIZE + HALF_TILE_SIZE;

            // Create and each object
            Ground plate = new Ground(x, y);
            addObject(plate, x, 460);
        }

        //Add monsters into the world
        Monster monster1 = new Monster();
        addObject(monster1, 230, 228);
        
        Monster monster2 = new Monster();
        addObject(monster2, 470, 293);
        
        Monster monster3 = new Monster();
        addObject(monster3, 400, 163);
    }

    /**
     * Add a few clouds for the opening scene.
     */
    private void addClouds()
    {
        Cloud cloud1 = new Cloud(170, 125);
        addObject(cloud1, 170, 125);
        Cloud cloud2 = new Cloud(450, 175);
        addObject(cloud2, 450, 175);
        Cloud cloud3 = new Cloud(775, 50);
        addObject(cloud3, 775, 50);
    }

    /**
     * Act
     * 
     * This method is called approximately 60 times per second.
     */
    public void act()
    {

    }

    /**
     * Add the hero to the world.
     */
    private void addHero()
    {
        // Initial horizontal position
        int initialX = getWidth() - 5 * getWidth() / 6;

        // Instantiate the hero object
        theHero = new Hero(initialX);

        // Add hero in bottom left corner of screen
        addObject(theHero, initialX, 3 * TILE_SIZE);
    }

    /**
     * Add blocks to create the ground to walk on at top-right of scrollable world.
     */
    private void addRightGround()
    {
        // Constants to control dimensions of the ground at end of world
        final int COUNT_OF_GROUND = 8;
        final int GROUND_BELOW_COLUMNS = COUNT_OF_GROUND;
        final int GROUND_BELOW_ROWS = 6;
        final int COUNT_OF_GROUND_BELOW = GROUND_BELOW_COLUMNS * GROUND_BELOW_ROWS;

        // 1. Make ground at end of level (top layer)
        for (int i = 0; i < COUNT_OF_GROUND; i += 1)
        {
            // Position in wider scrollable world
            int x = SCROLLABLE_WIDTH - TILE_SIZE / 2 - i * TILE_SIZE;
            int y = VISIBLE_HEIGHT / 2 + TILE_SIZE;

            // Create object and add it
            Ground ground = new Ground(x, y);
            addObject(ground, x, y);
        }

        // 2. Make sub-ground at end of level (below top layer)
        for (int i = 0; i < GROUND_BELOW_COLUMNS; i += 1)
        {
            for (int j = 0; j < GROUND_BELOW_ROWS; j += 1)
            {
                // Position in wider scrollable world
                int x = SCROLLABLE_WIDTH - TILE_SIZE / 2 - i * TILE_SIZE;
                int y = VISIBLE_HEIGHT / 2 + TILE_SIZE + TILE_SIZE * (j + 1);

                // Create object and add it
                GroundBelow groundBelow = new GroundBelow(x, y);
                addObject(groundBelow, x, y);
            }
        }
    }

    /**
     * Return an object reference to the hero.
     */
    public Hero getHero()
    {
        return theHero;
    }

    /**
     * Set game over
     */
    public void setGameOver()
    {
        isGameOver = true;
    }
}

