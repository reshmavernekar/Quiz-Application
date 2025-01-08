
package quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton back,start;
    
    Rules(String name){
        
        this.name=name;
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading=new JLabel("Welcome "+name+" to the Train your Brain Competition!!");
        heading.setBounds(50,20,850,35);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,32));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel rules=new JLabel();
        rules.setBounds(30,40,850,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,15));
        rules.setForeground(Color.black);
        rules.setText(
                "<html>"+
                        "1.Participant must have stable internet connection.<br><br>"+
                        "2.The quiz consist of multiple-choice questions related to coding topics.<br><br>"+
                        "3.Each question has 4 options with 1 correct answer and no negative marking.<br><br>"+
                        "4.Participants have a maximum of 2 minutes to answer each question.<br><br>"+
                        "5.Each question is presented sequentially, and the next question appears immediately after submission or timeout.<br><br>"+
                        "6.Scores are displayed after completing all questions or when the quiz ends.<br><br><br>"+
                        "<b>Good Luck!!</b>"+
                "</html>");
        add(rules);
        
        back=new JButton("Back");
        back.setBounds(250,400,100,30);
        back.setBackground(Color.blue);
        back.setForeground(Color.white);
        back.addActionListener(this);             //also we have to define first what action has to be performed when the button gets clicked
        add(back);     
        
        start=new JButton("Start");
        start.setBounds(400,400,100,30);
        start.setBackground(Color.blue);
        start.setForeground(Color.white);
        start.addActionListener(this);            //this function indicates that some action is performed or button is clicked
        add(start);
              
        
        setSize(1200,500);
        setLocation(350,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
            new Game(name);
        }else{
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args){
        new Rules("User");
    }
    
}


