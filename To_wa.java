package WA;

import javax.swing.*;
import java.awt.*;

public class To_wa {


    public static ImageIcon resize(ImageIcon icon, int w, int h) {
        Image img = icon.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }

    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("us.png");
        image = resize(image, 250, 500); 

        JLabel label = new JLabel();
        label.setText("For my baby ❤️");
        label.setIcon(image);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        label.setForeground(Color.white);
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
        label.setBackground(Color.PINK);
        label.setOpaque(true);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.add(label);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        

        
        
    }
}
