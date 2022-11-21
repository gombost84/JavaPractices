import javax.swing.JMenuBar;
import java.awt.Dimension;
import java.awt.Color;

public class TicTacToeMenuBar {

    private final Color menuColor = new Color(154, 165, 127);
    private final int menuHeight = 20;
    private JMenuBar menu;

    TicTacToeMenuBar(int width) {
        this.menu = new JMenuBar();
        menu.setPreferredSize(new Dimension(width, this.menuHeight));
        menu.setBackground(menuColor);
    }

    public int getMenuHeight() {
        return this.menuHeight;
    }

    public JMenuBar getMenu() {
        return this.menu;
    }
}
