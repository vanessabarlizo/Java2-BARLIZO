import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Prelimact01
{
	public static void main (String args []) {
	BufferedReader in = null;
try {
		in = new BufferedReader(new FileReader("C:\\Phonebook.txt"));
		String data = "";
		while ((data = in.readLine()) !=null) {
		 	System.out.println(data.toString());
	}
} catch (IOException e) 
		{
			e.printStackTrace();
	} finally {
try {
		if (in !=null)
		in.close();
}catch (IOException ex) 
		{
			ex.printStackTrace();
			}
		}
	}
}