package simulation;

import java.awt.*;
import java.awt.image.BufferStrategy;
import javax.swing.*;

class GUI extends JFrame {

    private Canvas c = new Canvas();

    GUI() {
        super("canvas");

        // set background
        c.setBackground(Color.black);

        add(c);
        setSize(1000, 1000);
        setVisible(true);
        c.createBufferStrategy(3);
    }

    public void updateGUI(int i) {
        BufferStrategy bufferStrategy = c.getBufferStrategy();
        Graphics graphics = bufferStrategy.getDrawGraphics();
        graphics.clearRect(0, 0, 100, 100);

        graphics.setColor(Color.GREEN);
        graphics.drawString("This is some text placed in the top left corner.", i*5, i*15);

        bufferStrategy.show();
        graphics.dispose();
    }

}
