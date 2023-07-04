import javax.swing.*;

public class NewWindow {
    JFrame frame2 = new JFrame();
    JButton button2 = new JButton();

    NewWindow() {
        button2.setFocusable(false);
        button2 = new JButton("Welcome to the next page");
        button2.setBounds(145, 160, 300, 40);

        frame2.add(button2);
        frame2.setSize(500, 500);
        frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame2.setVisible(true);
        frame2.setLayout(null);
    }
    public static void main(String[] args) {
        new NewWindow();
    }
}

