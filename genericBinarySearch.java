package assignment;

class BinarySearch<T extends Comparable<T>> {

	@SuppressWarnings("unchecked")
	public int search(T[] arr, T k, int hi, int low) {

		if (low <= hi) {
			int mid = low + (hi - low / 2);

			if (arr[mid].equals(k))
				return mid;

			if (((T) arr[mid]).compareTo(k) < 0)
				return search(arr, k, hi, mid + 1);

			return search(arr, k, mid - 1, low);
		}
		return -1;
	}
}

public class genericBinarySearch {
	
	public static void main(String[] args) {
		
		BinarySearch<Integer> b = new BinarySearch<Integer>();
		Integer[] arr = { 1, 2, 3, 14, 58, 74, 79, 84, 95 };

		int res = b.search(arr, 84, arr.length - 1, 0);
		if (res == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + res);
	}
}
