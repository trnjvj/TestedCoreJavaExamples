import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonPanel extends JPanel
{  
   public ButtonPanel()
   {  
      JButton yellowButton = new JButton("Yellow");
      JButton blueButton = new JButton("Blue");
      JButton redButton = new JButton("Red");
      add(yellowButton);
      add(blueButton);
      add(redButton);
      ColorAction yellowAction = new ColorAction(Color.yellow);
      ColorAction blueAction = new ColorAction(Color.blue);
      ColorAction redAction = new ColorAction(Color.red);
      yellowButton.addActionListener(yellowAction);
      blueButton.addActionListener(blueAction);
      redButton.addActionListener(redAction);
   }
   private class ColorAction implements ActionListener
   {  
      public ColorAction(Color c)
      {  
         backgroundColor = c;
      }
      public void actionPerformed(ActionEvent event)
      {  
         setBackground(backgroundColor);
         repaint();
      }
      private Color backgroundColor;
   }
}
