import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    public void act()
    {
        move(-5);
        
        if (getX() <= 0){
            resetBanana();
        }
        
        if (isTouching(Hero.class)){
            //Add a gameover symbol
            SadFace sadface = new SadFace();
            getWorld().addObject(sadface, 300, 200);
            getWorld().removeObject(this);
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
