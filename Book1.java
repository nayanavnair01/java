package java1;

class Books{
	String title;
	String author;
	final int bookId;
	static int bookcount =1000;
	final static String LIBRARY_NAME =("Central Library");
	Books() {
	title = "Unknown Title";
    author = "Unknown Author";
    bookId = bookcount;
	}
    
	Books(String title, String author) {
		this.title=title;
		this.author=author;
		this.bookId = bookcount;
		bookcount++;
	}
	public void displayInfo() {
		System.out.println("book title:"+title);
		System.out.println("author:"+author);
		
	}
	public void displayInfo(boolean showLIBRARY) {
		if(showLIBRARY) {
			displayInfo();
			System.out.println("Library Name:"+LIBRARY_NAME);
			
			
		}
		
	}
	
	public static void displayTotal() {
		System.out.println("total book:"+(bookcount-1000));
	}
	public class Book1 {
		public static void main(String [] args) {
		Books book =new Books();
		book.displayInfo(true);
		book.displayInfo();
		
		Books.displayTotal();
		
		}
		
		
}



}
