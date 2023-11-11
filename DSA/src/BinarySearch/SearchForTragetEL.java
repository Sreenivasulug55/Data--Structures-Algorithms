package BinarySearch;

public class SearchForTragetEL {

	public static void main(String[] args) {
		int Num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int Result = binarySearch(Num, 2);

		if (Result != -1) {
			System.out.println("Position of a element: " + Result);
		} else
			System.out.println("Element Not Found: " + Result);

	}

	public static int Linear_Search(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			// Check if the target is in the middle
			if (array[mid] == target) {
				return mid;
			}

			// If the target is greater, ignore the left half
			if (array[mid] < target) {
				left = mid + 1;
			}

			// If the target is smaller, ignore the right half
			else {
				right = mid - 1;
			}
		}

		// If the target is not found in the array
		return -1;
	}

}
