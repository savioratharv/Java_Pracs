import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Form1 extends JFrame{
    public Form1(){
        getContentPane().setBackground(Color.MAGENTA);
        setLayout(null);
        setSize(600,500);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(10,20,150,30);
        add(name);
        JTextField name1 = new JTextField();
        name1.setBounds(150,20,200,30);
        add(name1);

        JLabel addr = new JLabel("Enter your address");
        addr.setBounds(10,80,150,30);
        add(addr);
        JTextField addr1 = new JTextField();
        addr1.setBounds(150,80,200,30);
        add(addr1);

        JLabel occu = new JLabel("Enter your occupation");
        occu.setBounds(10,140,150,30);
        add(occu);
        JTextField occu1 = new JTextField();
        occu1.setBounds(150,140,200,30);
        add(occu1);
        add(occu1);

        JButton submit = new JButton("Submit");
        submit.addActionListener(e->{
            String ename = name1.getText();
            String eaddr = addr1.getText();
            String eoccu = occu1.getText();

            name1.setText(ename);
            name1.setFont(new Font("Arial", Font.ITALIC, 32));

            addr1.setText(eaddr);
            addr1.setFont(new Font("Arial", Font.ITALIC, 32));

            occu1.setText(eoccu);
            occu1.setFont(new Font("Arial", Font.ITALIC, 32));
            
        });
        submit.setBounds(200,200,100,100);
        add(submit);

        
    }   
}


public class FontChange {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Form1 form = new Form1();
            form.setVisible(true);
        }
        );
    }
}
