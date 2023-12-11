import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EveOdd extends JFrame{
    JTextField output, jf;  
    public EveOdd(){
        setLayout(null);
        setSize(300,300);

        JLabel jlist = new JLabel("List");
        jlist.setBounds(10,30,100,30);
        add(jlist);

        jf = new JTextField();
        jf.setBounds(50,30,100,30);
        add(jf);
        
        output = new JTextField();
        output.setBounds(10,80,250,30);
        add(output);

        JButton even = new JButton("Even Nos");
        even.addActionListener(new Clicked());
        even.setBounds(10,120,100,30);
        add(even);

        JButton odd = new JButton("Odd Nos");
        odd.addActionListener(new Clicked());
        odd.setBounds(120,120,100,30);
        add(odd);
    }

    private class Clicked implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            JButton button = (JButton) e.getSource();
            String pressed = button.getText();
            String cd = jf.getText();
            String[] nums = cd.split("\\,");

            if(pressed.equals("Even Nos")){
                String even="";
                for(String i:nums){
                    if(Integer.parseInt(i)%2==0){
                        even=even+" "+i;
                    }
                }
                output.setText(even);
            }
            else{
                String odd="";
                for(String i:nums){
                    if(Integer.parseInt(i)%2!=0){
                        odd=odd+" "+i;
                    }
                }
                output.setText(odd);
            }
        }

    }
}

public class EvenOdd {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            EveOdd eo = new EveOdd();
            eo.setVisible(true);
        });
    }
}
