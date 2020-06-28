package stream;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("�ڹ�", 25000));
		bookList.add(new Book("���̽�", 15000));
		bookList.add(new Book("�ȵ���̵�", 30000));
		
		System.out.println("== ��� å�� ������ �� ==");
		//å ������ mapToInt()�� ���� ��ȯ�� ������ �����ͼ� sum()���� �� ���ϱ�
		int total = bookList.stream().mapToInt(c->c.getPrice()).sum();
		//å ������ �� ���
		System.out.println(total + "��\n");
		System.out.println("=== å�� ������ 20,000�� �̻��� å�� ���� ===");
		//filter()�� 20000�� �̻� å�� ã�� �� map()���� ���� �������� sorted()�� ����
		//forEach()�� ���
		bookList.stream().filter(c->c.getPrice() >= 20000).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}
}
