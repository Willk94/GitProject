import java.util.Scanner;


public class Task_4 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a Word:");
		String p = scanner.next();


		StringBuilder sb = new StringBuilder(p);
		p = sb.reverse().toString();
		System.out.println("ReverseString : "+p);
	
		if (scanner != null)
			scanner.close();

	}
	
}