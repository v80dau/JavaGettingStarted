import java.time.LocalDate;
import java.util.ArrayList;

public class Book {

	private String title;
	private String isbn;
	private LocalDate datePublished;
	private ArrayList<Author> authorList;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public LocalDate getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(LocalDate datePublished) {
		this.datePublished = datePublished;
	}

	public ArrayList<Author> getAuthorList() {
		return authorList;
	}

	public void addAuthor (Author author) {
		authorList.add(author);
	}

	public void removeAuthor (Author author) {

	}

}
