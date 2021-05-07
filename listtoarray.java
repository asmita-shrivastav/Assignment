package assignment;

import java.util.*;

public class listtoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Character> list = new ArrayList<>();

		for (char i = 'a'; i <= 'h'; i++)
			list.add(i);

		Character[] arr = new Character[list.size()];

		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}

		System.out.println("ArrayList to Array: " + Arrays.toString(arr));

		List<Character> convertedToList = new ArrayList<>();
		convertedToList = Arrays.asList(arr);

		System.out.println("Array to ArrayList: " + convertedToList);
	}

}
