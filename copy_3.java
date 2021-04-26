package assignment;

import java.io.*;

public class copy_3 {

	public static void main(String[] args) {
		FileWriter file1 = null;
		// TODO Auto-generated method stub
		try {
			file1 = new FileWriter("F://Demo1.txt");
			file1.write(
					"Spring is the time of year when many things change—including the weather. Temperatures can swing back and forth between balmy and frigid. Sunny days may be followed by a week of stormy weather. Sometimes extreme weather changes can occur even within the same day. "
							+ "Mark Twain once said, “In the spring I have counted one hundred and thirty-six kinds of weather inside of four and twenty hours.”");
			file1.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// copy

		FileReader inputStream = null;
		FileWriter outputStream = null;

		try {
			inputStream = new FileReader("F://Demo1.txt");
			outputStream = new FileWriter("F://Demo2.txt");

			int c;
			int i = 0;
			while ((c = inputStream.read()) != -1) {

				if (i < 2)
					outputStream.write(c);

				if ((char) c == '.') {
					i++;
				}

			}
			inputStream.close();
			outputStream.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
