import java.io.*;
import java.util.*;

public class MidtermAct03
{
	public static void main(String[] args){
		try {
			File act = new File ("Phonebook.txt");
			Scanner scanner = new Scanner (act);
			String code =" ";
			while(scanner.hasNext()) {
				code = scanner.next();
				if(code.equals("'1001-11")) {
					System.out.println("The code found!");
					System.out.println("Code: " + code);
					System.out.println("First_Name: " + scanner.next());
					System.out.println("Last_Name: " + scanner.next());
					System.out.println("Cp No: " + scanner.next());
					continue;
				}
			}
			scanner.close();
			}
			catch(IOException e) {
				System.out.println("Error");
			}
		}		
	}
		