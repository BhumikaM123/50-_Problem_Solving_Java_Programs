public class LibraryBook {
int book_id;
String book_name;
String book_author;
String book_color;
float book_size;
int book_no_of_pages;
String book_genre;
int book_prize;
int book_weight;
int book_age;

public LibraryBook(int book_id, String book_name, String book_author, String book_color, float book_size,
		int book_no_of_pages, String book_genre, int book_prize, int book_weight, int book_age) {
	super();
	this.book_id = book_id;
	this.book_name = book_name;
	this.book_author = book_author;
	this.book_color = book_color;
	this.book_size = book_size;
	this.book_no_of_pages = book_no_of_pages;
	this.book_genre = book_genre;
	this.book_prize = book_prize;
	this.book_weight = book_weight;
	this.book_age = book_age;
}
void read() {
System.out.println("Id"+" "+book_id+" "+"book"+  book_name+" "+"written by"+" "+
book_author+" "+"of color"+" "+book_color+" "+"of size"+" "+book_size+
" "+"where"+" "+book_no_of_pages+" "+"pages");
System.out.println("with favorite"+
" "+book_genre+" "+"genre"+" "+"of prize"+" "+book_prize+"rupees"
+" "+"with weight of"+" "+book_weight+" "+"kgs");
System.out.println("where its history included"
+" "+book_age+" "+"years");
}
void borrow() {
	System.out.println("I borrowed"+" "+book_name+" "+"book"+" "
+"written by"+" "+book_author);
}

}
