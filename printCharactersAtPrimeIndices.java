import java.util.* ;
import java.io.*; 

public class Solution {

    // Function to return characters at prime indices
	public static String printCharactersAtPrimeIndices(String str, int n) {
		StringBuilder result = new StringBuilder();

		// Precompute prime indices using sieve
		boolean[] isPrime = sieveOfEratosthenes(n);

		// Append characters at prime indices
		for (int i = 0; i < n; i++) {
			if (isPrime[i]) {
				result.append(str.charAt(i));
			}
		}
		return result.toString();
	}

	// Sieve of Eratosthenes to mark prime numbers up to n
	private static boolean[] sieveOfEratosthenes(int n) {
		boolean[] prime = new boolean[n];
		Arrays.fill(prime, true);

		if (n > 0) prime[0] = false;
		if (n > 1) prime[1] = false;

		for (int i = 2; i * i < n; i++) {
			if (prime[i]) {
				for (int j = i * i; j < n; j += i) {
					prime[j] = false;
				}
			}
		}
		return prime;
	}
}
