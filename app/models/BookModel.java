package models;

import javax.persistence.*;
import java.util.List;


//generates the tables in database
@Entity
@Table(name = "books")
public class BookModel {


    // primary key of table (@id) and coloumn names
    @Id
    @Column(name = "isbn")
    private int isbn;

    @Column(name = "title")
    private String title;

    @Column(name = "sector")
    private String sector;

    @Column(name = "publishedDate")
    private String publishedDate;

//    @Column(name = "borrowedDate")
//    private String borroweddate;
//
//    @Column(name = "borrowedTime")
//    private String borrowedTime;
//
//
//    @Column(name="currentReader")
//    private String currentReader;

    @Column(name="author")
    private String author;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "numberOfPages")
    private int numberOfPages;


    //constructor for book model

    public BookModel(int isbn, String title, String sector, String publishedDate,String author, String publisher, int numberOfPages) {
        this.isbn = isbn;
        this.title = title;
        this.sector = sector;
        this.publishedDate = publishedDate;
//        this.borroweddate = borroweddate;
//        this.borrowedTime = borrowedTime;
//        this.currentReader = currentReader;
        this.author = author;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
    }

    //default constructor

    public BookModel() {

    }


    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

//    public String getBorroweddate() {
//        return borroweddate;
//    }
//
//    public void setBorroweddate(String borroweddate) {
//        this.borroweddate = borroweddate;
//    }
//
//    public String getBorrowedTime() {
//        return borrowedTime;
//    }
//
//    public void setBorrowedTime(String borrowedTime) {
//        this.borrowedTime = borrowedTime;
//    }
//
//    public String getCurrentReader() {
//        return currentReader;
//    }
//
//    public void setCurrentReader(String currentReader) {
//        this.currentReader = currentReader;
//    }

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
}
