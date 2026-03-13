package WA;
import javax.swing.*;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener{ 
    
    JButton bt;
    JButton w = new JButton("new Window");
    Frame(){
        //label
        
        this.setTitle("❤️");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(380,220); 
        this.setLayout(new BorderLayout());
        this.setVisible(true); 
        this.getContentPane().setBackground(Color.pink);// change color of background
        //frame
        ImageIcon image = new ImageIcon("images/invincible.jpeg");
        this.setIconImage(image.getImage());//Change icon of frame
         
        
        //button
        bt = new JButton("Do u love me 🥺");
        bt.addActionListener(this);
        this.add(bt,BorderLayout.SOUTH);
        
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== bt){
            To_wa.main(null);
        }
       
    }

    
        
    
}