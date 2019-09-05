//082919 AaDeCa

import javax.swing.*;
import java.awt.*;

public class Panes
{
  public static void main(String[] args)
  {
    JFrame theGUI = new JFrame();
    JPanel p = new JPanel();
    JTextPane t = new JTextPane();
    Color backG = Color.pink;
    JButton button = new JButton("Press me!");

    theGUI.setTitle("I love cristina uwu");
    theGUI.setSize(300, 200);
    theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    t.setText("Hewwo");
    p.setBackground(backG);
    p.add(t);
    p.add(button);
    theGUI.setContentPane(p);
//    theGUI.setContentPane(t);

    theGUI.setVisible(true);


  }
}
