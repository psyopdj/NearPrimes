package nearprimes;

import java.util.Scanner;

public class Primes {

	public static void main(String[] args) {
		
		int n;
		Scanner reader = new Scanner(System.in);
		do {
			System.out.print("Enter a number: ");
			n = reader.nextInt();
			if (n < 0) {
				System.out.println("You entered an invalid number. Try again");
			}
			else if (n == 0){
				break;
			}
			else{
				System.out.println("You entered: " + n);
			}
		} while (n != 0);
		
		reader.close();

	}

}
