package fileclass;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		//해당 경로에 File 클래스 생성. 아직 파일 생성 전
		File file = new File("C:\\Users\\User\\eclipse-workspace\\20200630\\newFile.txt");
		//파일 관련 메소드들
		file.createNewFile(); //실제 파일 생성
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		file.delete(); //파일 삭제
	}
}
