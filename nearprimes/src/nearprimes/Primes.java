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
				if ((n % 2) == 0){
					// Implement near prime algorithm for even numbers
				}
				else{
					System.out.println("You entered: " + n);
					boolean isPrime = true;
					for (int i = 3; i <= (n/2); i += 2){
						if ((n % i) == 0){
							isPrime = false;
							break;
						}
						else{
							isPrime = true;
						}
					}
					if (isPrime == true){
						System.out.println(n + " is prime.");
					}
					else if (isPrime == false){
						// Implement near prime algorithm for odd numbers
					}
				}
			}
		} while (n != 0);
		
		reader.close();

	}

}
