package javaException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundException {
	public static void main(String[] args) throws IOException {
		// file này không có trong ổ C -> FileNotFoundException
		File file = new File("D:\testing.txsst");
		FileReader fr = new FileReader(file);
		fr.close();
	}
}
