import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button1 = new JButton("New Window");

    LaunchPage() {
        // setBounds(first two are the physical coordinates, second two are the side lengths.)
        button1.setBounds(145, 160, 200, 40);
        button1.setFocusable(false);
        button1.addActionListener(this);

        frame.add(button1);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new LaunchPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            NewWindow window2 = new NewWindow();
        }
    }
}

