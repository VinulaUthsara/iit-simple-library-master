package services;

import dto.Book;
import dto.Dvd;

import java.util.List;

public interface LibraryManager {

    void addBook(int isbn,String title,String sector,String publishedDate,String author,String publisher,int numberOfPages);


    List<Book> getAllBooks();

    void addDvd(int isbn, String title, String sector, String publisheddate, String availablelang, String availablesub,String producer,String actor);

    List<Dvd> getAllDvds();
}
