import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,69,124);
        crab.setLocation(200,146);
        Worm worm = new Worm();
        addObject(worm,415,22);
        Worm worm2 = new Worm();
        addObject(worm2,28,266);
        Worm worm3 = new Worm();
        addObject(worm3,52,46);
        Worm worm4 = new Worm();
        addObject(worm4,498,507);
        Worm worm5 = new Worm();
        addObject(worm5,169,430);
        Worm worm6 = new Worm();
        addObject(worm6,301,304);
        Worm worm7 = new Worm();
        addObject(worm7,359,424);
        Worm worm8 = new Worm();
        addObject(worm8,366,138);
        Lobster lobster = new Lobster();
        addObject(lobster,388,270);
        Cat cat = new Cat();
        addObject(cat,246,229);
        Mouse mouse = new Mouse();
        addObject(mouse,278,155);
        cat.setLocation(126,344);
        removeObject(lobster);
        crab.setLocation(197,144);
        removeObject(crab);
    }
}