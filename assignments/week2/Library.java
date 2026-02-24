package assignments.week2;

public class Library {

	public static void main(String[] args) {
		
		Library libraryMethod = new Library();
		String returnedTitle = libraryMethod.addBook("Head First Java");
		System.out.println("Returned Book Title: " +returnedTitle);
		libraryMethod.issueBook();

	}
	
	
	public String addBook(String bookTitle) {
		
	System.out.println ("Book added Successfully");	
	return bookTitle;
	
		
	}
	
	public void issueBook() {
		
		System.out.println("Book Issued Successfully");
		
	}
	


}
