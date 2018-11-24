package TestTest3;

import javax.swing.*;

public class TestTest3Main extends JFrame {

    public TestTest3Main(String nameTest3, int x,int y){
        setTitle(nameTest3);
        setSize(x,y);

    }



    public static void main(String[] args) {
        new TestTest3Main("test",400,300).setVisible(true);
    }
}
