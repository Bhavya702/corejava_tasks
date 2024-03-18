package task2;

public class Book_task1 {
	int bookid;
	String bookname;
	String author;
	public Book_task1(int bookid, String bookname, String author) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
	}
	@Override
	public String toString() {
		return " \nbookid=" + bookid + ", bookname=" + bookname + ", author=" + author ;
	}
	

}
