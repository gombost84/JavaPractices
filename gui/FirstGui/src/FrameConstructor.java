import java.awt.BorderLayout;
import javax.swing.*;

public class FrameConstructor {

    private int frameWidth = 800;
    private int frameHeight = 600;

    public void Frame() {
        JFrame frame = new JFrame();

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");        
        JButton button5 = new JButton("Button 5");

        JTextArea textArea = new JTextArea(20, 20);
        

        frame.setSize(frameWidth, frameHeight);        
        frame.setLayout(new BorderLayout());
        frame.getContentPane().add(panel1, BorderLayout.PAGE_START);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);

        panel1.setLayout(new BorderLayout());

        panel1.add(button1, BorderLayout.PAGE_START);
        panel1.add(button2, BorderLayout.LINE_START);
        panel1.add(button3, BorderLayout.CENTER);
        panel1.add(button4, BorderLayout.LINE_END);
        panel1.add(button5, BorderLayout.PAGE_END);

        panel2.add(textArea);

        frame.setVisible(true);
    }
    
}
