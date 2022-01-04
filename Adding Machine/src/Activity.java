//import scanner
import java.util.Scanner;

public class Activity {
	public static void main(String[] args) {
		//initialize Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please type your first number and press Enter: ");
		
		//record input data
		String a = scanner.nextLine();
		int x = Integer.parseInt(a);  

		System.out.print("Please type your second number and press Enter: ");
		String b = scanner.nextLine();
		int y = Integer.parseInt(b);  

		//close scanner
		scanner.close();
		
		//Set and print sum
		int sum = x+y;
		System.out.println(sum);
	}
}
