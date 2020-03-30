package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class AddSub extends JFrame implements ActionListener {
    private JLabel fir , sec , resultl;
    private JTextField first , second , result ;
    private JButton add , sub;
    private JPanel p1 , p2 , p3;

    public AddSub (){
        super("Add/Sub program");
        //statring with labels
        fir = new JLabel("First number");
        sec = new JLabel("Second number");
        resultl = new JLabel("Result");

        //statring with textFields

        first = new JTextField(10);
        second = new JTextField(10);
        result = new JTextField(10);
        result.setEditable(false);

        add = new JButton("  Add  ");
        sub = new JButton("  Sub  ");

        p1 = new JPanel();
        p1.add(fir);
        p1.add(first);
        p1.add(sec);
        p1.add(second);
        add(p1, BorderLayout.NORTH);

        p2 = new JPanel();
        p2.add(add);
        p2.add(sub);
        add(p2 , BorderLayout.CENTER);

        p3 = new JPanel();
        p3.add(resultl);
        p3.add(result);
        add(p3 , BorderLayout.SOUTH);

        result.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);

    }//constructor

    public void actionPerformed(ActionEvent event){
        int t3 = 0;
        int te1 = Integer.parseInt(first.getText());
        int te2 = Integer.parseInt(second.getText());
        if(event.getSource() == add){
             t3 = te1 + te2;

             result.setText(t3+"");
        }
        else if(event.getSource() == sub){
            t3 = te1 - te2;
            result.setText(t3+"");
        }
        

    }
}


public class Main {

    public static void main(String[] args) {

        AddSub f1 = new AddSub();
        f1.setSize(700 , 150);
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
        f1.setVisible(true);
        f1.setResizable(false);

    }
}
