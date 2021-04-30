package assignment;

import java.io.*;
import java.util.*;

public class trywithResource {
	public static void main(String[] args) throws IOException {
		try (
				Scanner scanner = new Scanner(new File("F://Demo1.txt"));
				PrintWriter writer = new PrintWriter(new File("F://Demo3.txt"));
			) {
			while (scanner.hasNext()) {
				writer.print(scanner.nextLine());
			}
		}
	}
}
