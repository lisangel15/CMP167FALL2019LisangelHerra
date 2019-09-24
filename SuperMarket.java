/**
 * 
 * @author Lisangel Herra
 *
 */
import java.util.Scanner; 
public class SuperMarket {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		String answer; 
		double budget; 
		
		System.out.println("Welcome to Lisa's SuperMarket"); 
		System.out.print("Would you like to see the inventory?"); 
		answer = in.next(); 
		if (answer.equalsIgnoreCase("yes")) {
			System.out.printf(" 1.%s %n 2.%s %n 3.%s", "Pringles", "Prosecco", "Mozzarella Sticks");
			System.out.println("Would you like to buy something? Type 1,2 or 3"); 
			switch (choice) {
			case 1:
				System.out.println("You selected Pringles"); 
				System.out.println("That is $2.99"); 
				break; 
			case 2:
				System.out.println("You selected Prosecco");
				System.out.println("That is $99.99"); 
				break; 
			case 1:
				System.out.println("You selected Mozarella Sticks"); 
				System.out.println("That is $9.99"); 
				break; 
			default:
				System.out.println("OK, Come back soon"); 
			}
		}
		
		else {
			System.out.println("Ok, come back soon"); 
		}
	}

}
