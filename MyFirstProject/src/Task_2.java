import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {

		// Create a Scanner object
		Scanner scanner = new Scanner(System.in);


		//A String value

		System.out.print("Enter a Number: ");
		int max = scanner.nextInt();

		for (int i = 0; i < max; i++) {

			for (int p = 0; p < i; p++) {
				System.out.print("*");
			}
			System.out.println("*");
		}

	
	if (scanner != null)
		scanner.close();
}
}