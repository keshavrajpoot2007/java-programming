import java.awt.event.*;
import javax.swing.*;

public class SwingButton {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");
        frame.setSize(400, 300);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");
        button.setBounds(150, 100, 100, 40); // x, y, width, height

        // Add action listener for button click
        button.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent hgf) {
                    
                    JOptionPane.showMessageDialog(frame, "Button Clicked!");
                }
            }
        );

        frame.setLayout(null); // No default layout, use manual positioning
        frame.add(button);
        frame.setVisible(true);
    }
}
