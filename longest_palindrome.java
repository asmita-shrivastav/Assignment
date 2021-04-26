package assignment;

public class longest_palindrome {

	public static void main(String[] args) {
		
		String s = "cbbd";
		String output ="";
		 if (s == null || s.length() < 1) 
			 System.out.println("no longest palindrome string");
		    int start = 0, end = 0;
		    for (int i = 0; i < s.length(); i++) {
		        int len1 = expandAroundCenter(s, i, i);
		        int len2 = expandAroundCenter(s, i, i + 1);
		        int len = Math.max(len1, len2);
		        if (len > end - start) {
		            start = i - (len - 1) / 2;
		            end = i + len / 2;
		        }
		    }
		    output= s.substring(start, end + 1);
		    System.out.println("Longest Palinromic String : " + output);
	}
	
	private static int expandAroundCenter(String s, int left, int right) {
	    int L = left, R = right;
	    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
	        L--;
	        R++;
	    }
	    return R - L - 1;
	}
}
