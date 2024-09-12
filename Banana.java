import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    public void act()
    {
        move(-3);
        
        if (getX() <= 0){
            resetBanana();
        }
    }
    
    public void resetBanana(){
        int num= Greenfoot.getRandomNumber(2);
        if (num == 0){
        setLocation(500,100);
    }
    else{
        setLocation(500,300);
    }
    }
}
