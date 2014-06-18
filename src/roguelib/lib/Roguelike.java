package roguelib.lib;

import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 * A top-level class for making a Roguelike game.
 * 
 * @author Shreyas
 */
public abstract class Roguelike extends JFrame implements KeyListener {
    
    private AsciiPanel terminal;
    private Screen screen;
    
    /**
     * Creates a new Roguelike game.
     * 
     * @param startScreen The starting Screen.
     */
    public Roguelike(Screen startScreen) {
        super();
        terminal = new AsciiPanel(80,24);
        add(terminal);
        pack();
        screen = startScreen;
        addKeyListener(this);
        repaint();
    }
    
    /**
     * Repaints the Screen.
     * 
     * Should not be called explicitly by user.
     */
    @Override
    public void repaint() {
        terminal.clear();
        screen.render(terminal);
        super.repaint();
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        screen = screen.update(e.getKeyChar());
        repaint();
    }
    
    @Override public void keyTyped(KeyEvent e) { }
    @Override public void keyReleased(KeyEvent e) { }
}