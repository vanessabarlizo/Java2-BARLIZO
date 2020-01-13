import java.io.*;

public class PrelimAct02
{
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("phonebook.txt"));
			int ascii = 0, colon = 0;
			String data = "", f_name = "", l_name = "", cp = "";
			boolean hasFound = false;
			
			while ((ascii = in.read()) != -1) {
				String s = String.valueOf((char)ascii);
				data = data.concat(s);
				
				if(ascii == '\n') {
					data = "";
					colon = 0;
					}
				if(ascii == ':') {
					colon++;
				}
				if(data.equals("1001-11")) {
					System.out.println("We're found the record");
					hasFound = true;
				}
				if(hasFound == true && data != ":") {
					if(colon == 1) f_name = f_name.concat(String.valueOf((char)ascii));
					if(colon == 2) l_name = l_name.concat(String.valueOf((char)ascii));
					if(colon == 3) cp = cp.concat(String.valueOf((char)ascii));
				}
				if(hasFound == true && ascii == '\n') hasFound = false;
			}
			System.out.println("First_Name" + f_name);
			System.out.println("Last_Name" + l_name);
			System.out.println("Cp #" + cp);
			in.close();
		} 
		catch (IOException e) {
			System.out.print(e);
		
		}
	}
}
		
				