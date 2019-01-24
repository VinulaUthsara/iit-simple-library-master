package services;

import dto.Book;
import dto.Dvd;
import dto.Reader;
import io.ebean.Ebean;
import models.AuthorModel;
import models.BookModel;
import models.DVDModel;
import models.ReaderModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WestminsterLibraryManager implements LibraryManager {


    @Override
    public void addBook(int isbn, String title, String sector, String publishedDate,String author, String publisher, int numberOfPages) {
        BookModel book = new BookModel();

        book.setIsbn(isbn);
        book.setTitle(title);
        book.setSector(sector);
        book.setPublishedDate(publishedDate);
//        book.setBorroweddate(borrowedDate);
//        book.setBorrowedTime(borrowedTime);
//        book.setCurrentReader(currentReader);
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setNumberOfPages(numberOfPages);

        Ebean.save(book);

    }

    @Override
    public List<Book> getAllBooks() {
        List<BookModel> bookModels = Ebean.find(BookModel.class).findList();

        List<Book> books = new ArrayList<>();

        for (BookModel bookModel : bookModels) {
            Book book = getBookDTObyModel(bookModel);
            books.add(book);
        }

        return books;
    }

    private Book getBookDTObyModel(BookModel bookModel) {
        Book book = new Book();
        book.setIsbn(bookModel.getIsbn());
        book.setTitle(bookModel.getTitle());
        book.setSector(bookModel.getSector());
        book.setPublishedDate(bookModel.getPublishedDate());
//        book.setBorrowedTime(bookModel.getBorrowedTime());
//        book.setBorrowedTime(bookModel.getBorrowedTime());
//        book.setReader(bookModel.getCurrentReader());
        book.setAuthor(bookModel.getAuthor());
        book.setPublisher(bookModel.getPublisher());
        book.setNumberOfPages(bookModel.getNumberOfPages());


        //TODO: write a method to get author list.

        return book;
    }

    @Override
    public void addDvd(int isbn, String title, String sector, String publisheddate,String availablelang, String availablesub, String producer, String actor) {

        DVDModel dvd = new DVDModel();


        dvd.setIsbn(isbn);
        dvd.setTitle(title);
        dvd.setSector(sector);
        dvd.setPublishedDate(publisheddate);
        dvd.setAvailableLang(availablelang);
        dvd.setAvailableSub(availablesub);
        dvd.setProducer(producer);
        dvd.setActor(actor);



       /* ReaderModel reader = new ReaderModel();
        reader.setName(readerName);
*/
        // Ebean.save(reader);

        //  dvd.setreader(reader);

        Ebean.save(dvd);


    }


    @Override
    public List<Dvd> getAllDvds() {
        List<DVDModel> dvdModels = Ebean.find(DVDModel.class).findList();

        List<Dvd> dvds = new ArrayList<>();

        for (DVDModel dvdModel : dvdModels) {
            Dvd dvd = getDvdDTObyModel(dvdModel);
            dvds.add(dvd);
        }

        return dvds;
    }

    private Dvd getDvdDTObyModel(DVDModel dvdModel) {
        Dvd dvd = new Dvd();
        dvd.setTitle(dvdModel.getTitle());
        dvd.setIsbn(dvdModel.getIsbn());
        dvd.setSector(dvdModel.getSector());
        dvd.setPublishedDate(dvdModel.getPublishedDate());
//        dvd.setBorrowedDate(dvdModel.getBorrowedDate());
//        dvd.setBorrowedTime(dvdModel.getBorrowedTime());
//        dvd.setReader(dvdModel.getReader());
        dvd.setProducer(dvdModel.getProducer());
        dvd.setActor(dvdModel.getActor());
        dvd.setAvailablesub(dvdModel.getAvailableSub());
        dvd.setAvailablelang(dvdModel.getAvailableLang());


        //  Reader reader = getReaderDTObyModel(dvdModel.getreader());
        // dvd.setReader(reader);

        return dvd;



    }
}
