package assignment;

class InvalidEnrtyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidEnrtyException(String s) {
		super(s);
	}
}

class MyException extends Exception {
	static void validate(String s) throws InvalidEnrtyException {
		
		for (char c : s.toCharArray()) {
			if (c >= '0' && c <= '9') {
				throw new InvalidEnrtyException("not valid");
			}
		}
	}
}

public class customException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String check = "check23";
		try {
			MyException.validate(check);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}

		System.out.println("String given: " + check);

	}

}
