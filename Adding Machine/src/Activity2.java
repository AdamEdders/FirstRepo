//import scanner
import java.util.Scanner;

public class Activity2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type two numbers you want to add in the form '___+___' : ");
		String a = scan.nextLine();
		scan.close(); 
		
		//Declare variables
		char[] charArray = a.toCharArray();
		String first = "";
		String second = "";

		//Search for + to start adding
		int idx = a.indexOf('+');
		if (idx >= 0) {
			for (int i = 0; i < idx; i++);{
				first = first + charArray[i];
			}
			
			for (int i = idx+1; i <charArray.length; i++) {
				second = second + charArray[i];
			}
			
			int sum = Integer.parseInt(first.strip()) + Integer.parseInt(second.strip());
			System.out.println(sum);
		} else {
			System.out.println("You did not type a valid response!");
		}
	}

}
