// package Swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Swing_04_JRadioButton_JCheckBox extends JFrame{
    JLabel l= new JLabel();
    JLabel l1= new JLabel();
    JTextField tf= new JTextField("name", 20);
    JRadioButton rb1= new JRadioButton("BCA");
    JRadioButton rb2= new JRadioButton("B.Tech-CSE");
    JRadioButton rb3= new JRadioButton("BS-IT");
    JCheckBox cb1= new JCheckBox("C-Programming");
    JCheckBox cb2= new JCheckBox("Java-Programming");
    JCheckBox cb3= new JCheckBox("Python-Programming");
    ButtonGroup bg= new ButtonGroup();
    ButtonGroup bgc= new ButtonGroup();

    JButton b= new JButton("SUBMIT");

    Swing_04_JRadioButton_JCheckBox(){
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(new Rectangle(10, 20, 800, 200));

        JLabel li = new JLabel();
        l1.setFont(new Font("Algerian", Font.CENTER_BASELINE, 15));

        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        /**
         * Event Handling on RadioButton
         */
        rb1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                li.setText("BCA = Bachelor's of Computer Applications");
            }
        });
        rb2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                li.setText("B.Tech-CSE = Bachelor's of Technology-Computer Science Engineering");
            }
        });
        rb3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                li.setText("BS-IT = Bachelor's of Science-Information Technology");
            }
        });


        // bgc.add(cb1);
        // bgc.add(cb2);
        // bgc.add(cb3);

        /**
         * Event Handling on CheckBox
         */
        cb1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
                li.setText("C-Programming is taught by Harry Bhai");
            }
        });
        cb2.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
                li.setText("Java-Programming is taught by Sujhata Ma'am");
            }
        });
        cb3.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
                li.setText("Python-Programming is taught by Chetan Sir");
            }
        });



        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String name= tf.getText();
                String labelValue= name;
                l.setFont(new Font("Times New Roman", Font.ITALIC, 24));
                if(rb1.isSelected()) labelValue+= " is student of BCA.";
                if(rb2.isSelected()) labelValue+= " is student of B.Tech-CSE.";
                if(rb3.isSelected()) labelValue+= " is student of BS-IT.";
                l.setText(labelValue);
                
                
                String label1Value= "Favourite Languages: ";
                l1.setFont(new Font("Times New Roman", Font.BOLD, 20));
                if(cb1.isSelected()) label1Value+= " C-Programming";
                if(cb2.isSelected()) label1Value+= " Java-Programming";
                if(cb3.isSelected()) label1Value+= " Python-Programming";
                l1.setText(label1Value);
            }
        });        
        

        add(tf);
        add(rb1);
        add(rb2);
        add(rb3);
        add(cb1);
        add(cb2);
        add(cb3);
        add(b);
        add(l);
        add(l1);
        add(li);
    }

    public static void main(String[] args) {
        new Swing_04_JRadioButton_JCheckBox();
    }
}
