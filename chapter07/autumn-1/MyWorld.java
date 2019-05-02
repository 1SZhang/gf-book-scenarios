import Greenfoot.*;

/**
 * Autumn. A world with some leaves.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class MyWorld extends World
{
    /**
     * Create the world and objects in it.
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        setUp();
    }
    
    /**
     * Create the initial objects in the world.
     */
    private void setUp()
    {
        addObject(new Block(), 300, 200);
        
        for(int i = 1;i <= 18;i += 1)
        {  
            Leaf aleaf = new Leaf();
            
            
            //Get radom location 
            
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            
            //  Add leaf objecrt to the world 
            addObject(aLeaf,x,y);
        }
    }
}
