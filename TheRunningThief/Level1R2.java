import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1R2 here.
 * 
 * @author (Min Lu) 
 * @version (11/12/2018)
 */
public class Level1R2 extends GamePage {

    /**
     * Constructor for objects of class Level1R2.
     * 
     */
    public Level1R2() {
        super();
    }
    
    public void prepare() {        
        addObject(thief,136,630);
        addObject(score,819,79);
        
        Points points = new Points();
        addObject(points,817,28);
        
        SwordUp swordUp1 = new SwordUp(false, 1, 0, 1200);
        SwordUp swordUp2 = new SwordUp(false, 1, 0, 1200);
        SwordUp swordUp3 = new SwordUp(false, 1, 0, 1200);
        SwordUp swordUp4 = new SwordUp(false, 1, 0, 1200);
        
        addObject(swordUp1,300,770);
        addObject(swordUp2,500,770);
        addObject(swordUp3,700,770);
        addObject(swordUp4,900,770);

        swordUp1.buttonEvent();
        swordUp2.buttonEvent();
        swordUp3.buttonEvent();
        swordUp4.buttonEvent();
        
        Diamond diamond1 = new Diamond();
        Diamond diamond2 = new Diamond();
        Diamond diamond3 = new Diamond();
        Diamond diamond4 = new Diamond();
        Diamond diamond5 = new Diamond();
        Diamond diamond6 = new Diamond();
        Diamond diamond7 = new Diamond();
        Diamond diamond8 = new Diamond();
        Diamond diamond9 = new Diamond();
        Diamond diamond10 = new Diamond();
        Diamond diamond11 = new Diamond();
        Diamond diamond12 = new Diamond();
        
        addObject(diamond1,250,550);
        addObject(diamond2,300,500);
        addObject(diamond3,350,550);

        addObject(diamond4,450,450);
        addObject(diamond5,500,400);
        addObject(diamond6,550,450);
        
        addObject(diamond7,650,450);
        addObject(diamond8,750,400);
        addObject(diamond9,800,450);

        addObject(diamond10,900,550);
        addObject(diamond11,950,500);
        addObject(diamond12,1000,550);

        setPaintOrder(Thief.class, Diamond.class, RedButton.class);
    }
    
    
}