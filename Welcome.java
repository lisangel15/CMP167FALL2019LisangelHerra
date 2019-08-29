import java.util.Scanner; 

public class Welcome {
	public static void main (String[] args) {
	
		String welcome; 
		welcome = "Welcome to the Java language" ; 
		System.out.println(welcome); 
		
		Scanner input = new Scanner (System.in); 
		
		System.out.println("What is your name? Im a program") ; 
		
		String name= input.nextLine(); 
		
		System.out.println("Nice to meet you, " + name); 
	}
	 
}
