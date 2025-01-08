
package quiz;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images/quiz icon.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600,600);
        add(image);
        
        JLabel heading=new JLabel("Train your Brain");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,32));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel name=new JLabel("Enter your name:");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        name.setForeground(Color.BLUE);
        add(name);
        
        tfname=new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        
        rules=new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(Color.blue);
        rules.setForeground(Color.white);
        rules.addActionListener(this);            //this function indicates that some action is performed or button is clicked
        add(rules);
        
        back=new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(Color.blue);
        back.setForeground(Color.white);
        back.addActionListener(this);             //also we have to define first what action has to be performed when the button gets clicked
        add(back);                                //for that we have to define actionPerformed method()
        
        setSize(1200,600);
        setLocation(350,200);
        setVisible(true);
        
    }
    
    //whenever we implement interface, first we have to implement all the abstract methods inside class which are present in the interface,
    //Therefore we are implementing actionperformed method in this class , which is by default present in AcionListener interface
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){                  //globally declare rules and back for external use
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==back){
            setVisible(false);
        }
    }
    
    
    public static void main(String[] args){
        new Login();                            //object creation without using any variable called Ananymous Object
    }
    
}
