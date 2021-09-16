import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class defines a Mouse. The mouse likes Cheese.
 * 
 * @author Phoebe Sothern
 * @version 9/15/21
 */
public class Mouse extends Actor
{
    private int numOfCheese = 0;
    // This method repeats the following actions
    public void act()
    {
        move(3);
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }
    
    // Turns the Mouse at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
       {
           turn(50);
       }
    }
    
    
    // Checks for user key presses so user can turn the Mouse
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            Greenfoot.delay(1);
        }
    }

    
    // Check for collisions with other objects
    private void onCollision()
    {
       if(isTouching(Cheese.class))  
        {
            removeTouching(Cheese.class);
            Greenfoot.playSound("slurp.wav");
            numOfCheese--;
            
            // Winning the game
            if(getWorld().getObjects(Cheese.class).size() == 0)
            {
                Greenfoot.setWorld(new WinSplashMouse());
                Greenfoot.stop();
            }
        }
       
       if(isTouching(Cat.class))
        {
            Greenfoot.stop();
        }
    }
}