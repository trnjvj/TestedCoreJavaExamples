import java.util.*;
import java.io.*;

public class LoadData {
    public static void main(String args[])
    {		
		try {
		RandomAccessFile ifile = new RandomAccessFile("Weather.csv", "r");
		RandomAccessFile ofile = new RandomAccessFile("output.txt", "rw");
		ofile.seek(ofile.length());
		String line;
		while ((line = ifile.readLine()) != null) {		
				System.out.println(line);
		 		ofile.writeBytes(line); 
				ofile.writeByte('\n');
			}
			ifile.close(); 	 
			ofile.close();
		} 		
		catch (IOException e) { 	
			System.err.println(e); 	 
			return; 	
		} 
    }
}
