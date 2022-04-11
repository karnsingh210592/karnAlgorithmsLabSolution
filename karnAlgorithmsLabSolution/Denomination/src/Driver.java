import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Enter number of denominations");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("Enter denominations");
		int denominations[] = new int[n];

		for (int i = 0; i < n; i++) {
			denominations[i] = sc.nextInt();
		}

		System.out.println("Enter amount");
		int sum = sc.nextInt();

		BubbleSort.bubblesort(denominations);

		int count[] = new int[denominations.length];

		for (int i = 0; i < denominations.length; i++) {
			if (sum >= denominations[i]) {
				int x = sum / denominations[i];
				sum = sum - (denominations[i] * x);
				count[i] = x;
			}
		}

		if (sum > 0) {
			System.out.println("Not possible to pay the amount");
		} else {
			System.out.println("Your payment is done with the followin amount:");
			for (int i = 0; i < count.length; i++) {
				System.out.println(denominations[i] + ":" + count[i]);
			}
		}
	}

}
