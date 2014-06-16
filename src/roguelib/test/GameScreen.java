package roguelib.test;

import asciiPanel.AsciiPanel;
import roguelib.lib.Screen;

public class GameScreen extends Screen {
    
    @Override
    public void render(AsciiPanel terminal) {
        for (int i=0;i<terminal.getWidthInCharacters();i++)
            for (int j=0;j<terminal.getHeightInCharacters();j++)
                terminal.write((char)(Math.random()*256),i,j);
    }
    
    @Override
    public Screen update(char key) {
        return this;
    }
}
