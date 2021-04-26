package assignment;

import java.io.*;
import java.nio.file.*;

import java.util.*;
import java.util.zip.*;

public class listFilesFolders_and_files_zip {
	
	public final static String FOLDER_NAME = "E://Test/";
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		File directoryPath = new File(FOLDER_NAME);
		List<String> fileNames = new ArrayList<>();
		List<String> folderNames = new ArrayList<>();
		File filesList[] = directoryPath.listFiles();

		for (File file : filesList) {
			if (file.isFile())
				fileNames.add(file.getName());
			else
				folderNames.add(file.getName());
		}
		System.out.println("List of files: ");
		for (String fileName : fileNames)
			System.out.println(fileName);
		System.out.println("\nList of folders: ");
		for (String folderName : folderNames)
			System.out.println(folderName);

		// zip files

		try {

			File zipFile = new File(FOLDER_NAME + "multipleFilesCompressed1.zip");
			FileOutputStream fos = new FileOutputStream(zipFile);
			ZipOutputStream zos = new ZipOutputStream(fos);

			for (String fileName : fileNames) {
				final int BUFFER = 1024;
				BufferedInputStream bis = null;

				File file = new File(FOLDER_NAME + fileName);
				FileInputStream fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis, BUFFER);

				ZipEntry zipEntry = new ZipEntry(file.getName());
				zos.putNextEntry(zipEntry);
				byte data[] = new byte[BUFFER];
				int count;
				while ((count = bis.read(data, 0, BUFFER)) != -1) {
					zos.write(data, 0, count);
				}
				zos.closeEntry();
			}
		} catch (FileNotFoundException ex) {
			System.err.println("A file does not exist: " + ex);
		} catch (IOException ex) {
			System.err.println("I/O error: " + ex);
		}

		// zip folders
		
		try {

			File zipFile = new File(FOLDER_NAME + "multipleFoldersCompressed1.zip");
			FileOutputStream fos = new FileOutputStream(zipFile);
			ZipOutputStream zos = new ZipOutputStream(fos);

			for (String fileName : folderNames) {
				final int BUFFER = 4096;
				BufferedInputStream bis = null;

				File file = new File(FOLDER_NAME + fileName);
				FileInputStream fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis, BUFFER);

				ZipEntry zipEntry = new ZipEntry(file.getName());
				zos.putNextEntry(zipEntry);
				byte data[] = new byte[BUFFER];
				int count;
				while ((count = bis.read(data, 0, BUFFER)) != -1) {
					zos.write(data, 0, count);
				}
				zos.closeEntry();
			}
		} catch (FileNotFoundException ex) {
			System.err.println("A file does not exist: " + ex);
		} catch (IOException ex) {
			System.err.println("I/O error: " + ex);
		}


	}
}
