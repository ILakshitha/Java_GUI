import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class Myframe extends JFrame{
  Myframe(){
      JLabel lebal = new JLabel();
      lebal.setText("Ishan Hello World");
      lebal.setHorizontalAlignment(JLabel.CENTER);
      lebal.setVerticalAlignment(JLabel.TOP);
      lebal.setForeground(Color.RED);

      this.add(lebal);
  }
}

class Main{
    public static void main(String[] args) {

        Border border = BorderFactory.createLineBorder(Color.RED);

        Myframe frame = new Myframe();

        JLabel lebal = new JLabel();
        //lebal.setText("Hello World");
        lebal.setBorder(border);

        frame.setTitle("My First Java GUI");
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



        frame.add(lebal);


    }
}