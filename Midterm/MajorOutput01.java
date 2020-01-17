import java.util.Scanner;

public class MajorOutput01
 {
	public static void main (String []args) {
		System.out.println ("Input Five Numbers: ");
		Scanner input = new Scanner (System.in);
		int temp = 1, sum = 0;

		while (temp <= 5) {
		sum = sum + input.nextInt();
		temp++;
		}

		int average = sum / 5;
		System.out.println ("The Average is : " + average);
	}
}		
 	