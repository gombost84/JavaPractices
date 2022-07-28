import java.awt.*;
import javax.swing.*;

public class Frame {

    private Color menuColor = new Color(154, 165, 127);
    private Color labelColor = new Color(248, 213, 131);
    private int windowWidth = 600;

    Frame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setOpaque(true);
        menuBar.setPreferredSize(new Dimension(windowWidth, 20));
        menuBar.setBackground(menuColor);

        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setBackground(labelColor);
        label.setPreferredSize(new Dimension(windowWidth, 780));

        
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(label, BorderLayout.CENTER);

        
        frame.pack();
        frame.setVisible(true);
    }
}
