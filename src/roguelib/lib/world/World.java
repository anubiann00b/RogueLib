package roguelib.lib.world;

import java.util.ArrayList;
import java.util.List;

/**
 * The entire game world.
 * 
 * Contains a list of Levels, and the current Level.
 * 
 * @author Shreyas
 */
public class World {
    
    private List<Level> levels;
    private Level currentLevel;
    
    /**
     * Constructs a new world with the specified starting level.
     * 
     * @param l The starting Level.
     */
    public World(Level l) {
        levels = new ArrayList<Level>();
        levels.add(l);
    }
    
    /**
     * Updates the current level.
     */
    public void update() {
        currentLevel.update();
    }
    
    /**
     * @return The current level
     */
    public Level getCurrentLevel() {
        return currentLevel;
    }
}
