import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JPanel panel = new JPanel();
        panel.setSize(50,50);
        panel.setLocation(50,50);
        panel.setBackground(Color.CYAN);
        JButton button = new JButton("Button");
        button.setSize(100,100);
        button.setLocation(50,100);
        jFrame.add(panel);
        jFrame.add(button);

        JPopupMenu popupMenu = new JPopupMenu();
        JMenu jMenu1 = new JMenu("Jbutton");
        JMenu jMenu2 = new JMenu("View");
        JMenuItem jMenuItem = new JMenuItem("Exit      F10");
        jMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jFrame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F10) {
                    System.exit(0);
                }
            }
        });
        jFrame.setFocusable(true);
        JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Enabled");
        jCheckBoxMenuItem.setSelected(true);
        jCheckBoxMenuItem.addActionListener(e -> {
            boolean enabled = jCheckBoxMenuItem.isSelected();
            button.setEnabled(enabled);
        });
        jCheckBoxMenuItem.setSelected(true);
        JMenu jMenu3 = new JMenu("Panel.color");
        JMenuItem jMenuItem1 = new JMenuItem("JPanel.Caption = 'Panel'",Font.BOLD);
        jMenuItem1.addActionListener(e -> {
            panel.setBorder(BorderFactory.createTitledBorder("Panel"));
        });
        JRadioButtonMenuItem jRadioButtonMenuItem1 = new JRadioButtonMenuItem("clBtnFace");
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.addActionListener(e -> {
            panel.setBackground(Color.CYAN);
        });
        JRadioButtonMenuItem jRadioButtonMenuItem2 = new JRadioButtonMenuItem("clRed");
        jRadioButtonMenuItem2.addActionListener(e -> {
            panel.setBackground(Color.RED);
        });
        JRadioButtonMenuItem jRadioButtonMenuItem3 = new JRadioButtonMenuItem("clBlue");
        jRadioButtonMenuItem3.addActionListener(e -> {
            panel.setBackground(Color.BLUE);
        });
        JRadioButtonMenuItem jRadioButtonMenuItem4 = new JRadioButtonMenuItem("clYellow");
        jRadioButtonMenuItem4.addActionListener(e -> {
            panel.setBackground(Color.YELLOW);
        });


        JPanel emptyPanel1 = new JPanel();
        emptyPanel1.setPreferredSize(new Dimension(0, 50));
        JPanel emptyPanel2 = new JPanel();
        emptyPanel2.setPreferredSize(new Dimension(0, 60));
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButtonMenuItem1);
        buttonGroup.add(jRadioButtonMenuItem2);
        buttonGroup.add(jRadioButtonMenuItem3);
        buttonGroup.add(jRadioButtonMenuItem4);

        jMenu1.add(jCheckBoxMenuItem);
        jMenu3.add(jRadioButtonMenuItem1);
        jMenu3.add(jRadioButtonMenuItem2);
        jMenu3.add(jRadioButtonMenuItem3);
        jMenu3.add(jRadioButtonMenuItem4);
        jMenu2.add(jMenu3);
        jMenu2.add(emptyPanel2);
        jMenu2.add(jMenuItem1);

        popupMenu.add(jMenu1);
        popupMenu.add(jMenu2);
        popupMenu.add(emptyPanel1);
        popupMenu.addSeparator();
        popupMenu.add(jMenuItem);
        panel.setComponentPopupMenu(popupMenu);
        button.setComponentPopupMenu(popupMenu);
        jFrame.getContentPane().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        jFrame.getContentPane().add(panel);
        jFrame.getContentPane().add(button);
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