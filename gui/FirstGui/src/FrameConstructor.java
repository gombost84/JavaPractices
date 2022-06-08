import java.awt.BorderLayout;
import javax.swing.*;

class FrameConstructor {

    private int frameWidth = 800;
    private int frameHeight = 600;

    public void Frame() {
        BuildFrame();
    }  

    private JButton Button(String text) {
        JButton button = new JButton(text);

        return button;
    }

    private JPanel Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        return panel;
    }  

    private void BuildFrame() {
        JFrame frame = new JFrame();

        JPanel panel1 = Panel();       
        JPanel panel2 = Panel();

        JButton button1 = Button("Button 1");
        JButton button2 = Button("Button 2");
        JButton button3 = Button("Button 3");
        JButton button4 = Button("Button 4");        
        JButton button5 = Button("Button 5");

        JTextArea textArea = new JTextArea(20, 20);
        

        frame.setSize(frameWidth, frameHeight);        
        frame.setLayout(new BorderLayout());
        frame.getContentPane().add(panel1, BorderLayout.PAGE_START);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);        

        panel1.add(button1, BorderLayout.PAGE_START);
        panel1.add(button2, BorderLayout.LINE_START);
        panel1.add(button3, BorderLayout.CENTER);
        panel1.add(button4, BorderLayout.LINE_END);
        panel1.add(button5, BorderLayout.PAGE_END);

        panel2.add(textArea);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
}