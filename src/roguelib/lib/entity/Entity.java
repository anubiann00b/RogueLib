package roguelib.lib.entity;

public abstract class Entity implements Comparable<Entity> {
    
    private static int counter;
    
    /** A unique identification number. */
    private int id;
    
    /** Time until next update, in ticks. */
    private int updateTime;
    
    /** The X position of the entity. */
    private int x;
    
    /** The Y position of the entity. */
    private int y;
    
    public Entity() {
        id = counter++;
    }
    
    @Override
    public int compareTo(Entity o) {
        return updateTime>o.updateTime ? 1 : (updateTime<o.updateTime?-1:0);
    }
    
    /**
     * Updates the Entity.
     */
    public abstract void update();
}
