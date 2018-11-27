
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * @author R. Springer
 */
public class MyWorld3 extends World {

    private CollisionEngine ce;
   // private char coinsCollectedText;
    //private int coinsCollected;
    
    /**
     * Constructor for objects of class MyWorld3.
     *
     */
    public MyWorld3() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false);
        this.setBackground("bg.png");


        int[][] map = {
{6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,59,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,172,6,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,126,104,58,6,104,104,104,104,104,104,104,104,104,6},
{6,6,6,6,6,104,6,6,6,6,6,6,6,6,6,104,6,6,6,6,6,6,6,6,104,6,6,6,6,6,6,6,6,6,104,6,6,6,6,6,6,6,6,6,104,6,6,6,6,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,-1,104,104,104,104,104,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,197,197,197,197,197,197,197,197,189,6,197,197,197,197,197,197,197,197,197,6,197,197,197,197,197,197,197,197,197,6,197,197,104,104,104,197,197,197,6,197,197,197,104,104,104,197,197,197,6},
{6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,104,6,6,6,6,6,6,6,6,6,104,6,6,6,6,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,90,90,104,104,104,104,104,104,104,104,90,90,104,104,104,104,104,104,104,104,90,90,104,104,104,6,104,104,104,90,90,104,104,104,104,104,104,104,104,90,90,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,197,197,197,104,104,104,197,197,197,6,197,197,197,104,104,104,197,197,197,6,239,197,197,197,197,197,197,197,197,6,197,197,104,104,104,197,197,197,6,197,197,197,104,104,104,197,197,195,6},
{6,6,6,6,6,104,6,6,6,6,6,6,6,6,6,104,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,104,6,6,6,6,6,6,6,6,6,104,6,6,6,6,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,90,90,104,104,104,104,104,104,104,104,90,90,104,104,104,6,104,104,104,104,90,90,104,104,104,104,104,104,104,90,90,104,104,104,104,104,104,104,104,90,90,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,-1,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,197,197,197,104,104,104,197,197,197,6,197,197,197,104,104,104,197,197,239,6,197,197,197,197,197,197,197,197,197,6,197,197,197,197,197,197,197,239,6,197,197,197,104,104,104,197,197,197,6},
{6,6,6,6,6,104,6,6,6,6,6,6,6,6,6,104,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,104,6,6,6,6,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,90,90,104,104,104,104,104,104,104,104,90,90,104,104,104,104,104,104,104,90,90,104,104,104,104,104,104,104,104,90,90,104,104,104,104,104,104,104,104,90,90,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,6,104,104,104,104,104,104,104,104,104,6},
{6,197,197,197,104,104,104,197,197,197,6,197,197,197,104,104,104,197,197,197,6,197,197,104,104,104,197,197,197,197,6,197,197,104,104,104,197,197,197,6,197,197,197,104,104,104,197,197,197,6},
{6,6,6,6,6,104,6,6,6,6,6,6,6,6,6,104,6,6,6,6,6,6,6,6,104,6,6,6,6,6,6,6,6,6,104,6,6,6,6,6,6,6,6,6,104,6,6,6,6,6},
{6,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,6},
{6,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,6},
{6,61,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,104,6},
{6,60,128,128,128,128,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,6},
{6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6},









        };

    // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen
        TileEngine te = new TileEngine(this, 70, 70, map);
        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera
        Camera camera = new Camera(te);
        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 
        // moet de klasse Mover extenden voor de camera om te werken
        Hero hero = new Hero();

        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);

        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 0, 0);
       
        addObject(hero, 115, 3200);       //  Spawn plek

        /*  
        addObject(new Enemy(), 1170, 410);
        addObject(new Slak(), 2900, 3414);
        addObject(new Slak(), 2830, 3414);
        addObject(new Slak(), 2760, 3414);
        addObject(new Door(), 3465, 3395);
        addObject(new Door1(), 35, 2555);
        addObject(new Door2(), 3465 , 2555);
        addObject(new Door3(), 35 , 1645);
        */
        camera.act();
        hero.act();
        
        //Door.act();
        //coinsCollectedText = new Text("You have collected 0/40 points for an new life", 20); 
        //addObject(coinsCollectedText, 36,2800);
        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        ce = new CollisionEngine(te, camera);
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
    }
        
    @Override
    public void act() {
        ce.update();
    }
}
