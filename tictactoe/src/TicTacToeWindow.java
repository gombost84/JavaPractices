import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class TicTacToeWindow implements ActionListener {
        private final String name = "Tic Tac Toe";
        private final int windowWidth = 600;
        private final int windowHeight = 800;   

                
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

        private TicTacToeButtons buttons = new TicTacToeButtons();
        private JButton[] buttonList = buttons.getButtons();

        private TicTacToeMenuBar menu = new TicTacToeMenuBar(windowWidth);
        private JMenuBar menuBar = menu.getMenu();
        private int menuHeight = menu.getMenuHeight();

        private TicTacToeFrame frame = new TicTacToeFrame(windowWidth, windowHeight - menuHeight, name);
        private JFrame windowFrame = frame.getFrame(); 

        TicTacToeWindow() {

            windowFrame.setJMenuBar(menuBar);

            for (JButton button : buttonList) {
                windowFrame.add(button);
            }
    
            for (JButton button : buttonList) {
                button.addActionListener(this);
            }        
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
