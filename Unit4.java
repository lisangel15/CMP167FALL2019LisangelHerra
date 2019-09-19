/**
 * 
 * @author Lisangel Herra
 * @description This program checks if you're old enough to drink alcohol 
 */
import java.util.Scanner; 

public class Unit4 {

	public static void main(String[] args) {
		int age; 
		String name; 
		Scanner in = new Scanner(System.in) ;
		
		System.out.println("This program will check if you can legally drink alcohol"); 
		System.out.println("Enter your name: ");
		name = in.next(); 
		
		System.out.printf("Okay %s, How old are you?", name); 
		age = in.nextInt(); 
		
		if(age >= 21) {
			System.out.println("You can drink alcohol"); 
		}
		else {
			System.out.println("You cant drink alcohol"); 
		}

	}

}
