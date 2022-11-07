import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class TicTacToeFrame {

    private Color menuColor = new Color(154, 165, 127);
    private int windowWidth = 600;
    private int windowHeight = 800;
    private int menuHeight = 20;

    TicTacToeFrame() {
        JFrame frame = new JFrame("Tic Tac Toe");

        GridLayout grid = new GridLayout(3, 3);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(grid);
        frame.setPreferredSize(new Dimension(windowWidth, windowHeight - menuHeight));
        frame.setResizable(false);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setOpaque(true);
        menuBar.setPreferredSize(new Dimension(windowWidth, menuHeight));
        menuBar.setBackground(menuColor);
        
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        
        JButton button4 = new JButton();
        JButton button5 = new JButton();
        JButton button6 = new JButton();
        
        JButton button7 = new JButton();
        JButton button8 = new JButton();
        JButton button9 = new JButton();
        
        frame.setJMenuBar(menuBar);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.add(button4);
        frame.add(button5);
        frame.add(button6);

        frame.add(button7);
        frame.add(button8);
        frame.add(button9);

        
        frame.pack();
        frame.setVisible(true);
    }
}
