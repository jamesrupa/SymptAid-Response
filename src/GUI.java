package src;

import javax.swing.*;
import javax.xml.ws.Response;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUI extends JFrame implements ActionListener, KeyListener {

    public JFrame frame;
    public JPanel panel;
    public JButton button;
    public JLabel label;
    public JLabel logo1;
    public JTextField textField;
    public JLabel name;
    public static String input;
    public static String answer;
    public static String response;
    private Object KeyStrokes;

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
        textField.addKeyListener(this);

        //ImageIcon logo = new ImageIcon("img/firstaidedit.png");
        //logo1 = new JLabel(logo);

        // IMPLEMENTS
        panel.add(name);
        //panel.add(logo1);
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

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            button.doClick();
            Response();
        }
    }

    public void keyReleased(KeyEvent e) {
    }

    public void Response(){
        input = textField.getText();
        if (input == "bad"){
            JOptionPane.showMessageDialog(null, "Seek Medical Attention");
        }
    }

}