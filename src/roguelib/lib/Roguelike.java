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
    
    public Roguelike(Screen startScreen) {
        super();
        terminal = new AsciiPanel(80,24);
        add(terminal);
        pack();
        screen = startScreen;
        addKeyListener(this);
        repaint();
    }
    
    @Override
    public void repaint() {
        terminal.clear();
        screen.render(terminal);
        super.repaint();
    }
    
    @Override
    public void keyPressed(KeyEvent e) { }
    
    @Override
    public void keyReleased(KeyEvent e) { }
    
    @Override
    public void keyTyped(KeyEvent e) {
        screen = screen.update(e.getKeyChar());
        repaint();
    }
}