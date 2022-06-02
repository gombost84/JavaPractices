import javax.swing.*;

public class FrameConstructor {

    private int frameWidth;
    private int frameHeight;
    private int buttonWidth;
    private int buttonHeight;
    private int buttonX;
    private int buttonY;
    private String buttonText;  
    
    public void setFrame() {
        String width = JOptionPane.showInputDialog("Frame width: ");
        String height = JOptionPane.showInputDialog("Frame height: ");

        this.frameWidth = Integer.parseInt(width);
        this.frameHeight = Integer.parseInt(height);
    }

    public void setButton() {
        String x = JOptionPane.showInputDialog("Button x: ");
        String y = JOptionPane.showInputDialog("Button y: ");
        String width = JOptionPane.showInputDialog("Button width: ");
        String height = JOptionPane.showInputDialog("Button height: ");
        String text = JOptionPane.showInputDialog("Button text: ");

        this.buttonX = Integer.parseInt(x);
        this.buttonY = Integer.parseInt(y);
        this.buttonWidth = Integer.parseInt(width);
        this.buttonHeight = Integer.parseInt(height);
        this.buttonText = text;
    }

    public void Frame() {
        JFrame frame = new JFrame();
        JButton button = new JButton(buttonText);

        frame.setSize(frameWidth, frameHeight);
        button.setBounds(buttonX, buttonY, buttonWidth, buttonHeight);

        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
