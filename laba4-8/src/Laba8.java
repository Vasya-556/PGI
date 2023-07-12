import javax.swing.*;

public class Laba8 {
    public static void main(String[] args){
        JFrame jFrame = getFrame();
        JButton button1 = new JButton("Button 1");
        button1.setLocation(50,50);
        button1.setSize(100,50);
        jFrame.add(button1);

        button1.addActionListener(e -> {
            Timer timer = new Timer(2000, event -> {
                JButton button2 = new JButton("Button 2");
                button2.setLocation(200,50);
                button2.setSize(100,50);
                button2.addActionListener(e2 -> {
                    System.exit(0);
                });
                jFrame.add(button2);
                jFrame.revalidate();
            });
            timer.setRepeats(false);
            timer.start();
        });
    }
    private static JFrame getFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("laba-8");
        jFrame.setVisible(true);
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        return jFrame;
    }
}
