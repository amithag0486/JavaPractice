
import java.util.*;

public class LibraySystem {
	
	List<Book> books = new ArrayList();
	
	public void addBook(Book b){
		if(b == null) {
			System.out.println("Cannot add an empty book");
			return;
		}
		books.add(b);
		System.out.println("Added book " + b.getTitle());
	}
	
	public List<Book> searchLibrary(String author){
		if (author == null) {
			System.out.println("Cannot Search by an an empty author");
	
		}
		
		List<Book> results = new ArrayList();
		 for (int i=0;i<books.size();i++) {
			 if (books.get(i).getAuthor().equalsIgnoreCase(author))
				 results.add(books.get(i));
		 }
		 
		 if (results.isEmpty()) {
	            System.out.println("No books found by author: " + author);
	        }
		
		return results;
		
	}
	
	public void checkoutBook(String title) {
		if (title == null) {
			System.out.println("Cannot checkout by an an empty title");
			return;
		}
		for(int i = 0; i < books.size();i++) {
			if(books.get(i).getTitle().equalsIgnoreCase(title)) {
				if(books.get(i).isAvailable == false) {
					System.out.println("Sorry the book " + title + "is already checked out" );
					return;
				} books.get(i).setAvailable(false);
				System.out.println("Checked out: " + title);
                return;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraySystem library = new LibraySystem();

	        // Create books
	        Book b1 = new Book("Clean Code", "Robert Martin");
	        Book b2 = new Book("The Clean Coder", "Robert Martin");
	        Book b3 = new Book("Effective Java", "Joshua Bloch");
	        Book b4 = new Book("Java Puzzlers", "Joshua Bloch");

	        // Add books to library
	        library.addBook(b1);
	        library.addBook(b2);
	        library.addBook(b3);
	        library.addBook(b4);

	        System.out.println("---");

	        // Search by author
	        System.out.println("Books by Robert Martin:");
	        List<Book> martinBooks = library.searchLibrary("Robert Martin");
	        for (Book b : martinBooks) {
	            System.out.println(b);
	        }

	        System.out.println("---");

	        // Checkout a book
	        library.checkoutBook("Clean Code");
	        library.checkoutBook("Clean Code"); // try again — already checked out

	        System.out.println("---");

	        // Search unknown author
	        library.searchLibrary("J.K. Rowling");
	}

}
