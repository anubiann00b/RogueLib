package roguelib.lib;

import asciiPanel.AsciiPanel;

/**
 * Represents a Screen in game.
 * 
 * For example, MenuScreen, GameScreen, TitleScreen.
 * 
 * @author Shreyas
 */
public abstract class Screen {
    
    /**
     * Writes output to the terminal.
     * 
     * @param terminal The terminal to write output to.
     */
    public abstract void render(AsciiPanel terminal);
    
    /**
     * Updates the game.
     * 
     * @param key The character that was entered.
     * @return The next Screen (if the Screen has not changed, should return itself).
     */
    public abstract Screen update(char key);
}
