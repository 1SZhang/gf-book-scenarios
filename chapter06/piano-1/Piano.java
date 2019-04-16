import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Instence variables (Can be used anywhere below)
     */
    int frames;
    // Object data type .....Square braket [] indecate an array(a list)
    String[] studentNames = {"Sarah", "Chelsea","Jack","Maxwell","Gavin","Minah","Bradon","Jeewoo","Peter","Justy"};
    // Trac the white key and note
    String[] whiteKey = {"a","s","d","f","g","h","j","K","l",";","'","//"};
    String[] whiteNte = {"3c","3d","3e","3f","3g","3a","3b","4c","4d","4e","4f","4g"};
    
    
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        frames = 0;

    }

    /**
     * Act-called repeatedly to creat animation
     */

    public void act()
{
        // This blovk of code runce onece per second 
        if((frames % 60==0) && (frames / 60 < 10))
        {
            
            //showText("Hello" + studentNames[frames / 60 ], 400, 170);

        }
         
        frames += 1;


        showText("" + frames, 100, 100);

        //Every second say hello to the next person in the list

    }

}


