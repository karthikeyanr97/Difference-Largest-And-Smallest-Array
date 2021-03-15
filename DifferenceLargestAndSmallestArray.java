import java.util.Scanner;

public class DifferenceLargestAndSmallestArray extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of the element:");
		int size = scanner.nextInt();

		System.out.println("Enter the positive integer elements:");
		int[] array = new int[size];

		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();

		int result = getBigDiff(array);
		System.out.println(result);

		scanner.close();

	}
}

class UserMainCode {

	public static int getBigDiff(int[] array) {

		if (array.length < 1)
			return -1;

		int low = array[0], high = array[0];

		for (int i = 1; i < array.length; i++) {

			if (high < array[i])
				high = array[i];
			else if (low > array[i])
				low = array[i];
		}

		return high - low;

	}

}
