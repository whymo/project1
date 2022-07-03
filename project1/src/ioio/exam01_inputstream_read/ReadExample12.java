//2022.03.30

package ioio.exam01_inputstream_read;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import lombok.Cleanup;


public class ReadExample12 {

//	#3
	public static void main(String[] args)  {
		
		try {
			@Cleanup
			InputStream is = new FileInputStream("C:/Temp/TTT.txt");
					
			while(true) {	
				int readByte = is.read();	
							
				if(readByte == -1) {	
					break;				
				}// if
					
				System.out.println((char)readByte);
			} // while
			
		} catch(IOException e) {
			e.printStackTrace(); 
		} // try-catch

	} // main

} // end class
