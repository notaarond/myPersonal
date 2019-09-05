//082919 AaDeCa

import javax.swing.*;
import java.awt.*;

public class Panes
{
  public static void main(String[] args)
  {
    JFrame theGUI = new JFrame();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JTextPane t = new JTextPane();
    JButton button = new JButton("Press me!");
    Container gCont = theGUI.getContentPane(); //ContentPane is a container, so set a reference to the object for ease

    theGUI.setTitle("I love cristina uwu");
    theGUI.setSize(300, 200);
    theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    p1.setBackground(Color.pink); //background color set to pink
    p2.setBackground(Color.blue); //background color set to blue


/*  Supposed to add them so that it makes a checkerboard of pink and blue
    Need to reference 4 different objects, but too lazy to do that right now
    gCont.setLayout(new GridLayout(2,2));
    gCont.add(p1);
    gCont.add(p2);
    gCont.add(p1);
    gCont.add(p2);
*/


/*
    gCont.add(p1, BorderLayout.WEST); //Layout manager for borders, set the west border to p1
    gCont.add(p2, BorderLayout.EAST); //set east border to p2
*/

/*  added text to a text pane, set JPanel "p" to color pink.
    t.setText("Hewwo");
    p.setBackground(backG);

    //added the text and a button to JPanel p.
    p.add(t);
    p.add(button);

    //set theGUI's content pane to JPanel, which contained the other components
    theGUI.setContentPane(p);
    //theGUI.setContentPane(t);
*/


    theGUI.setVisible(true);


  }
}
