import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends Actor
{

    /**
     * Instence varible
     */
    //Tharks the piano key is down or not
    private boolean isDown;

    /**
     * Creat new key
     */
    public Key()
    {
        isDown = false;
    }

    /**
     * Act - do whatever the Key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( isDown == false && Greenfoot.isKeyDown("g"))
        {
            setImage("white-key-down.png");
            isDown = true;
            play();
            
        }    

        if (isDown == true && Greenfoot.isKeyDown("g") == false)
        {

            setImage("white-key.png");
            isDown = false;

        }
    }

    /**
     * Play the note of this key
     */
    public void play()

    {

        Greenfoot.playSound("3a.wav");
    }

}