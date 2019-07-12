import com.sinc.book.Book;

public class BookMain {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		books[0]=new Book("SQL Plus",50000,5.0);
		books[1]=new Book("Java 2.0",40000,3.0);
		books[2]=new Book("JSP Servlet",50000,6.0);
		System.out.println("책이름		가격	할인율	할인후금액\n"+
			   "____________________________________________\n");
		for(Book value: books) {
			System.out.println(value);
		}
	}

}
