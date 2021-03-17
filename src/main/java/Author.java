import java.util.ArrayList;

public class Author {

	private String authorFirstName;
	private String authorLastName;
	private ArrayList<Book> compendium;

	public Author (String authorFirstName, String authorLastName) {
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
	}

	public Author (String authorFirstName, String authorLastName, ArrayList<Book> compendium) {
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
		this.compendium = compendium;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}

	public ArrayList<Book> getCompendium() {
		return compendium;
	}

	public void addBook (Book book) {
		compendium.add(book);
	}

	public void removeBook (Book book) {

	}

}
