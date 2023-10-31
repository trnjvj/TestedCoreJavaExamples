import java.util.*;
import java.io.*;

public class ShowWeather {
    public static void main(String args[])
    {		
		try {
		RandomAccessFile ifile = new RandomAccessFile("Weather.csv", "r");
		String line;
		while ((line = ifile.readLine()) != null) {			
				System.out.println(line);
				String[] stringarray = line.split(";"); 				
				String mCountry = stringarray[0];
				String mState = stringarray[1];
				String mCity = stringarray[2];				
				int mYear = Integer.parseInt(stringarray[3]);
				int mMonth = Integer.parseInt(stringarray[4]);
				int mDay = Integer.parseInt(stringarray[5]);
				int mHighTemperature = Integer.parseInt(stringarray[6]);
				int mLowTemperature = Integer.parseInt(stringarray[7]);				
				System.out.println("COUNTRY=" + mCountry + "|STATE=" + mState + "|CITY" + mCity);
				System.out.println("YEAR=" + mYear + "|MONTH=" + mMonth + "|DAY=" + mDay);
			}
			ifile.close(); 	 
		} 		
		catch (IOException e) { 	
			System.err.println(e); 	 
			return; 	
		} 
    }
}
