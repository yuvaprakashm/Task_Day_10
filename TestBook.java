/*

DAY : 10
ASSIGNMENT NO : 09

Book and Author Classes (to be used once more) - A Fixed-length Array
of Objects as an Instance Variable. In the above exercise, the number of authors cannot be changed once a Book instance is
constructed. Suppose that we wish to allow the user to add more authors (which is really
unusual but presented here for academic purpose).
We shall remove the authors from the constructors, and add a new method called
addAuthor() to add the given Author instance to this Book.
We also need to pre-allocate an Author array, with a fixed length (says 5 - a book is written
by 1 to 5 authors), and use another instance variable numAuthors (int) to keep track of
the actual number of authors.

*/

package net.texala.main;

public class TestBook {
	public static void main(String[] args) {
		Author author1 = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
		Author author2 = new Author("Paul Tan", "Paul@nowhere.com", 'm');

		Book book1 = new Book("java", 499.85, 45);

		book1.getAuthors().add(author1);
		book1.getAuthors().add(author2);

		System.out.println("Book Name: " + book1.getName());
		System.out.println("Price: $" + book1.getPrice());
		System.out.println("Quantity in Stock: " + book1.getQtyInStock());
		System.out.println("Authors: ");
		for (Author author : book1.getAuthors()) {
			System.out.println("* " + author.getName());
		}

		boolean removed = book1.removeAuthorByName("Paul Tan");
		System.out.println("Author to remove: Paul Tan");

		if (removed) {
			System.out.println("Author removed successfully.");
		} else {
			System.out.println("Author not found or couldn't be removed.");
		}
	}
}
