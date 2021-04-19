package assignment;

public class static_assignment {
		static int c;
		
		static {
			c = 5;			
			System.out.println("in static block value of c before increment_method = " + c);
			increment_method();
			System.out.println("in static block value of c after increment_method = " + c);
		}
		
		static void increment_method() {			
			c++;
			System.out.println("in static method (increment_method), c = " + c);
		}
		
		public static void main(String[] args) {
			c = 9;
			System.out.println("in main method value of c before increment_method = " + c);
			increment_method();
			System.out.println("in main method value of c after increment_method = " + c);
		}
}
