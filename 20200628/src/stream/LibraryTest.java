package stream;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		System.out.println("== 모든 책의 가격의 합 ==");
		//책 가격을 mapToInt()로 정수 변환된 값으로 가져와서 sum()으로 합 구하기
		int total = bookList.stream().mapToInt(c->c.getPrice()).sum();
		//책 가격의 합 출력
		System.out.println(total + "원\n");
		System.out.println("=== 책의 가격이 20,000원 이상인 책의 제목 ===");
		//filter()로 20000원 이상 책만 찾은 후 map()으로 제목 가져오고 sorted()로 정렬
		//forEach()로 출력
		bookList.stream().filter(c->c.getPrice() >= 20000).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}
}
