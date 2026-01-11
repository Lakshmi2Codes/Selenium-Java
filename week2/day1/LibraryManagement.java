package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		
		Library lib = new Library();
		
		String bookName = lib.addBook("Selinium Webdriver with Java Basics");
		
		System.out.println("Returned Book Title: " + bookName);
		
		lib.issueBook();

	}

}
