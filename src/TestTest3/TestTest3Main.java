package TestTest3;



import k_test3.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TestTest3Main extends JFrame {

    JButton button1=new JButton("кнопка 1");
    JButton button2=new JButton("кнопка 2");

    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();

    JLabel label1=new JLabel(" тест №3.1");
    JLabel label2=new JLabel(" тест №3.2");
    JLabel label3=new JLabel(" тест №3.3");

    JTextField testField1=new JTextField("тест ввода 1");
    JTextField testField2=new JTextField("тест ввода 2");
    JTextField testField3=new JTextField("тест ввода 3");

    Person pers;



    public TestTest3Main(String nameTest3, int x,int y){
        setTitle(nameTest3);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel2.setLayout(new GridLayout(3,2));
        panel2.add(label3,0,0);
        panel2.add(testField3,0,1);

        panel2.add(label2,1,0);
        panel2.add(testField2,1,1);

        panel2.add(label1,2,0);
        panel2.add(testField1,2,1);

        panel1.add(button1);
        panel1.add(button2);
        add(panel1,BorderLayout.SOUTH);
        add(panel2,BorderLayout.CENTER);
        pack();
        setSize(x,y);

        actoins();
    }
    private void actoins(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login = testField1.getText();
                String passowrd = testField2.getText();
                int age = Integer.parseInt(testField3.getText());
                pers = new Person(login,passowrd,age);
                JOptionPane.showMessageDialog(null,"Персона "+pers+" Зареган");
                            }
        });
    }



    public static void main(String[] args) {
        new TestTest3Main("test",300,160).setVisible(true);
    }
}
