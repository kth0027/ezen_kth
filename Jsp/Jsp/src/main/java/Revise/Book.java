package Revise;

public class Book {
private String booktitle;
private String bookcontents;
private String price;


// 생성자
public Book() {
	// TODO Auto-generated constructor stub
}

public Book(String booktitle, String bookcontents, String price) {
	super();
	this.booktitle = booktitle;
	this.bookcontents = bookcontents;
	this.price = price;
}

// git / set

public String getBooktitle() {
	return booktitle;
}

public void setBooktitle(String booktitle) {
	this.booktitle = booktitle;
}

public String getBookcontents() {
	return bookcontents;
}

public void setBookcontents(String bookcontents) {
	this.bookcontents = bookcontents;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}




}
