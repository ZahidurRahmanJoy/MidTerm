package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {


		System.out.println("Prime numbers from 1 to 10000000 ");

		for (int i = 2; i <= 1000000; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}}