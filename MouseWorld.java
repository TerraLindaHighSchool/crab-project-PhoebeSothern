import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Mouse lives in a house with its enemy the Cat.
 * 
 * @author Phoebe Sothern
 * @version 9/15/21
 */
public class MouseWorld extends World
{

    /**
     * Constructor for objects of class MouseWorld.
     * 
     */
    public MouseWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cat cat = new Cat();
        addObject(cat,182,285);
        Mouse mouse = new Mouse();
        addObject(mouse,380,283);
        Cheese cheese = new Cheese();
        addObject(cheese,284,268);
        Cheese cheese2 = new Cheese();
        addObject(cheese2,358,68);
        Cheese cheese3 = new Cheese();
        addObject(cheese3,500,364);
        Cheese cheese4 = new Cheese();
        addObject(cheese4,428,497);
        Cheese cheese5 = new Cheese();
        addObject(cheese5,294,471);
        Cheese cheese6 = new Cheese();
        addObject(cheese6,132,468);
        Cheese cheese7 = new Cheese();
        addObject(cheese7,188,65);
        Cheese cheese8 = new Cheese();
        addObject(cheese8,152,134);
        cheese8.setLocation(88,114);
        cheese2.setLocation(419,38);
        cheese7.setLocation(200,55);
        cheese6.setLocation(88,496);
        cheese5.setLocation(248,411);
        cheese4.setLocation(446,498);
        cat.setLocation(186,261);
        removeObject(cat);
        addObject(cat,238,274);
        cat.setLocation(173,271);
        mouse.setLocation(373,248);
        mouse.setLocation(373,271);
        cat.setLocation(183,256);
        cat.setLocation(180,270);
        mouse.setLocation(362,268);
    }
}
