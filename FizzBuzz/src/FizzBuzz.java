
public class FizzBuzz {

	public static void main(String[] args) {

		int max = 100;

		for (int i = 1; i <= max; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizzbuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}

	}

}
