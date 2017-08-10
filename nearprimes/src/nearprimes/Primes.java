package nearprimes;

import java.util.Scanner;

public class Primes {

	public static void main(String[] args) {
		
		int input;
		Scanner reader = new Scanner(System.in);
		do {
			System.out.print("Enter a number: ");
			input = reader.nextInt();
			if (input < 0) {
				System.out.println("You entered an invalid number. Try again");
			}
			else if (input == 0){
				break;
			}
			else{
				System.out.println("You entered: " + input);
			}
		} while (input != 0);
		
		reader.close();

	}

}
