package quiz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Score extends JFrame implements ActionListener {
    
    Score(String name,int score){
        setBounds(400,150,750,550);                //method of class JFrame used for combination of both setLocation and setSize
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images/score icon.jpg"));
        Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
        
        JLabel heading=new JLabel("Thankyou "+name+" for playing Train your Brain");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.PLAIN,28));
        add(heading);
        
        JLabel lblscore=new JLabel("Your score is "+score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Mongollian Baiti",Font.PLAIN,28));
        add(lblscore);
        
        JButton submit=new JButton("Play Again");
        submit.setBounds(380,270,120,30);
        submit.setBackground(Color.blue);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args){
        new Score("User",0);
    }
}
