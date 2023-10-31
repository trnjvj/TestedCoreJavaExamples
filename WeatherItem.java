import java.awt.*;
import javax.swing.*;

public class WeatherItem extends JLabel { 
   private static ImageIcon weatherImages[], backgroundImage;
   private final static String weatherConditions[] =
      { "SUNNY", "PTCLDY", "CLOUDY", "MOCLDY", "TSTRMS",
        "RAIN", "SNOW", "VRYHOT", "FAIR", "RNSNOW",
        "SHWRS", "WINDY", "NOINFO", "MISG" };
   private final static String weatherImageNames[] =
      { "sunny", "pcloudy", "mcloudy", "mcloudy", "rain",
        "rain", "snow", "vryhot", "fair", "rnsnow",
        "showers", "windy", "noinfo", "noinfo" };
   static {
      backgroundImage = new ImageIcon( "images/back.jpg" );
      weatherImages =
         new ImageIcon[ weatherImageNames.length ];

      for ( int i = 0; i < weatherImageNames.length; ++i )
         weatherImages[ i ] = new ImageIcon( 
            "images/" + weatherImageNames[ i ] + ".jpg" );
   }
   private ImageIcon weather;
   private WeatherInfo weatherInfo;
   public WeatherItem( WeatherInfo w )
   {
      weather = null;
      weatherInfo = w;
	  for ( int i = 0; i < weatherConditions.length; ++i )  
         if ( weatherConditions[ i ].equals(
              weatherInfo.getDescription().trim() ) ) {
            weather = weatherImages[ i ];
            break;
         }
      if ( weather == null ) {  
         weather = weatherImages[ weatherImages.length - 1 ];
         System.err.println( "No info for: " +
                             weatherInfo.getDescription() );
      }
   }
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );
      backgroundImage.paintIcon( this, g, 0, 0 );
      Font f = new Font( "SansSerif", Font.BOLD, 12 );
      g.setFont( f );
      g.setColor( Color.white );
      g.drawString( weatherInfo.getCityName(), 10, 19 );
      g.drawString( weatherInfo.getTemperature(), 130, 19 );
      weather.paintIcon( this, g, 253, 1 );
   }
   public Dimension getPreferredSize()
   {
      return new Dimension( backgroundImage.getIconWidth(),
                            backgroundImage.getIconHeight() );
   }
}
