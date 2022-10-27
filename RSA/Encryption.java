package week12;
import java.io.*;
import java.net.*;
public class Encryption
{ 
	public static void main(String args[])
	{ 
		try
		{ 
			System.out.println("============ ENCRYPTION ===========");
 			Socket con = new Socket("localhost",3000);
 			ObjectOutputStream out = new ObjectOutputStream(con.getOutputStream());
			 String msg = "CNLAB";
 			 System.out.println("Message : " + msg);
 			 StringBuilder hex = new StringBuilder();

			 for(int i = 0;i<msg.length();i++)
			 { 
				hex.append(Integer.toHexString((int)msg.charAt(i)));
			  } 
 			  out.writeObject(hex);
			  System.out.println("Generated Hex code sent to server : " + hex);
 
			 out.close();
			 con.close();
			 } 
			 catch(Exception e)
			 { 
				 System.out.println("error:"+e);
			 }  
		 } 
}