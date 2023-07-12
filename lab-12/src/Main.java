import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JToolBar jToolBar = new JToolBar();
        JButton jButton = new JButton("Button");
        JPanel jPanel = new JPanel();
        ImageIcon icon1 = new ImageIcon("C:\\Users\\vkobr\\OneDrive\\Робочий стіл\\ПГІ\\Java\\Swing\\lab-12\\1.jpg");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\vkobr\\OneDrive\\Робочий стіл\\ПГІ\\Java\\Swing\\lab-12\\2.jpg");
        ImageIcon icon3 = new ImageIcon("C:\\Users\\vkobr\\OneDrive\\Робочий стіл\\ПГІ\\Java\\Swing\\lab-12\\3.jpg");
        ImageIcon icon4 = new ImageIcon("C:\\Users\\vkobr\\OneDrive\\Робочий стіл\\ПГІ\\Java\\Swing\\lab-12\\4.jpg");
        ImageIcon icon5 = new ImageIcon("C:\\Users\\vkobr\\OneDrive\\Робочий стіл\\ПГІ\\Java\\Swing\\lab-12\\5.jpg");
        ImageIcon icon6 = new ImageIcon("C:\\Users\\vkobr\\OneDrive\\Робочий стіл\\ПГІ\\Java\\Swing\\lab-12\\6.jpg");
        ImageIcon icon7 = new ImageIcon("C:\\Users\\vkobr\\OneDrive\\Робочий стіл\\ПГІ\\Java\\Swing\\lab-12\\7.jpg");
        JButton jButton1 = new JButton(icon1);
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Window window = SwingUtilities.getWindowAncestor(jButton1);
                window.dispose();
            }
        });
        jButton1.setToolTipText("закрити вікно");
        JToggleButton jToggleButton2 = new JToggleButton(icon2);
        jToggleButton2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    jButton.setEnabled(false);
                } else {
                    jButton.setEnabled(true);
                }
            }
        });
        jToggleButton2.setToolTipText("заблокувати кнопку");
        JToggleButton jToggleButton3 = new JToggleButton(icon3);
        jToggleButton3.setToolTipText("кнопка Р – доступна");
        jToggleButton3.setSelected(true);
        JButton jButton4 = new JButton(icon4);
        jToggleButton3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    jButton4.setEnabled(true);
                } else {
                    jButton4.setEnabled(false);
                }
            }
        });
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JLabel label = new JLabel("Panel");
                jPanel.add(label);
                jPanel.revalidate();
            }
        });
        jButton4.setToolTipText("напис на панелі");
        JRadioButton jRadioButton5 = new JRadioButton(icon5);
        jRadioButton5.setToolTipText("колір панелі – стандартний");
        jRadioButton5.setSelected(true);
        JRadioButton jRadioButton6 = new JRadioButton(icon6);
        jRadioButton6.setToolTipText("колір панелі – червоний");
        JRadioButton jRadioButton7 = new JRadioButton(icon7);
        jRadioButton7.setToolTipText("колір панелі – жовтий");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton5);
        buttonGroup.add(jRadioButton6);
        buttonGroup.add(jRadioButton7);

        ItemListener radioListener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == jRadioButton5 && jRadioButton5.isSelected()) {
                    jPanel.setBackground(Color.decode("#eeeeee"));
                } else if (e.getSource() == jRadioButton6 && jRadioButton6.isSelected()) {
                    jPanel.setBackground(Color.RED);
                } else if (e.getSource() == jRadioButton7 && jRadioButton7.isSelected()) {
                    jPanel.setBackground(Color.YELLOW);
                }
            }
        };

        jRadioButton5.addItemListener(radioListener);
        jRadioButton6.addItemListener(radioListener);
        jRadioButton7.addItemListener(radioListener);
        jToolBar.add(jButton1);
        jToolBar.add(jToggleButton2);
        jToolBar.add(jToggleButton3);
        jToolBar.add(jButton4);
        jToolBar.add(jRadioButton5);
        jToolBar.add(jRadioButton6);
        jToolBar.add(jRadioButton7);
        jToolBar.setSize(250,100);
        jButton.setSize(100,50);
        jButton.setLocation(0,100);
        jPanel.setSize(100,50);
        jPanel.setLocation(0,150);
        jFrame.add(jButton);
        jFrame.add(jPanel);
        jFrame.add(jToolBar);
    }
    private static JFrame getFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("1");
        jFrame.setVisible(true);
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        return jFrame;
    }
}