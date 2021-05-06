package assignment;

class MergeSort<T extends Comparable<T>> {

	void sort(T[] arr, int l, int r) {
		if (l < r) {
			int m = l + (r - l) / 2;

			sort(arr, l, m);
			sort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	void merge(T[] arr, int l, int m, int r) {
		
		int n1 = m - l + 1;
		int n2 = r - m;


		Object L[] = new Object[n1];
		Object R[] = new Object[n2];


		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (((Comparable<T>) L[i]).compareTo((T) R[j]) <= 0) {
				arr[k] = (T) L[i];
				i++;
			} else {
				arr[k] = (T) R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = (T) L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = (T) R[j];
			j++;
			k++;
		}
	}
}

public class genericMergeSort {

	public static void main(String[] args) {

		MergeSort<Integer> b = new MergeSort<Integer>();
		Integer[] arr = { 182, 10125, 184, 57, 6, 87 };
		int n = arr.length;
		
		b.sort(arr, 0, n - 1);
	
		System.out.println("Result:  ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		
	}
}
