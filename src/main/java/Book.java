
public class Book {
	
	String title;
	String author;
	boolean isAvailable;
	
	public Book(String title, String author){
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}

	//Getter methods
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
	//setter method for availability
	
	public void setAvailable(boolean available) {
		isAvailable = available;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
