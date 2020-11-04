package com.company;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Frame extends JFrame implements ActionListener {
    private Container container;
    private JLabel title;
    private JLabel firstName;
    private JLabel age;
    private JTextField textAge;
    private JTextField textName;
    private JLabel lastName;
    private JTextField textLast;
    private JLabel gen;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup genButton;
    private JLabel address;
    private JTextArea textAddress;
    private JCheckBox married;
    private JButton save;
    private JLabel reset;

    public Frame()

    {
        setTitle("Insert data");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        title = new JLabel("Insert your data");
        title.setFont(new Font("Colibri", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        container.add(title);

        firstName = new JLabel("First name:");
        firstName.setFont(new Font("Arial", Font.PLAIN, 20));
        firstName.setSize(200, 15);
        firstName.setLocation(80, 100);
        container.add(firstName);

        textName = new JTextField();
        textName.setFont(new Font("Arial", Font.PLAIN, 15));
        textName.setSize(300, 30);
        textName.setLocation(200, 100);
        container.add(textName);

        lastName = new JLabel("Last name:");
        lastName.setFont(new Font("Arial", Font.PLAIN, 20));
        lastName.setSize(190, 30);
        lastName.setLocation(80, 150);
        container.add(lastName);

        textLast = new JTextField();
        textLast.setFont(new Font("Arial", Font.PLAIN, 15));
        textLast.setSize(300, 30);
        textLast.setLocation(200, 150);
        container.add(textLast);

        age = new JLabel("Age:");
        age.setFont(new Font("Arial", Font.PLAIN, 20));
        age.setSize(300, 30);
        age.setLocation(80, 200);
        container.add(age);

        textAge = new JTextField();
        textAge.setFont(new Font("Arial", Font.PLAIN, 15));
        textAge.setSize(300, 30);
        textAge.setLocation(200, 200);
        container.add(textAge);

        gen = new JLabel("Gender:");
        gen.setFont(new Font("Arial", Font.PLAIN, 20));
        gen.setSize(100, 20);
        gen.setLocation(80, 250);
        container.add(gen);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 250);
        container.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 250);
        container.add(female);

        genButton = new ButtonGroup();
        genButton.add(male);
        genButton.add(female);

        married = new JCheckBox("Married?");
        married.setFont(new Font("Colibri", Font.PLAIN, 15));
        married.setSize(200, 15);
        married.setLocation(80, 290);
        container.add(married);

        address = new JLabel("Address");
        address.setFont(new Font("Arial", Font.PLAIN, 20));
        address.setSize(200, 20);
        address.setLocation(80, 330);
        container.add(address);

        textAddress = new JTextArea();
        textAddress.setFont(new Font("Arial", Font.PLAIN, 15));
        textAddress.setSize(400, 150);
        textAddress.setLocation(200, 330);
        textAddress.setLineWrap(true);
        container.add(textAddress);

        save = new JButton("Save");
        save.setFont(new Font("Arial", Font.PLAIN, 15));
        save.setSize(200, 30);
        save.setLocation(80, 500);
        save.addActionListener(this);
        container.add(save);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == save) {
            String data1;
            if (male.isSelected())
                data1 = "Gender : Male"
                        + "\n";
            else
                data1 = "Gender : Female"
                        + "\n";

            String data2;
            if (married.isSelected())
                data2 = "Married: Yes" + "\n";
            else
                data2 = "Married: No" + "\n";

            container.removeAll();
            container.revalidate();
            container.repaint();

            reset = new JLabel("First Name: " + textName.getText());
            reset.setFont(new Font("Colibri", Font.PLAIN, 20));
            reset.setSize(190, 15);
            reset.setLocation(90, 100);
            container.add(reset);

            reset = new JLabel("Last name: " + textLast.getText());
            reset.setFont(new Font("Colibri", Font.PLAIN, 20));
            reset.setSize(190, 30);
            reset.setLocation(90, 130);
            container.add(reset);

            reset = new JLabel("Age: " + textAge.getText());
            reset.setFont(new Font("Colibri", Font.PLAIN, 20));
            reset.setSize(190, 30);
            reset.setLocation(90, 160);
            container.add(reset);

            reset = new JLabel(data1);
            reset.setFont(new Font("Colibri", Font.PLAIN, 20));
            reset.setSize(190, 30);
            reset.setLocation(90, 190);
            container.add(reset);

            reset = new JLabel(data2);
            reset.setFont(new Font("Colibri", Font.PLAIN, 20));
            reset.setSize(190, 30);
            reset.setLocation(90, 230);
            container.add(reset);

            reset = new JLabel("Address: " +textAddress.getText());
            reset.setFont(new Font("Colibri", Font.PLAIN, 20));
            reset.setSize(190, 15);
            reset.setLocation(90, 300);
            container.add(reset);

            setVisible(true);
        }
    }
}
