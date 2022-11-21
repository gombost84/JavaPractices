import java.awt.GridLayout;
import javax.swing.JFrame;
import java.awt.Dimension;

public class TicTacToeFrame {
    private JFrame frame;
    private GridLayout grid;

    TicTacToeFrame(int width, int height, String name) {

        this.frame = new JFrame(name);
        this.grid = new GridLayout(3, 3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(grid);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return this.frame;
    }
}
