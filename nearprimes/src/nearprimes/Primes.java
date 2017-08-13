package nearprimes;

import java.util.Scanner;

public class Primes {

	public static void main(String[] args) {
		
		long n;
		Scanner reader = new Scanner(System.in);
		
		/*	This loop will read in long integers and check if they are prime until
			the user enters '0'.
		*/
		do {
			System.out.print("Enter a number: ");
			n = reader.nextLong();
			long startTime = System.currentTimeMillis();		// This variable will keep track of starting time for us.
			if (n < 0) {
				System.out.println("You entered an invalid number.");
			}
			else if (n == 0){
				break;
			}
			else{
				if ((n % 2) != 0){
					boolean isPrime = true;
					for (long i = 3; i <= (n/2); i += 2){		// Only need to check if it's divisible by odd numbers.
						if ((n % i) == 0){
							isPrime = false;
							break;
						}
						else{
							isPrime = true;
						}
					}
					if (isPrime == true){		// The most efficient possibility is for the entered number to already be prime so we check for that first.
						System.out.println(n + " is prime.");
						long endTime1 = System.currentTimeMillis();
						System.out.println("This was done in " + ((endTime1 - startTime)) + " milliseconds.");
					}
					else if (isPrime == false){			// If the number wasn't prime, get low-prime and high-prime.
						long lowPrime = getLowPrime(n);
						long highPrime = getHighPrime(n);
						System.out.println(lowPrime + " < " + n + " < " + highPrime);
						long endTime2 = System.currentTimeMillis();
						System.out.println("This was done in " + ((endTime2 - startTime)) + " milliseconds.");
					}
				}
				else{
					if (n == 2){		// Unique case that can be checked easily and efficiently.
						System.out.println(n + " is prime.");
						long endTime3 = System.currentTimeMillis();
						System.out.println("This was done in " + ((endTime3 - startTime)) + " milliseconds.");
					}
					else{		// If n was even but not '2', get low-prime and high-prime.
						long lowPrime = getLowPrime(n);
						long highPrime = getHighPrime(n);
						System.out.println(lowPrime + " < " + n + " < " + highPrime);
						long endTime4 = System.currentTimeMillis();
						System.out.println("This was done in " + ((endTime4 - startTime)) + " milliseconds.");
					}
				}
			}
		} while (n != 0);
		
		reader.close();

	}
	
	/*	This function takes in a long and returns the nearest prime less than the long.
		Since primes are only odd (except for 2), the function only needs to check if
		its divisible by odd numbers (because every odd number is the product of only
		odd numbers).
	*/
	public static long getLowPrime(long num){
		long newPrime;
		boolean isFound = false;
		boolean isPrime = true;
		
		while (isFound != true){
			num--;
			for (long i = 3; i <= (num/2); i += 2){
				if ((num % i) == 0){
					isPrime = false;
					break;
				}
				else{
					isPrime = true;
				}
			}
			
			if (isPrime == true){
				isFound = true;
			}
			else{
				continue;
			}
		}
		newPrime = num;
		return newPrime;
	}
	
	/*	This function takes in a long and returns the nearest prime more than the long.
		Since primes are only odd (except for 2), the function only needs to check if
		its divisible by odd numbers (because every odd number is the product of only
		odd numbers).
	*/
	public static long getHighPrime(long num){
		long newPrime;
		boolean isFound = false;
		boolean isPrime = true;
		
		while (isFound != true){
			num++;
			for (long i = 2; i <= (num/2); i++){
				if ((num % i) == 0){
					isPrime = false;
					break;
				}
				else{
					isPrime = true;
				}
			}
			
			if (isPrime == true){
				isFound = true;
			}
			else{
				continue;
			}
		}
		newPrime = num;
		return newPrime;
	}
}