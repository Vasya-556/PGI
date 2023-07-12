import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Window1 window1 = new Window1();
        Window2 window2 = new Window2();
        Window3 window3 = new Window3();
        window1.setVisible(true);
    }
}

class Window1 extends JFrame {
    public Window1() {
        setTitle("Window 1");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button2 = new JButton("Open Window 2");
        button2.addActionListener(e -> new Window2().setVisible(true));

        JButton button4 = new JButton("Open Window 4");
        button4.addActionListener(e -> new Window4().setVisible(true));

        JPanel panel = new JPanel();
        panel.add(button2);
        panel.add(button4);

        add(panel);
    }
}

class Window2 extends JFrame {
    public Window2() {
        setTitle("Window 2");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton button1 = new JButton("Open Window 1");
        button1.addActionListener(e -> new Window1().setVisible(true));

        JButton button3 = new JButton("Open Window 3");
        button3.addActionListener(e -> new Window3().setVisible(true));

        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button3);

        add(panel);
    }
}

class Window3 extends JFrame {
    public Window3() {
        setTitle("Window 3");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton button4 = new JButton("Open Window 4");
        button4.addActionListener(e -> new Window4().setVisible(true));

        JButton button2 = new JButton("Open Window 2");
        button2.addActionListener(e -> new Window2().setVisible(true));

        JPanel panel = new JPanel();
        panel.add(button4);
        panel.add(button2);

        add(panel);
    }
}
class Window4 extends JFrame {
    public Window4() {
        setTitle("Window 4");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton button1 = new JButton("Open Window 1");
        button1.addActionListener(e -> new Window1().setVisible(true));

        JButton button3 = new JButton("Open Window 3");
        button3.addActionListener(e -> new Window3().setVisible(true));

        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button3);

        add(panel);
    }
}