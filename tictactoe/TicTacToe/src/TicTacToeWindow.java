import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class TicTacToeWindow implements ActionListener {   

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

        private JButton button1 = TicTacToeButton();
        private JButton button2 = TicTacToeButton();
        private JButton button3 = TicTacToeButton();
        private JButton button4 = TicTacToeButton();
        private JButton button5 = TicTacToeButton();
        private JButton button6 = TicTacToeButton();
        private JButton button7 = TicTacToeButton();
        private JButton button8 = TicTacToeButton();
        private JButton button9 = TicTacToeButton();

        TicTacToeWindow() {
        
        GameWindow(TicTacToeFrame(windowWidth, windowHeight - menuHeight, name), TicTacToeMenuBar(windowWidth, menuHeight));
        
    }    

    private JFrame GameWindow(JFrame frame, JMenuBar menu) {
        
        frame.setJMenuBar(menu);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.add(button4);
        frame.add(button5);
        frame.add(button6);

        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
               
        button1.addActionListener(this);                
        button2.addActionListener(this);                
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);

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

    private void buttonAction(JButton button, String buttonText) {
        switch (lastSymbol) {
            
            case "":
                buttonText = "X";
                button.setText(buttonText);
                lastSymbol = buttonText;

            case "X":
                switch (buttonText) {
                    case "":
                        buttonText = "O";
                        button.setText(buttonText);
                        lastSymbol = buttonText;
                }

            case "O":
                switch (buttonText) {
                    case "":
                        buttonText = "X";
                        button.setText(buttonText);
                        lastSymbol = buttonText;
            }
        }

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == button1) {
            buttonAction(button1, button1Text);
        } else if (e.getSource() == button2) {
            buttonAction(button2, button2Text);                        
        } else if (e.getSource() == button3) {
            buttonAction(button3, button3Text);            
        } else if (e.getSource() == button4) {
            buttonAction(button4, button4Text);            
        } else if (e.getSource() == button5) {
            buttonAction(button5, button5Text);            
        } else if (e.getSource() == button6) {
            buttonAction(button6, button6Text);            
        } else if (e.getSource() == button7) {
            buttonAction(button7, button7Text);            
        } else if (e.getSource() == button8) {
            buttonAction(button8, button8Text);            
        } else if (e.getSource() == button9) {
            buttonAction(button9, button9Text);            
        }

        // switch (source) {
        //     case "button1": buttonAction(button1, button1Text);
        //     case "button2": buttonAction(button2, button2Text);
        //     case "button3": buttonAction(button3, button3Text);
        //     case "button4": buttonAction(button4, button4Text);
        //     case "button5": buttonAction(button5, button5Text);
        //     case "button6": buttonAction(button6, button6Text);
        //     case "button7": buttonAction(button7, button7Text);
        //     case "button8": buttonAction(button8, button8Text);
        //     case "button9": buttonAction(button9, button9Text);
        // }
    }
}
