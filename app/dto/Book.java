package dto;

import java.util.List;


//Book class inherits values from the abstract class LibraryItem

public class Book extends LibraryItem {

    //attributes relevant to book

    private String author;
    String publisher;
    int numberOfPages;


    //book constructor with library item attributes inherited from libraryitem(abstract) super class


    public Book(int isbn, String title, String sector, String publishedDate, String author, String publisher, int numberOfPages) {
        super(isbn, title, sector, publishedDate);
        this.author = author;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
    }

    //default book constructor

    public Book() {

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    /* private List<Author> authors;

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }*/
}
