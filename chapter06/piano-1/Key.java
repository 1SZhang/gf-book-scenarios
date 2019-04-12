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
    
    // Trak what key is beeing played and what sound file to play.
    // (isDown is a premitive data type - show in red , type is lowercase)
    private String key;
    private String sound;
    
    
    
    /**
     * Creat new key
     */
    public Key(String keyName, String soundFile)
    {
        isDown = false;
        //Initiallize the key and sound instance varivles
        key = keyName;
        sound = soundFile;
        
    }

    /**
     * Act - do whatever the Key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( isDown == false && Greenfoot.isKeyDown(key))
        {
            setImage("white-key-down.png");
            isDown = true;
            play();
            
        }    

        if (isDown == true && Greenfoot.isKeyDown(key) == false)
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

        Greenfoot.playSound(sound +".wav");
    }

}