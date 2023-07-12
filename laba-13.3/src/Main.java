import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JButton jButton = new JButton("Click me!");
        JPanel jPanel = new JPanel();

        ImageIcon icon1 = new ImageIcon("C:\\Users\\vkobr\\OneDrive\\Робочий стіл\\ПГІ\\Java\\Swing\\lab-12\\1.jpg");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\vkobr\\OneDrive\\Робочий стіл\\ПГІ\\Java\\Swing\\lab-12\\2.jpg");
        ImageIcon icon3 = new ImageIcon("C:\\Users\\vkobr\\OneDrive\\Робочий стіл\\ПГІ\\Java\\Swing\\lab-12\\3.jpg");
        ImageIcon icon4 = new ImageIcon("C:\\Users\\vkobr\\OneDrive\\Робочий стіл\\ПГІ\\Java\\Swing\\lab-12\\4.jpg");
        ImageIcon icon5 = new ImageIcon("C:\\Users\\vkobr\\OneDrive\\Робочий стіл\\ПГІ\\Java\\Swing\\lab-12\\5.jpg");
        ImageIcon icon6 = new ImageIcon("C:\\Users\\vkobr\\OneDrive\\Робочий стіл\\ПГІ\\Java\\Swing\\lab-12\\6.jpg");
        ImageIcon icon7 = new ImageIcon("C:\\Users\\vkobr\\OneDrive\\Робочий стіл\\ПГІ\\Java\\Swing\\lab-12\\7.jpg");

        //10

        JCheckBox jCheckBox1 = new JCheckBox("Block button");
        JCheckBox jCheckBox2 = new JCheckBox("Button P enabled");
        JRadioButton jRadioButton1 = new JRadioButton("Standart");
        JRadioButton jRadioButton2 = new JRadioButton("Red");
        JRadioButton jRadioButton3 = new JRadioButton("Yellow");

        ButtonGroup buttonGroup1 = new ButtonGroup();

        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);

        //11

        JPopupMenu jPopupMenu = new JPopupMenu();
        JMenu jMenu1 = new JMenu("Jbutton");
        JMenu jMenu2 = new JMenu("View");
        JMenuItem jMenuItem = new JMenuItem("Exit      F10");

        JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem("Block button");
        JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem("Button P enabled");
        JMenu jMenu3 = new JMenu("Panel.color");
        JMenuItem jMenuItem1 = new JMenuItem("JPanel.Caption = 'Panel'",Font.BOLD);
        JRadioButtonMenuItem jRadioButtonMenuItem1 = new JRadioButtonMenuItem("Standart");
        JRadioButtonMenuItem jRadioButtonMenuItem2 = new JRadioButtonMenuItem("Red");
        JRadioButtonMenuItem jRadioButtonMenuItem3 = new JRadioButtonMenuItem("Yellow");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButtonMenuItem1);
        buttonGroup.add(jRadioButtonMenuItem2);
        buttonGroup.add(jRadioButtonMenuItem3);

        jMenu1.add(jCheckBoxMenuItem1);
        jMenu1.add(jCheckBoxMenuItem2);
        jMenu3.add(jRadioButtonMenuItem1);
        jMenu3.add(jRadioButtonMenuItem2);
        jMenu3.add(jRadioButtonMenuItem3);
        jMenu2.add(jMenu3);
        jMenu2.add(jMenuItem1);

        jPopupMenu.add(jMenu1);
        jPopupMenu.add(jMenu2);
        jPopupMenu.addSeparator();
        jPopupMenu.add(jMenuItem);
        jPanel.setComponentPopupMenu(jPopupMenu);
        jButton.setComponentPopupMenu(jPopupMenu);

        //12

        JToolBar jToolBar = new JToolBar();
        JButton jButton2 = new JButton(icon1);
        JToggleButton jToggleButton2 = new JToggleButton(icon2);
        JToggleButton jToggleButton3 = new JToggleButton(icon3);
        JButton jButton4 = new JButton(icon4);
        JRadioButton jRadioButton5 = new JRadioButton(icon5);
        JRadioButton jRadioButton6 = new JRadioButton(icon6);
        JRadioButton jRadioButton7 = new JRadioButton(icon7);
        ButtonGroup buttonGroup3 = new ButtonGroup();
        buttonGroup3.add(jRadioButton5);
        buttonGroup3.add(jRadioButton6);
        buttonGroup3.add(jRadioButton7);
        jToolBar.add(jButton2);
        jToolBar.add(jToggleButton2);
        jToolBar.add(jToggleButton3);
        jToolBar.add(jButton4);
        jToolBar.add(jRadioButton5);
        jToolBar.add(jRadioButton6);
        jToolBar.add(jRadioButton7);

        jButton2.setToolTipText("Close window");
        jToggleButton2.setToolTipText("Block button");
        jToggleButton3.setToolTipText("Button P enabled");
        jButton4.setToolTipText("Text on panel");
        jRadioButton5.setToolTipText("Standart");
        jRadioButton6.setToolTipText("Red");
        jRadioButton7.setToolTipText("Yellow");

        //----------------------------------------------------------------------------------------------------------

        jCheckBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox1.isSelected()) {
                    jButton.setEnabled(false);
                    jCheckBoxMenuItem1.setSelected(true);
                    jToggleButton2.setSelected(true);
                } else {
                    jButton.setEnabled(true);
                    jCheckBoxMenuItem1.setSelected(false);
                    jToggleButton2.setSelected(false);
                }
            }
        });
        jCheckBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox2.isSelected()) {
                    jButton4.setEnabled(true);
                    jCheckBoxMenuItem2.setSelected(true);
                    jToggleButton3.setSelected(true);
                } else {
                    jButton4.setEnabled(false);
                    jCheckBoxMenuItem2.setSelected(false);
                    jToggleButton3.setSelected(false);
                }
            }
        });
        jRadioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.decode("#eeeeee"));
                jRadioButton5.setSelected(true);
                jRadioButtonMenuItem1.setSelected(true);
            }
        });
        jRadioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.RED);
                jRadioButton5.setSelected(true);
                jRadioButtonMenuItem1.setSelected(true);
            }
        });
        jRadioButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.yellow);
                jRadioButton5.setSelected(true);
                jRadioButtonMenuItem1.setSelected(true);
            }
        });

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
        jCheckBoxMenuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (jCheckBoxMenuItem1.isSelected()) {
                    jButton.setEnabled(false);
                    jCheckBox1.setSelected(true);
                    jToggleButton2.setSelected(true);
                } else {
                    jButton.setEnabled(true);
                    jCheckBox1.setSelected(false);
                    jToggleButton2.setSelected(false);
                }
            }
        });
        jCheckBoxMenuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (jCheckBoxMenuItem2.isSelected()) {
                    jButton4.setEnabled(true);
                    jCheckBox2.setSelected(true);
                    jToggleButton3.setSelected(false);
                } else {
                    jButton4.setEnabled(false);
                    jCheckBox2.setSelected(false);
                    jToggleButton3.setSelected(true);
                }
            }
        });
        jMenuItem1.addActionListener(e -> {
            jPanel.setBorder(BorderFactory.createTitledBorder("Panel"));
        });
        jRadioButtonMenuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.WHITE);
                jRadioButton1.setSelected(true);
                jRadioButton5.setSelected(true);
            }
        });
        jRadioButtonMenuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.RED);
                jRadioButton2.setSelected(true);
                jRadioButton6.setSelected(true);
            }
        });
        jRadioButtonMenuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.YELLOW);
                jRadioButton3.setSelected(true);
                jRadioButton7.setSelected(true);
            }
        });

        jButton2.addActionListener(e -> {
            System.exit(0);
        });
        jToggleButton2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    jButton.setEnabled(false);
                    jCheckBox1.setSelected(true);
                    jCheckBoxMenuItem1.setSelected(true);
                } else {
                    jButton.setEnabled(true);
                    jCheckBox1.setSelected(false);
                    jCheckBoxMenuItem1.setSelected(false);
                }
            }
        });
        jToggleButton3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    jButton4.setEnabled(false);
                    jCheckBox2.setSelected(true);
                    jCheckBoxMenuItem2.setSelected(true);
                } else {
                    jButton4.setEnabled(true);
                    jCheckBox2.setSelected(false);
                    jCheckBoxMenuItem2.setSelected(false);
                }
            }
        });
        jButton4.addActionListener(e -> {
            jPanel.setBorder(BorderFactory.createTitledBorder("Panel"));
        });
        ItemListener radioListener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == jRadioButton5 && jRadioButton5.isSelected()) {
                    jPanel.setBackground(Color.white);
                    jRadioButton1.setSelected(true);
                    jRadioButtonMenuItem1.setSelected(true);
                } else if (e.getSource() == jRadioButton6 && jRadioButton6.isSelected()) {
                    jPanel.setBackground(Color.RED);
                    jRadioButton2.setSelected(true);
                    jRadioButtonMenuItem2.setSelected(true);
                } else if (e.getSource() == jRadioButton7 && jRadioButton7.isSelected()) {
                    jPanel.setBackground(Color.YELLOW);
                    jRadioButton3.setSelected(true);
                    jRadioButtonMenuItem3.setSelected(true);
                }

            }
        };
        jRadioButton5.addItemListener(radioListener);
        jRadioButton6.addItemListener(radioListener);
        jRadioButton7.addItemListener(radioListener);


        //----------------------------------------------------------------------------------------------------------

        jRadioButton1.setSelected(true);
        jCheckBox2.setSelected(true);
        jToggleButton3.setSelected(true);
        jCheckBoxMenuItem2.setSelected(true);
        jRadioButtonMenuItem1.setSelected(true);

        jButton.setSize(100,50);
        jButton.setLocation(50,300);
        jPanel.setSize(100,100);
        jPanel.setLocation(250,300);

        jCheckBox1.setSize(150,30);
        jCheckBox1.setLocation(50,150);
        jCheckBox2.setSize(150,30);
        jCheckBox2.setLocation(50,180);
        jRadioButton1.setSize(150,30);
        jRadioButton1.setLocation(300,130);
        jRadioButton2.setSize(150,30);
        jRadioButton2.setLocation(300,160);
        jRadioButton3.setSize(150,30);
        jRadioButton3.setLocation(300,190);

        jButton2.setSize(30,30);
        jButton2.setLocation(30,30);
        jToggleButton2.setSize(30,30);
        jToggleButton2.setLocation(60,30);
        jToggleButton3.setSize(30,30);
        jToggleButton3.setLocation(90,30);
        jButton4.setSize(30,30);
        jButton4.setLocation(120,30);
        jRadioButton5.setSize(30,30);
        jRadioButton5.setLocation(150,30);
        jRadioButton6.setSize(30,30);
        jRadioButton6.setLocation(180,30);
        jRadioButton7.setSize(30,30);
        jRadioButton7.setLocation(210,30);
        jToolBar.setSize(250,80);
        jToolBar.setLocation(50,0);

        jFrame.add(jButton);
        jFrame.add(jPanel);

        jFrame.add(jCheckBox1);
        jFrame.add(jCheckBox2);
        jFrame.add(jRadioButton1);
        jFrame.add(jRadioButton2);
        jFrame.add(jRadioButton3);

        jFrame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        jFrame.add(jToolBar);

    }
    private static JFrame getFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("13.3");
        jFrame.setVisible(true);
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        return jFrame;
    }
}