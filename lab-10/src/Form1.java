import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form1 {

    public static void main(String[] args){
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        JPanel checkBoxPanel = new JPanel();
        jPanel.add(checkBoxPanel);

        JCheckBox checkBox1 = new JCheckBox("Button not available");
        JCheckBox checkBox2 = new JCheckBox("Panel visible");

        checkBoxPanel.add(checkBox1);
        checkBoxPanel.add(checkBox2);

        JPanel radioButtonPanel = new JPanel();
        jPanel.add(radioButtonPanel);

        ButtonGroup buttonGroup = new ButtonGroup();

        JRadioButton radioButton1 = new JRadioButton("Standard");
        JRadioButton radioButton2 = new JRadioButton("Red");
        JRadioButton radioButton3 = new JRadioButton("Yellow");

        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        radioButtonPanel.add(radioButton1);
        radioButtonPanel.add(radioButton2);
        radioButtonPanel.add(radioButton3);

        JButton button = new JButton("Click me!");
        jPanel.add(button);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 100));
        jPanel.add(panel);

        checkBox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    button.setEnabled(false);
                } else {
                    button.setEnabled(true);
                }
            }
        });

        checkBox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    panel.setVisible(true);
                } else {
                    panel.setVisible(false);
                }
            }
        });

        ActionListener radioListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioButton1.isSelected()) {
                    panel.setBackground(Color.decode("#eeeeee"));
                } else if (radioButton2.isSelected()) {
                    panel.setBackground(Color.red);
                } else if (radioButton3.isSelected()) {
                    panel.setBackground(Color.yellow);
                }
            }
        };

        radioButton1.addActionListener(radioListener);
        radioButton2.addActionListener(radioListener);
        radioButton3.addActionListener(radioListener);
        checkBox2.setSelected(true);
        radioButton1.setSelected(true);

    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setTitle("Hello");
        jFrame.setSize(300, 200);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        return jFrame;
    }


}
