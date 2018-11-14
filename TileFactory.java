
/**
 *
 * @author R. Springer
 */
public class TileFactory {

    /**
     * Creates a Tile object based on the mapIcon number you give
     *
     * @param mapIcon number
     * @return Tile tile object
     */
    public static Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {
            case 0:
                tile = new Tile("box.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 1:
                tile = new Tile("boxAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 2:
                tile = new Tile("boxCoin.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 3:
                tile = new Tile("boxExplosive.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 4:
                tile = new Tile("boxItem.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 5:
                tile = new Tile("bridgeLogs.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.getImage().mirrorVertically();
                tile.isSolid = true;
                break;
            case 6:
                tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 7:
                tile = new Tile("grassLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 8:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 9:
                tile = new Tile("grassRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 10:
            tile = new Tile("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 11:
                tile = new Tile("liquidWaterTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 12:
                tile = new Tile("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 13:
                tile = new Tile("signLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 14:
                tile = new Tile("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            
            case 172:
                tile = new Tile("keyYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 61:
                tile = new Tile("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 60:
                tile = new Tile("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 82:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;    
            case 128:
                tile = new Tile("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;  
            case 127:
                tile = new Tile("signLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;  
            case 126:
                tile = new Tile("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;     
            case 66:
                tile = new Tile("grassCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;  
            case 58:
                tile = new Tile("door_closedMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break; 
            case 59:
                tile = new Tile("door_closedTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;     
            case 76:
                tile = new Tile("grassHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;  
            case 75:
                tile = new Tile("grassHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;       
            case 91:
                tile = new Tile("liquidLavaTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break; 
            case 90:
                tile = new Tile("liquidLava.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break; 
            case 16:
                tile = new Tile("bridge.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;    
                
                
                
            default:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
        }
        return tile;
    }
}
