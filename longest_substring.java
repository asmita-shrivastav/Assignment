package assignment;

import java.util.*;

public class longest_substring {

	static String getStr(Set<Character> set) {
		StringBuilder sb = new StringBuilder();
		for (Character ch : set)
			sb.append(ch);
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "bbbbb";
		String o = "";

		if (s.equals(null))
			System.out.println("No String");

		Set<Character> set = new HashSet<>();
		int n = s.length();
		int count = 0;
		int i = 0, j = 0;
		while (i < n && j < n) {

			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				if (set.size() > count) {
					o = getStr(set);
					count = set.size();
				}
				j++;
			} else {
				set.remove(s.charAt(i));
				i++;
			}
		}

		System.out.println(o);

	}

}
