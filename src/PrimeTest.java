import java.util.ArrayList;

public class PrimeTest {

	public static int primeSearch(int userChoice) {

		ArrayList<Integer> primeArr = new ArrayList<>();

		
		
	//Attempting to refactor the for-loops from Primes.Java into a method
	
		
		if (userChoice == 1) {

			for (int i = 0; i < userChoice; i++) {
				i = primeArr.indexOf(userChoice);
				System.out.println(primeArr.get(userChoice));
			}

		}

		return 0;

		/*
		 * This is another way that I tried...
		 * 
		 * if (userChoice <= 10) { for (int i = 0; i < primeArr.size(); i++) {
		 * 
		 * if (primeArr.get(i - 1) == userChoice) { return primeArr.get(i - 1); } } }
		 * return 0;
		 */
		
		
		
		
		
		/*
		 This is actually the right answer but I have no idea why it works
		 
		 
		
		 * 		public static int checkPrime(int n) {
	        int num, count, i;
	        num = 1;
	        count = 0;
	        
	        while (count < n) {
	            num = num+1;
	            for (i = 2; i <= num; i++) {
	                if  (num % i== 0) {
	                    break;
	                }
	            }
	            if (i == num) {
	                count = count+ 1;
	            }
	        }
	        
	        return num;

	    }
		*/
		 
	}
}
