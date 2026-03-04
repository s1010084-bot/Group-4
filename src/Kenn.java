import javax.swing.*;
import java.awt.*;

private class Kenn extends JFrame {
    private JButton savebutton;
    private JTextField nameField, ageField, statusField;
    public Kenn() {
        setTitle("Person status");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        addComponent(0,0,1, new JLabel("Enter full name: "));
        nameField = new JTextField();
        addComponent(1,0,1,nameField);

        addComponent(0,1,1,new JLabel("Enter your age: "));
        ageField = new JTextField();
        addComponent(1,1,1,ageField);

        addComponent(0,2,1,new JLabel("Enter your status: "));
        statusField = new JTextField();
        addComponent(1,2,1,statusField);

        savebutton = new JButton("SAVE");
        addComponent(2,3,2,savebutton);

        setLocation(400,400);
        pack();
        setVisible(true);

    }
    private void addComponent(int x, int y, int w, Component c){
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.insets = new Insets(5,5,5,5);
        add(c, gbc);
    }
}