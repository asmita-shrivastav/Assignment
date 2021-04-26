package assignment;
import java.io.*;

public class deletefile_S {
	public final static String FOLDER_NAME = "E://Test/";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		 File folder = new File(FOLDER_NAME);
		 for (File file : folder.listFiles())
		 {
			// System.out.println(file.getName());
		   if (file.getName().charAt(0) == 's' || file.getName().charAt(0) == 'S') 
		   { 
			   System.out.println(file.getName());
			  file.delete();
		   }
		 }
	}
}
