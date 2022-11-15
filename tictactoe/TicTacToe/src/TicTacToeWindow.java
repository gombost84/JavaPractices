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
    private String lastSymbol = "";
    private String button1Text = "";
    private String button2Text = "";
    private String button3Text = "";
    private String button4Text = "";
    private String button5Text = "";
    private String button6Text = "";
    private String button7Text = "";
    private String button8Text = "";
    private String button9Text = "";

    TicTacToeWindow() {
        
        GameWindow(TicTacToeFrame(windowWidth, windowHeight - menuHeight, name), TicTacToeMenuBar(windowWidth, menuHeight));
        
    }

    private JFrame GameWindow(JFrame frame, JMenuBar menu) {
        
        frame.setJMenuBar(menu);
        
        JButton button1 = TicTacToeButton();
        
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                switch (lastSymbol) {
                    
                    case "":
                        button1Text = "X";
                        button1.setText(button1Text);
                        lastSymbol = button1Text;

                    case "X":
                        switch (button1Text) {
                            case "":
                                button1Text = "O";
                                button1.setText(button1Text);
                                lastSymbol = button1Text;
                        }

                    case "O":
                        switch (button1Text) {
                            case "":
                                button1Text = "X";
                                button1.setText(button1Text);
                                lastSymbol = button1Text;
                    }
                }
            }
    });

        JButton button2 = TicTacToeButton();
        
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                switch (lastSymbol) {
                    
                    case "":
                        button2Text = "X";
                        button2.setText(button2Text);
                        lastSymbol = button2Text;

                    case "X":
                        switch (button2Text) {
                            case "":
                                button2Text = "O";
                                button2.setText(button2Text);
                                lastSymbol = button2Text;
                        }

                    case "O":
                        switch (button2Text) {
                            case "":
                                button2Text = "X";
                                button2.setText(button2Text);
                                lastSymbol = button2Text;
                    }
                }
            }
    });

        JButton button3 = TicTacToeButton();
        
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                switch (lastSymbol) {
                    
                    case "":
                        button3Text = "X";
                        button3.setText(button3Text);
                        lastSymbol = button3Text;

                    case "X":
                        switch (button3Text) {
                            case "":
                                button3Text = "O";
                                button3.setText(button3Text);
                                lastSymbol = button3Text;
                        }

                    case "O":
                        switch (button3Text) {
                            case "":
                                button3Text = "X";
                                button3.setText(button3Text);
                                lastSymbol = button3Text;
                    }
                }
            }
    });
        
        JButton button4 = TicTacToeButton();
        
        button4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                switch (lastSymbol) {
                    
                    case "":
                        button4Text = "X";
                        button4.setText(button4Text);
                        lastSymbol = button4Text;

                    case "X":
                        switch (button4Text) {
                            case "":
                                button4Text = "O";
                                button4.setText(button4Text);
                                lastSymbol = button4Text;
                        }

                    case "O":
                        switch (button4Text) {
                            case "":
                                button4Text = "X";
                                button4.setText(button4Text);
                                lastSymbol = button4Text;
                    }
                }
            }
    });
        JButton button5 = TicTacToeButton();
        
        button5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                switch (lastSymbol) {
                    
                    case "":
                        button5Text = "X";
                        button5.setText(button5Text);
                        lastSymbol = button5Text;

                    case "X":
                        switch (button5Text) {
                            case "":
                                button5Text = "O";
                                button5.setText(button5Text);
                                lastSymbol = button5Text;
                        }

                    case "O":
                        switch (button5Text) {
                            case "":
                                button5Text = "X";
                                button5.setText(button5Text);
                                lastSymbol = button5Text;
                    }
                }
            }
    });
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

        return button;
    }
}
