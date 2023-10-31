import java.awt.*;
import javax.swing.*;

class ButtonFrame extends JFrame
{
   public ButtonFrame()
   {
      setTitle("ButtonTest");
      setSize(WIDTH, HEIGHT);
      ButtonPanel panel = new ButtonPanel();
      Container contentPane = getContentPane();
      contentPane.add(panel);
   }
   public static final int WIDTH = 300;
   public static final int HEIGHT = 200;  
}
