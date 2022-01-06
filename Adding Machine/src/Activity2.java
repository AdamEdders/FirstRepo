import java.util.Scanner;
public class Activity2 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = Integer.parseInt(scn.nextLine());
        
        System.out.println("Enter the second number: ");
        int secondNumber = Integer.parseInt(scn.nextLine());
        
        System.out.println("Sum is : " + (firstNumber + secondNumber));
        
        // Version 2.0
        
        System.out.println("Enter both numbers with a plus sign between them: ");
        String s = scn.nextLine();
        
        char[] charArray = s.toCharArray();
        
        
        String first = "" ;
        String second = "" ;
        // Fin the index of plus sign 
        int idx = 0;
        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] == '+') {
                idx = i;
            }
        }
        
        // Parse first number
        for(int i = 0; i < idx; i++) {
            first = first + charArray[i];
        }
        
        // Parse the second
        for(int i = idx+1; i < charArray.length; i++) {
            second = second + charArray[i];
        }
        
        int sum = Integer.parseInt(first) + Integer.parseInt(second);
        
        System.out.println("Sum is: " + sum);
        
        scn.close();
            
        
    }}
