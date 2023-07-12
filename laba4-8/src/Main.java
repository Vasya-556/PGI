import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JSpinner jSpinner = new JSpinner();
        jSpinner.setSize(100,40);
        jSpinner.setLocation(200,200);

        JButton jButton = new JButton();
        jButton.setText("Click me!");
        jButton.setSize(100,40);
        jButton.setLocation(200,250);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = (int) jSpinner.getValue();
                int result = value * 2;
                jFrame.setTitle(String.valueOf(result));
            }
        });

        jFrame.add(jSpinner);
        jFrame.add(jButton);
        jFrame.setVisible(true);
    }
    private static JFrame getFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("laba-4");
        jFrame.setVisible(true);
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        return jFrame;
    }
}