package assignment;

class Stack_<T> {
	static final int MAX = 10;
	int top = -1;
	Object[] a = new Object[MAX];

	boolean isEmpty() {
		return (top < 0);
	}

	boolean push(T x) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			top++;
			a[top] = x;
			System.out.println("Element pushed: "+ x);
			return true;
		}
	}

	T pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return null;
		} else {
			T x = (T) a[top--];
			return x;
		}
	}

	T peek() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return null;
		} else {
			T x = (T) a[top];
			return x;
		}
	}
}

public class GenericStack {
	public static void main(String[] args) {
		Stack_<Integer> stack = new Stack_<Integer>();
		stack.push(25);
		stack.push(27);
		System.out.println("Element pop : "+stack.pop());
		System.out.println("Element peek : "+stack.peek());
		stack.push(78);
		stack.push(2);
		System.out.println("Element peek : "+stack.peek());
	}
}
