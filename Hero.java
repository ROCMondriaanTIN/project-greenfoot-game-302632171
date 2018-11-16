
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
    applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                return;
            }
        }
        
        for (Actor enemy : getIntersectingObjects(Slak.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                return;
            }
        }
        
        for (Actor enemy : getIntersectingObjects(SpikeTile.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                return;
            }
        }
        
        for (Actor enemy : getIntersectingObjects(LavaTile.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                return;
            }
        }
        
        for (Actor enemy : getIntersectingObjects(LavaTile1.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
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
        
        // for (Actor enemy : getIntersectingObjects(Coinbox.class)) {
        //   if (enemy != null) {
        //       getWorld().removeObject(this);//return;
        //}
        //}
    }

    public void handleInput() {
        if (Greenfoot.isKeyDown("up") && velocityY == 0) {
         velocityY = -10;
        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -5;
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 7;
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}


  
