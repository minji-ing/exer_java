package reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("reader.txt")){
			int i;
			while((i = fr.read()) != -1) {
				System.out.println((char)i);
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("우와아아아아");
		}
		System.out.println("예외 처리이이이이");
	}
}
