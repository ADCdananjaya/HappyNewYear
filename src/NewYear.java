import java.awt.Color;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewYear extends JFrame{

    JLabel label;
    ImageIcon image2;

    public NewYear(){
        setTitle("Happy New Year!");
        setSize(655, 675);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        ImageIcon image1 = new ImageIcon("newYear2.jpg");
        image2 = new ImageIcon("newYear1.gif");
        //https://images.app.goo.gl/MKUdGCBnU7JwYS3c7
        ImageIcon image3 = new ImageIcon("sun.png");
        //https://www.flaticon.com/free-icons/sun

        setIconImage(image3.getImage());

        label = new JLabel();
        label.setIcon(image1);
        label.setBounds(0, 0, 640, 640);

        JButton button = new JButton("Animate!");
        button.setBounds(10, 585, 100, 40);
        button.setFocusable(false);
        button.setForeground(new Color(64, 42, 6));
        button.setBackground(new Color(171, 120, 39));
        button.setBorder(BorderFactory.createEtchedBorder());
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                label.setIcon(image2);
            }
        });
        label.add(button);
        
        add(label);

        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new NewYear();
    }
}
