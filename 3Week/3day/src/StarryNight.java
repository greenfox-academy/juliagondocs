import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        sky(graphics);
    }

    public static void sky(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, 320, 343);
        for (int i = 0; i < 400; i++) {
            int randomX = (int) (Math.random() * 320);
            int randomY = (int) (Math.random() * 343);
            int randomColor = (int) (Math.random() * 255);
            graphics.setColor(new Color(randomColor, randomColor, randomColor));
            graphics.fillRect(randomX, randomY, 5, 5);
        }

    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}