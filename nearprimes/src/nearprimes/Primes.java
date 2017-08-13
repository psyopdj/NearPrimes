package nearprimes;

import java.util.Scanner;

public class Primes {

	public static void main(String[] args) {
		
		long n;
		Scanner reader = new Scanner(System.in);
		do {
			System.out.print("Enter a number: ");
			n = reader.nextLong();
			long startTime = System.currentTimeMillis();
			if (n < 0) {
				System.out.println("You entered an invalid number.");
			}
			else if (n == 0){
				break;
			}
			else{
				if ((n % 2) != 0){
					boolean isPrime = true;
					for (long i = 3; i <= (n/2); i += 2){
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
						long endTime1 = System.currentTimeMillis();
						System.out.println("This was done in " + ((endTime1 - startTime)) + " milliseconds.");
					}
					else if (isPrime == false){
						long lowPrime = getLowPrime(n);
						long highPrime = getHighPrime(n);
						System.out.println(lowPrime + " < " + n + " < " + highPrime);
						long endTime2 = System.currentTimeMillis();
						System.out.println("This was done in " + ((endTime2 - startTime)) + " milliseconds.");
					}
				}
				else{
					if (n == 2){
						System.out.println(n + " is prime.");
						long endTime3 = System.currentTimeMillis();
						System.out.println("This was done in " + ((endTime3 - startTime)) + " milliseconds.");
					}
					else{
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