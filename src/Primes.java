import java.util.ArrayList;
import java.util.Scanner;

public class Primes {

	public static void main(String[] args) {

		ArrayList<Integer> primes = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int userChoice;

		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);
		primes.add(11);
		primes.add(13);
		primes.add(17);
		primes.add(19);
		primes.add(23);
		primes.add(29);

		userChoice = Validator.getInt(scan, "Enter a number 1-10 to find out the Prime that's stored there! ");

		if (userChoice > 10) {
			System.out.println("Only enter numbers 1-10!");

		}

		if (userChoice == 1) {

			System.out.println("The number " + userChoice + " prime is " + primes.get(userChoice - 1));

		}

		if (userChoice == 2) {

			for (int i = 1; i < userChoice; i++) {
				System.out.println("The number " + userChoice + " prime is " + primes.get(userChoice - 1));
			}

		}

		if (userChoice == 3) {

			for (int i = 2; i < userChoice; i++) {
				System.out.println("The number " + userChoice + " prime is " + primes.get(userChoice - 1));

			}
		}

		if (userChoice == 4) {

			for (int i = 3; i < userChoice; i++) {
				System.out.println("The number " + userChoice + " prime is " + primes.get(userChoice - 1));

			}
		}
		
		if (userChoice == 5) {

			for (int i = 4; i < userChoice; i++) {
				System.out.println("The number " + userChoice + " prime is " + primes.get(userChoice - 1));

			}
		}
		
		if (userChoice == 6) {

			for (int i = 5; i < userChoice; i++) {
				System.out.println("The number " + userChoice + " prime is " + primes.get(userChoice - 1));

			}
		}
		
		if (userChoice == 7) {

			for (int i = 6; i < userChoice; i++) {
				System.out.println("The number " + userChoice + " prime is " + primes.get(userChoice - 1));

			}
		}

		if (userChoice == 8) {

			for (int i = 7; i < userChoice; i++) {
				System.out.println("The number " + userChoice + " prime is " + primes.get(userChoice - 1));

			}
		}
		
		if (userChoice == 9) {

			for (int i = 8; i < userChoice; i++) {
				System.out.println("The number " + userChoice + " prime is " + primes.get(userChoice - 1));

			}
		}
		
		if (userChoice == 10) {

			for (int i = 9; i < userChoice; i++) {
				System.out.println("The number " + userChoice + " prime is " + primes.get(userChoice - 1));

			}
		}
		
	}

}
