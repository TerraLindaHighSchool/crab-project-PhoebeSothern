import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Cat is the enemy of the Mouse
 * 
 * @author Phoebe Sothern 
 * @version 9/15/21
 */
public class Cat extends Actor
{
    // This method repeats the following actions
    public void act()
    {
        move(3);
        turnAtEdge();
       
    }
    
    // Turns the Cat at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
       {
           turn(50);
       }
    }
    
}