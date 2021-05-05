package assignment;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.imageio.*;

public class readJPEG {
	public final static String FOLDER_NAME = "F://Test/";

	public static void main(String[] args) throws IOException {
		File directoryPath = new File(FOLDER_NAME);
		Queue<String> fileNames = new ArrayDeque<String>();

		File filesList[] = directoryPath.listFiles();

		for (File file : filesList) {
			if (file.isFile())
				if (ImageIO.read(file) != null)
					fileNames.add(file.getName());

		}
		System.out.println("List of files: " + fileNames );
		for (String fileName : fileNames) {
			try {
				//System.out.println(fileName);
				File imgObj = new File(FOLDER_NAME + fileName);
				float imgLength = (float)imgObj.length() / (1024 * 1024);
				
				if (imgLength > 1) {
					System.out.println("\n"+fileName +", size: "+ imgLength + " MB");
					BufferedImage img = ImageIO.read(imgObj);
					System.out.println("Image Contents: "+img);
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
