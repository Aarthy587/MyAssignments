package assignmentLibrary;

public class Library {
 String addBook(String bookTitle)
 {
	 System.out.println(bookTitle + ": Book added Successfully");
	return bookTitle;	 
	 	 
 }
 
 void issueBook()
 {
	 System.out.println("Book issued Successfully");
 }
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library book=new Library();
		book.addBook("Harry Potter Series");
		book.issueBook();


	}

}
