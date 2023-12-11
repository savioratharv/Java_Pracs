import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class Searcher extends JFrame{

    JTextField inputString, searchString, occurences, replaceWith, newString;

    public Searcher(){
        setLayout(null);
        setSize(600,500);

        JLabel inputString1=new JLabel("Enter String to search in");
        inputString1.setBounds(10,20,150,30);
        add(inputString1);
        inputString = new JTextField();
        inputString.setBounds(150,20,200,30);
        add(inputString);

        JLabel searchString1=new JLabel("Enter String to search");
        searchString1.setBounds(10,80,150,30);
        add(searchString1);
        searchString = new JTextField();
        searchString.setBounds(150,80,200,30);
        add(searchString);

        JButton occu = new JButton("Find Occurences");
        occu.setBounds(400,50,150,30);
        occu.addActionListener(new Occurence());
        add(occu);

        JLabel occurences1=new JLabel("Number of Occurences");
        occurences1.setBounds(10,140,150,30);
        add(occurences1);
        occurences = new JTextField();
        occurences.setBounds(150,140,200,30);
        add(occurences);

        JLabel replaceWith1=new JLabel("Replace With");
        replaceWith1.setBounds(10,200,150,30);
        add(replaceWith1);
        replaceWith = new JTextField();
        replaceWith.setBounds(150,200,200,30);
        add(replaceWith);

        JButton repString = new JButton("Replace");
        repString.setBounds(400,230,150,30);
        repString.addActionListener(new Replace());
        add(repString );

        JLabel newString1=new JLabel("New String");
        newString1.setBounds(10,260,150,30);
        add(newString1);
        newString = new JTextField();
        newString.setBounds(150,260,200,30);
        add(newString);

    }

    private class Occurence implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String input=inputString.getText();
            String search=searchString.getText();

            int count = 0;
            for(int i=0;i<input.length()-search.length();i++){
                String temp = input.substring(i, i+search.length());
                if(temp.contains(search)){
                    count++;
                }
            }

            occurences.setText(Integer.toString(count));
        }

    }

    private class Replace implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String rep=replaceWith.getText();
            String mainString=inputString.getText();
            String search=searchString.getText();

            String newStr=mainString.replace(search,rep);

            newString.setText(newStr);
        }
        
    }
}


public class searchForm {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            Searcher search = new Searcher();
            search.setVisible(true);
        });
    }
}
