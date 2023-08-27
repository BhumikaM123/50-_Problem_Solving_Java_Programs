import java.util.Scanner;
public class LibraryBookApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("pls enter the book id,name,author,color,"
			+ "size,no of pages,book genre,prize,weight and age");
	int book_id=scan.nextInt();
	scan.nextLine();
	
	String book_name=scan.nextLine();
	String book_author=scan.nextLine();
	String book_color=scan.nextLine();
	float book_size=scan.nextFloat();
	int book_no_of_pages=scan.nextInt();
	scan.nextLine();
	String book_genre=scan.nextLine();
	int book_prize=scan.nextInt();
	int book_weight=scan.nextInt();
	int book_age=scan.nextInt();
	
	LibraryBook b1 = new LibraryBook(book_id,book_name,book_author,book_color,book_size,
			 book_no_of_pages,book_genre,book_prize,book_weight,book_age);
	scan.close();
	b1.read();
	b1.borrow();
	
}
}
