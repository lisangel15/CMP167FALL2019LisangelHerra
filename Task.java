/**
 * 
 * Lisangel Herra
 * 
 **/
import java.io.StringWriter; 
import java.io.PrintWriter; 
public class Task {

	public static void main(String[] args) {
		int favNum= 15; 
		
		StringWriter sw = new StringWriter(); 
		PrintWriter pw = new PrintWriter(sw); 
		
		pw.print("Lisangel Herra"); 
		String name = sw.toString();
		
		System.out.printf("%s favorite number is %d", name, favNum);

	}

}
