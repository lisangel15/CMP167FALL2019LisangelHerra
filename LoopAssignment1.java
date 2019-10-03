/**
 * 
 * @author Lisangel Herra
 *
 */
import java.util.Scanner; 
public class LoopAssignment1 {
	public static void main(String [] args) {
		int num; 
		int sumTwo = 0; 
		Scanner in = new Scanner (System.in); 
		System.out.println("Please enter a number: "); 
		num = in.nextInt(); 
		
		System.out.printf("Printing out numbers from 1 to %d:", num); 
		System.out.println();
		for (int i=1; i<num; i++) {
			System.out.println(i); 
		}
		System.out.printf("Printing out the squares from 1 to %d:", num); 
		System.out.println(); 
		while (num >= 1) {
			num--; 
			System.out.println(num*num);  	
		}
		System.out.println("Please choose another number: ");
		int num2 = in.nextInt(); 
		int sum = num + num2;  
		System.out.printf("The sum of %d and %d is: ", num, num2);
		System.out.print(sum);
		
		for(int j=1 ; j<num; j++) {
			sumTwo= sumTwo + j; 
			System.out.println(sumTwo);
		}
	}
}
