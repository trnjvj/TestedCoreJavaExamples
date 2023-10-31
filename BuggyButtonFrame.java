import java.awt.*;
import javax.swing.*;

public class BuggyButtonFrame extends JFrame
{
   public BuggyButtonFrame()
   {
      setTitle("BuggyButtonTest");
      setSize(WIDTH, HEIGHT);
      BuggyButtonPanel panel = new BuggyButtonPanel();
      Container contentPane = getContentPane();
      contentPane.add(panel);
   }
   public static final int WIDTH = 300;
   public static final int HEIGHT = 200;  
}
