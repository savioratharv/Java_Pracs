import java.awt.*;
import java.awt.event.*;
import java.awt.GridLayout;

import javax.swing.*;

class Calc extends JFrame{
    JTextField display;
    public Calc(){
        setSize(300,400);
        setLayout(new BorderLayout());
        
        display=new JTextField();
        display.setFont(new Font("Roboto", Font.BOLD, 32));
        add(display, BorderLayout.NORTH);

        JPanel jp = new JPanel(new GridLayout(4,4));

        String[] buttonList={
            "7","8","9","+",
            "4","5","6","-",
            "1","2","3","*",
            "0","/","C","="
        };

        for(String buttonLabel:buttonList){
            JButton button = new JButton(buttonLabel);
            button.addActionListener(new Clicked());
            jp.add(button);
        }

        add(jp,BorderLayout.CENTER);

    }

    private class Clicked implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String pressed = button.getText();
            if(pressed.equals("=")){
                display.setText(calculate());
            }
            else if(pressed.equals("C")){
                display.setText("");
            }
            else{
                String currentDisplay = display.getText();
                display.setText(currentDisplay+pressed);
            }
        }

        public String calculate(){
            String cd = display.getText();
            String answer = "";
            if(cd.matches("\\d+\\+\\d+")){
                String[] nums = cd.split("\\+");
                answer = String.valueOf(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]));
            }
            else if(cd.matches("\\d+\\-\\d+")){
                String[] nums = cd.split("\\-");
                answer = String.valueOf(Integer.parseInt(nums[0]) - Integer.parseInt(nums[1]));
            }
            else if(cd.matches("\\d+\\*\\d+")){
                String[] nums = cd.split("\\*");
                answer = String.valueOf(Integer.parseInt(nums[0]) * Integer.parseInt(nums[1]));
            }
            else if(cd.matches("\\d+\\/\\d+")){
                String[] nums = cd.split("\\/");
                answer = String.valueOf(Double.parseDouble(nums[0]) / Double.parseDouble(nums[1]));
            }
            return answer;
        }
    }
}


public class Calculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            Calc calc = new Calc();
            calc.setVisible(true);
        });
    }
}
