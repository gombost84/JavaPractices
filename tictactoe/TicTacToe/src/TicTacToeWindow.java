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
        private String[] buttonValues = {
            "", // value at index 0 is the last used symbol
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
        };
        private JButton[] buttonList = TicTacToeButtons();

        TicTacToeWindow() {
        
        GameWindow(TicTacToeFrame(windowWidth, windowHeight - menuHeight, name), TicTacToeMenuBar(windowWidth, menuHeight));
        
    }    

    private JFrame GameWindow(JFrame frame, JMenuBar menu) {
        
        frame.setJMenuBar(menu);

        for (JButton jButton : buttonList) {
            frame.add(jButton);
        }

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

    private JButton[] TicTacToeButtons() {
        
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        JButton button5 = new JButton();
        JButton button6 = new JButton();
        JButton button7 = new JButton();
        JButton button8 = new JButton();
        JButton button9 = new JButton();
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);

        JButton[] array = {
            button1,
            button2,
            button3,
            button4,
            button5,
            button6,
            button7,
            button8,
            button9
        };

        return array;
    }

    private void buttonAction(JButton button, int index, String[] array) {
        switch (array[0]) {
            
            case "":
                array[index] = "X";
                button.setText(array[index]);
                array[0] = array[index];

            case "X":
                switch (array[index]) {
                    case "":
                        array[index] = "O";
                        button.setText(array[index]);
                        array[0] = array[index];
                }

            case "O":
                switch (array[index]) {
                    case "":
                        array[index] = "X";
                        button.setText(array[index]);
                        array[0] = array[index];
            }
        }

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == buttonList[0]) {
            buttonAction(buttonList[0], 1, buttonValues);
        } else if (e.getSource() == buttonList[1]) {
            buttonAction(buttonList[1], 2, buttonValues);                        
        } else if (e.getSource() == buttonList[2]) {
            buttonAction(buttonList[2], 3, buttonValues);            
        } else if (e.getSource() == buttonList[3]) {
            buttonAction(buttonList[3], 4, buttonValues);            
        } else if (e.getSource() == buttonList[4]) {
            buttonAction(buttonList[4], 5, buttonValues);            
        } else if (e.getSource() == buttonList[5]) {
            buttonAction(buttonList[5], 6, buttonValues);            
        } else if (e.getSource() == buttonList[6]) {
            buttonAction(buttonList[6], 7, buttonValues);            
        } else if (e.getSource() == buttonList[7]) {
            buttonAction(buttonList[7], 8, buttonValues);            
        } else if (e.getSource() == buttonList[8]) {
            buttonAction(buttonList[8], 9, buttonValues);            
        }
    }
}
