package roguelib.test;

import java.awt.Color;
import javax.swing.JFrame;
import roguelib.lib.Roguelike;
import roguelib.lib.Screen;

public class Sample extends Roguelike {
    
    public static void main(String[] args) {
        Sample game = new Sample(new GameScreen());
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setVisible(true);
        game.setBackground(Color.black);
        game.setTitle("Sample Roguelike");
    }
    
    public Sample(Screen startScreen) {
        super(startScreen);
    }
}
