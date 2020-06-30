package fileclass;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		//�ش� ��ο� File Ŭ���� ����. ���� ���� ���� ��
		File file = new File("C:\\Users\\User\\eclipse-workspace\\20200630\\newFile.txt");
		//���� ���� �޼ҵ��
		file.createNewFile(); //���� ���� ����
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		file.delete(); //���� ����
	}
}
