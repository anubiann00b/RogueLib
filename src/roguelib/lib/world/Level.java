package roguelib.lib.world;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import roguelib.lib.entity.Entity;
import roguelib.lib.entity.Player;

/**
 * A single level in a world.
 * 
 * A level can be a dungeon level, or an area in the overworld.
 * 
 * @author Shreyas
 */
public class Level {
    
    private Map map;
    private List<Entity> entities;
    
    /**
     * Constructs a new level with the given map.
     * 
     * @param m The map of the level.
     */
    public Level(Map m) {
        entities = new ArrayList<Entity>();
        map = m;
    }
    
    /**
     * Adds an Entity to the Level.
     * 
     * @param e The entity to add.
     */
    public void addEntity(Entity e) {
        int i = Collections.binarySearch(entities,e);
        entities.add(i,e);
    }
    
    /**
     * Updates the level until Player is next in queue.
     */
    public void update() {
        Entity e;
        while (!((e = entities.get(0)) instanceof Player)) {
            e.update();
        }
    }
}
