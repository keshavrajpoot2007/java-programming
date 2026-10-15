import javax.swing.*;

class SwingApp {

    public static void main(String[] args) {
        // Create a window (JFrame)
        JFrame frame = new JFrame("My First Swing App");
        frame.setSize(400, 300); // Width x Height
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label and add it to the frame
        JLabel label = new JLabel("Hello, Swing!", SwingConstants.CENTER);
        frame.add(label);

        frame.setVisible(true); // Show the window
    }
}
