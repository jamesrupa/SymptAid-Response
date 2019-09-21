package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener, KeyListener {

    ImageIcon logo = new ImageIcon("img/logo.png");
    Symptoms Symptoms = new Symptoms();

    public JFrame frame;
    public JPanel panel;
    public JButton button;
    public JLabel label;
    public JLabel IMG;
    public JTextField textField;
    public JLabel name;
    public static String input;

    public GUI() {

        // JAVA WINDOW
        frame = new JFrame("SymptAid Response");
        frame.setSize(900,350);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // JAVA PANEL
        panel = new JPanel();
        panel.setBackground(Color.lightGray);

        // JAVA BUTTONS
        button = new JButton("Enter");
        button.addActionListener(this);
        // JAVA LABELS
        label = new JLabel("Name of Symptom: ");
        label.setFont(new Font("Verdana",Font.BOLD,22));
        name = new JLabel("SymptAid Response");
        name.setFont(new Font("Verdana",Font.BOLD,52));

        // JAVA INPUT
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(150,25));

        ImageIcon img = new ImageIcon("img/firstaid.png");
        IMG = new JLabel(img);

        // IMPLEMENTS
        panel.add(name);
        panel.add(IMG);
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        frame.add(panel,BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            Response();
        }
    }

    public void Response(){
        input = textField.getText();
        

        // CASE 1
        if ((input.equals(""))){
            JOptionPane.showMessageDialog(null, "Hello, is anyone there...",
                    "SymptAid Response", JOptionPane.INFORMATION_MESSAGE, logo);
        }
        // CASE 2
        if (!(input.equals(""))){
            JOptionPane.showMessageDialog(null, "Medical Attention Needed:\n"
                    + Symptoms.Display(), "SymptAid Response", JOptionPane.INFORMATION_MESSAGE, logo);
        }
    }

}