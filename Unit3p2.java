/**
 * 
 * Lisangel Herra
 * 
 **/
import java.util.Scanner;
public class Unit3p2 {
	public static void main(String[] args) {
		String myWord = "Sara 45 Cruz"; 
		Scanner in = new Scanner(myWord); 
		String name = in.next(); 
		int age = in.nextInt(); 
		
		
		System.out.printf("%s is %d years old", name, age); 

	}
}
