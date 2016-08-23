import java.util.Scanner;

public class PRIME1 {

	public void primes(long n) {
		boolean[] primes = new boolean[(int) (n + 1)];
		for (long i = 2; i < primes.length; i++) {
			primes[(int) i] = true;
		}
		long num = 2;
		while (true) {
			for (long i = 2;; i++) {
				long multiple = num * i;
				if (multiple > n) {
					break;
				} else {
					primes[(int) multiple] = false;
				}
			}
			boolean nextNumFound = false;
			for (long i = (int) (num + 1); i < n + 1; i++) {
				if (primes[(int) i]) {
					num = i;
					nextNumFound = true;
					break;
				}
			}
			if (!nextNumFound) {
				break;
			}
		}
		for (long i = 0; i < primes.length; i++) {
			if (primes[(int) i]) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long  n = scanner.nextLong();
		PRIME1 sieve = new PRIME1();
		sieve.primes(n);

		if (scanner != null)
			scanner.close();
	}
}