import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.*;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class TicTacToeWindow {    

    private Color menuColor = new Color(154, 165, 127);
    private int windowWidth = 600;
    private int windowHeight = 800;
    private int menuHeight = 20;
    private String name = "Tic Tac Toe";
    TextField text = new TextField(20);
    private int numClicks = 0;

    TicTacToeWindow() {
        
        GameWindow(TicTacToeFrame(windowWidth, windowHeight - menuHeight, name), TicTacToeMenuBar(windowWidth, menuHeight));
        
    }

    private JFrame GameWindow(JFrame frame, JMenuBar menu) {
        
        frame.setJMenuBar(menu);
        
        JButton button1 = TicTacToeButton();
        JButton button2 = TicTacToeButton();
        JButton button3 = TicTacToeButton();
        
        JButton button4 = TicTacToeButton();
        JButton button5 = TicTacToeButton();
        JButton button6 = TicTacToeButton();
        
        JButton button7 = TicTacToeButton();
        JButton button8 = TicTacToeButton();
        JButton button9 = TicTacToeButton();        

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.add(button4);
        frame.add(button5);
        frame.add(button6);

        frame.add(button7);
        frame.add(button8);
        frame.add(button9);

        return frame;
    }

    private JFrame TicTacToeFrame(int width, int height, String name) {

        JFrame frame = new JFrame(name);
        GridLayout grid = new GridLayout(3, 3);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(grid);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);

        return frame;
    }

    private JMenuBar TicTacToeMenuBar(int width, int height) {

        JMenuBar menuBar = new JMenuBar();
        menuBar.setPreferredSize(new Dimension(windowWidth, menuHeight));
        menuBar.setBackground(menuColor);

        return menuBar;
    }

    private JButton TicTacToeButton() {

        JButton button = new JButton("Click me");
        
        button.add(text);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                numClicks++;
                text.setText("Button Clicked " + numClicks + " times");
                
            }
        });

        return button;
    }
}
