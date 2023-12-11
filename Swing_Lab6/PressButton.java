import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Form2 extends JFrame{
    JLabel display;
    public Form2(){
        setTitle("Emotion Asker");
        setSize(300,500);
        setLayout(null);

        display = new JLabel("Action Appears here");
        display.setBounds(80,50,200,50);
        add(display);

        JButton b1 = new JButton("Happy");
        b1.setBounds(20,100,100,50);
        b1.addActionListener(new Clicked());
        add(b1);

        JButton b2 = new JButton("Sad");
        b2.setBounds(140,100,100,50);
        b2.addActionListener(new Clicked());
        add(b2);

        JButton b3 = new JButton("Excited");
        b3.setBounds(20,200,100,50);
        b3.addActionListener(new Clicked());
        add(b3);

        JButton b4 = new JButton("Angry");
        b4.setBounds(140,200,100,50);
        b4.addActionListener((ActionListener) new Clicked());
        add(b4);
    }
    private class Clicked implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String text = button.getText();

            display.setText("You are "+text);
        }
        
    }
}

public class PressButton {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            Form2 form = new Form2();
            form.setVisible(true);
        });
    }
}
