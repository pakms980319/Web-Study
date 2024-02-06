package test.com.javaroast.lombok;

public class BookTest {
	public static void main(String[] args) {
		Book book = new Book();
		
		book.setIsbn("1234-5678");
		book.setBookName("테스트");
		
		System.out.println("book isbn: " + book.getIsbn());
		System.out.println("book name: " + book.getBookName());
	}
}
