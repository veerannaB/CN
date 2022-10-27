package week12;
import java.io.*;
import java.net.*;

public class Decryption
{ 
	public static void main(String args[])
	 { 
		 try
		 {  
			 System.out.println("============= DECRYPTION ============");
			 ServerSocket ss = new ServerSocket(3000);
			 System.out.println("Waiting for connection");
			 Socket con = ss.accept();
			 ObjectInputStream in = new ObjectInputStream(con.getInputStream());
			 String hex = in.readObject().toString(); 
			 System.out.println("Received hex code is : " + hex);

			 StringBuilder sb = new StringBuilder();
			 for(int i = 0; i<hex.length()-1;i+=2)
			{ 
				String output = hex.substring(i,i+2);
				int decimal = Integer.parseInt(output,16);
				sb.append((char)decimal);
			} 
			System.out.println("Decrypted message : " + hex);

				 in.close();
				 ss.close();
			 } 
			 catch(Exception e)
			 { 
				 System.out.println("error:"+e);
			 }  
		 } 
}