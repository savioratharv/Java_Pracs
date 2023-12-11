import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Counting extends JFrame{
    JTextField display;
    public Counting(){
        setSize(800,100);
        setLayout(new BorderLayout());

        JLabel count = new JLabel("Count: ");
        add(count,BorderLayout.WEST);

        display = new JTextField();
        display.setText("0");
        add(display,BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(1,3));
        String[] buttons = {"Count Up","Count Down","Reset"};
        for(String bLabel: buttons){
            JButton button = new JButton(bLabel);
            button.addActionListener(new Clicked());
            buttonPanel.add(button);
        }

        add(buttonPanel,BorderLayout.EAST);
    }

    private class Clicked implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String pressed = button.getText();
            int count=0;
            String answer = "";
            int cd=Integer.parseInt(display.getText());

            if(pressed.equals("Count Up")){
                count = cd + 1;
            }
            else if(pressed.equals("Count Down")){
                count = cd - 1;
            }
            else if(pressed.equals("Reset")){
                count = 0;
            }
            answer=String.valueOf(count);
            display.setText(answer);
        }

    }
}

public class Counter {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            Counting count = new Counting();
            count.setVisible(true);
        });
    }
}
