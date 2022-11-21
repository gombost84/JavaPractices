import javax.swing.JButton;

public class TicTacToeButtons {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    TicTacToeButtons() {   
    this.button1 = new JButton();
    this.button1.setName("button1");
    this.button2 = new JButton();
    this.button2.setName("button2");
    this.button3 = new JButton();
    this.button3.setName("button3");
    this.button4 = new JButton();
    this.button4.setName("button4");
    this.button5 = new JButton();
    this.button5.setName("button5");
    this.button6 = new JButton();
    this.button6.setName("button6");
    this.button7 = new JButton();
    this.button7.setName("button7");
    this.button8 = new JButton();
    this.button8.setName("button8");
    this.button9 = new JButton();
    this.button9.setName("button9");
    }
    
    public JButton[] getButtons() {

        JButton[] array = {
            this.button1,
            this.button2,
            this.button3,
            this.button4,
            this.button5,
            this.button6,
            this.button7,
            this.button8,
            this.button9
        };

        return array;

    }
}
