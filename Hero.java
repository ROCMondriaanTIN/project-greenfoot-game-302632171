
import greenfoot.*;

/**
*
* @author R. Springer senpai
*/
public class Hero extends Mover {

private final double gravity;
private final double acc;
private final double drag;
boolean Sleutel = false;
boolean sleutel1;
boolean sleutel2;
int goldcoin= 0;
int silvercoin= 0;
int diamant= 0;
int x = 125;
int y = 3185;

//int x = 35;
//int y = 3395;
private final GreenfootImage loop2 = new GreenfootImage("p1_walk01.png");
private final GreenfootImage loop3 = new GreenfootImage("p1_walk02.png");
private final GreenfootImage loop4 = new GreenfootImage("p1_walk03.png");
private final GreenfootImage loop5 = new GreenfootImage("p1_walk04.png");
private final GreenfootImage loop6 = new GreenfootImage("p1_walk05.png");
private final GreenfootImage loop7 = new GreenfootImage("p1_walk06.png");
private final GreenfootImage loop8 = new GreenfootImage("p1_walk07.png");
private final GreenfootImage loop9 = new GreenfootImage("p1_walk08.png");
private final GreenfootImage loop10 = new GreenfootImage("p1_walk09.png");
private final GreenfootImage loop11 = new GreenfootImage("p1_walk10.png");
private final GreenfootImage staand = new GreenfootImage("p1_walk11.png");

private final GreenfootImage loop2reverse = new GreenfootImage("p1_walk011.png");
private final GreenfootImage loop3reverse = new GreenfootImage("p1_walk022.png");
private final GreenfootImage loop4reverse = new GreenfootImage("p1_walk033.png");
private final GreenfootImage loop5reverse = new GreenfootImage("p1_walk044.png");
private final GreenfootImage loop6reverse = new GreenfootImage("p1_walk055.png");
private final GreenfootImage loop7reverse = new GreenfootImage("p1_walk066.png");
private final GreenfootImage loop8reverse = new GreenfootImage("p1_walk077.png");
private final GreenfootImage loop9reverse = new GreenfootImage("p1_walk088.png");
private final GreenfootImage loop10reverse = new GreenfootImage("p1_walk099.png");
private final GreenfootImage loop11reverse = new GreenfootImage("p1_walk0100.png");

private final GreenfootImage jump = new GreenfootImage("p1_walk01.png");

private int speed = 3;
private int frame;
private boolean lopen;
private boolean rechtsKijken;
private boolean isKeyPressed;
private int isTouching;


public Hero() {
super();
gravity = 9.8;
acc = 0.6;
drag = 0.8;
setImage("p1_stand.png");


lopen = false;
rechtsKijken = true;

staand.scale(70,100);
loop2.scale(70,100);
loop3.scale(70,100);
loop4.scale(70,100);
loop5.scale(70,100);
loop6.scale(70,100);
loop7.scale(70,100);
loop8.scale(70,100);
loop9.scale(70,100);
loop10.scale(70,100);
loop11.scale(70,100);

jump.scale(70,100);
loop2reverse.scale(70,100);
loop3reverse.scale(70,100);
loop4reverse.scale(70,100);
loop5reverse.scale(70,100);
loop6reverse.scale(70,100);
loop7reverse.scale(70,100);
loop8reverse.scale(70,100);
loop9reverse.scale(70,100);
loop10reverse.scale(70,100);
loop11reverse.scale(70,100);

}

public boolean onGround()
{
Actor under = getOneObjectAtOffset (0, getHeight ()/2,Tile.class);
Tile tile = (Tile) under;
return tile != null && tile.isSolid == true;
}
public void isTouching(){
 velocityY = -10;   
}


@Override
public void act() {
handleInput();




velocityX *= drag;
velocityY += acc;
if (velocityY > gravity) {
    velocityY = gravity;
}
{
if (isTouching(Checkpoint1.class))
{
    x=getX();
    y=getY();
}
}
applyVelocity();



for (Actor enemy : getIntersectingObjects(Slak.class)) {
    if (enemy != null) {
        setLocation ( x, y );
        return;
    }
}

for (Actor enemy : getIntersectingObjects(SpikeTile.class)) {
    if (enemy != null) {
        setLocation ( x, y );
        return;
    }
}

for (Actor enemy : getIntersectingObjects(LavaTile.class)) {
    if (enemy != null) {
        setLocation ( x, y );
        return;
    }
}

for (Actor enemy : getIntersectingObjects(LavaTile1.class)) {
    if (enemy != null) {
        setLocation ( x, y );
        return;
    }
}

for (Actor enemy : getIntersectingObjects(Door.class)) {
    if (enemy != null) {
    setLocation ( 100, 2555 );
        return;
    }
}

for (Actor enemy : getIntersectingObjects(Door1.class)) {
    if (enemy != null) {
    setLocation ( 3400, 3395 );
        return;
    }
}

for (Actor enemy : getIntersectingObjects(Door2.class)) {
    if (enemy != null) {
    setLocation ( 100 , 1645 );
        return;
    }
}

for (Actor enemy : getIntersectingObjects(Door3.class)) {
    if (enemy != null) {
    setLocation ( 3400 , 2555 );
        return;
    }
}
for (Actor enemy : getIntersectingObjects(Diamant.class)) {
    if (enemy != null) {
    removeTouching ( Diamant.class );
        return;
    }
}
for (Actor enemy : getIntersectingObjects(Goldcoin.class)) {
    if (enemy != null) {
    removeTouching ( Goldcoin.class );
        return;
    }
}
for (Actor enemy : getIntersectingObjects(Silvercoin.class)) {
    if (enemy != null) {
    removeTouching ( Silvercoin.class );
        return;
    }
}
for (Actor enemy : getIntersectingObjects(Door4.class)) {
    if (enemy != null) {
    setLocation ( 155, 2050 );
        return;
    }
}
for (Actor enemy : getIntersectingObjects(Door5.class)) {
    if (enemy != null) {
    setLocation ( 3315, 3115 );
        return;
    }
}
for (Actor enemy : getIntersectingObjects(Door6.class)) {
    if (enemy != null) {
    setLocation ( 135,2500 );
        return;
    }
}
for (Actor enemy : getIntersectingObjects(Door7.class)) {
    if (enemy != null) {
    setLocation ( 185,1980 );
        return;
    }
}
for (Actor enemy : getIntersectingObjects(Door8.class)) {
    if (enemy != null) {
    setLocation ( 135,1250 );
        return;
    }
}
for (Actor enemy : getIntersectingObjects(Door9.class)) {
    if (enemy != null) {
    setLocation ( 135,550 );
        return;
    }
}

for (Actor enemy : getIntersectingObjects(NextDoor.class)) {
    if (Sleutel==true && isTouching(NextDoor.class)) {
    Greenfoot.setWorld(new MyWorld2());
    Sleutel=false;
        return;
    }
}
for (Actor enemy : getIntersectingObjects(NextDoor2.class)) {
    if (Sleutel==true && isTouching(NextDoor2.class)) {
    Greenfoot.setWorld(new MyWorld3());
    Sleutel=false;
        return;
    }
}
for (Actor enemy : getIntersectingObjects(NextDoor3.class)) {
    if (Sleutel==true && isTouching(NextDoor3.class)) {
    Greenfoot.setWorld(new MyWorld4());
    Sleutel=false;
        return;
    }
}
   
{
        for(Actor enemy : getIntersectingObjects(Sleutel.class))
        {
        
            if(isTouching(Sleutel.class))
            {
                removeTouching(Sleutel.class);
                Sleutel= true;
                break;
            }
        }
        return;
    }
  
    

    
    

}
/*  public boolean collectCoin()
{
    Actor coinTouched= getOneIntersectingObject(Coin.class);
    return coinTouched!=null;
    */

// for (Actor enemy : getIntersectingObjects(Coinbox.class)) {
//   if (enemy != null) {
//       getWorld().removeObject(this);//return;
//}
//}


public void handleInput() {
if ((Greenfoot.isKeyDown("up") && onGround() == true ) ||(Greenfoot.isKeyDown("up") && isTouching(Rope.class))){
    velocityY = -10;
    }
    
   if (Greenfoot.isKeyDown("down") )  {
        velocityY = 5;
    }

if (Greenfoot.isKeyDown("left"))  {
walkLeft();            
velocityX = -7;
            }
        
        if (Greenfoot.isKeyDown("right")) {
            walkRight();
            velocityX = 7;
            
        }
    }

     public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
    
    public void Checkpoint1()
    {
        setLocation(155, 2555);
    }
     
    public void SpikeTile()
    {
        if(isTouching(SpikeTile.class))
        {
            Checkpoint1();
        }
    }
    
       public void LavaTile()
    {
        if(isTouching(LavaTile.class))
        {
            Checkpoint1();
        }
    }
        public void LavaTile1()
    {
        if(isTouching(LavaTile1.class))
        {
            Checkpoint1();
        }
    }

    
    
    
    
    public void walkRight()
    {
        lopen = true;
        rechtsKijken = true;
        frame ++;
        if(frame==1)
        {
            setImage(loop2);
        }
        else if(frame==2)
        {
            setImage(loop3);
        }
        else if(frame==3)
        {
            setImage(loop4);
        }
        else if(frame==4)
        {
            setImage(loop5);
        }
        else if(frame==5)
        {
            setImage(loop6);
        }
        else if(frame==6)
        {
            setImage(loop7);
        }
        else if(frame==7)
        {
            setImage(loop8);
        }
        else if(frame==8)
        {
            setImage(loop9);
        }
        else if(frame==9)
        {
            setImage(loop8);
        }
        else if(frame==10)
        {
            setImage(loop9);
        }
        else if(frame==11)
        {
            
            setImage(loop11);
            frame = 1;
            return;
        }
    }
    
    public void walkLeft()
    {
        lopen = true;
        rechtsKijken = false;
        frame ++;
        if(frame==1)
        {
            setImage(loop2reverse);
        }
        else if(frame==2)
        {
            setImage(loop3reverse);
        }
        else if(frame==3)
        {
            setImage(loop4reverse);
        }
        else if(frame==4)
        {
            setImage(loop5reverse);
        }
        else if(frame==5)
        {
            setImage(loop6reverse);
        }
       else if(frame==6)
        {
            setImage(loop7reverse);
        }
        else if(frame==7)
        {
            setImage(loop8reverse);
        }
        else if(frame==8)
        {
            setImage(loop9reverse);
        }
        else if(frame==9)
        {
            setImage(loop10reverse);
        }
        else if (frame==12)
        {
            setImage(loop11reverse);
            frame = 1;
            return;
        }
    }
	
	
	public void stopLopen() {
		lopen = false;
		if(rechtsKijken)
			setImage(staand);
		else
			setImage(loop3reverse);
	
		
	}
	
 
    
}

   


  
