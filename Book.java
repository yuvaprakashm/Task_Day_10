package net.texala.main;

public class Book {
	private Author[] authors = new Author[5];
	private int numAuthors = 0;
	private String name;
	private double price;
	private int qtyInStock = 0;

	public Book(String name, double price, int qtyInStock) {
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public double getPrice() {
		return price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void addAuthor(Author author) {
		if (numAuthors < 5) {
			authors[numAuthors] = author;
			numAuthors++;
		} else {
			System.out.println("Cannot add more authors. Maximum limit reached.");
		}
	}

	public void addBook(String name, double price, int qtyInStock) {
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public String toString() {
		return "Book: " + name + ", Price: $" + price + ", Quantity in Stock: " + qtyInStock;
	}

	public void printAuthors() {
		for (int i = 0; i < numAuthors; i++) {
			System.out.println(authors[i]);
		}
	}
}
