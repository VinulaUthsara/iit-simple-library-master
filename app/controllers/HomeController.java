package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import dto.Book;
import dto.Dvd;
import io.ebean.Ebean;
import models.BookModel;
import models.DVDModel;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.LibraryManager;
import services.WestminsterLibraryManager;

import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    LibraryManager libraryManager = new WestminsterLibraryManager();

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {

        List<Book> books = libraryManager.getAllBooks();

        return ok(Json.toJson(books));
    }


    public Result index2(){

        List<Dvd> dvds = libraryManager.getAllDvds();

        return ok(Json.toJson(dvds));



    }





    //returning items in books List


    public Result getAllBooks() {

        List<Book> books = libraryManager.getAllBooks();

        return ok(Json.toJson(books));
    }





    //returning items in dvds List


    public Result getAllDvds() {

        List<Dvd> dvds = libraryManager.getAllDvds();

        return ok(Json.toJson(dvds));
    }









    public Result addBook() {



        JsonNode body = request().body().asJson();


        //getting data from body of angular and assigning to play variables

        int isbn = body.get("isbn").asInt();
        String title = body.get("title").asText();
        String sector = body.get("sector").asText();
        String publishedDate = body.get("publishedDate").asText();
//        String borrowedDate = body.get("borrowedDate").asText();
//        String borrowedTime = body.get("borrowedTime").asText();
//        String currentReader = body.get("currentReader").asText();
        String author = body.get("author").asText();
        String publisher = body.get("publisher").asText();
        int numberOfPages = body.get("numberOfPages").asInt();




        BookModel book=new BookModel(isbn,title,sector,publishedDate,author,publisher,numberOfPages);


        Ebean.save(book);



        List<BookModel> books = Ebean.find(BookModel.class).findList();
        return ok(Json.toJson("Add book success"));


    }




    public Result addDvd() {

        JsonNode body = request().body().asJson();
        System.out.println(body);


        //getting data from body of angular and assigning to play variables

        int isbn = body.get("isbn").asInt();
        String title = body.get("title").asText();
        String sector = body.get("sector").asText();
        String publishedDate = body.get("publishedDate").asText();
//        String borroweddate = body.get("borrowedDate").asText();
//        String borrowedTime = body.get("borrowedTime").asText();
//        String reader = body.get("currentReader").asText();
        String availablelang = body.get("availableLang").asText();
        String availablesub = body.get("availableSub").asText();
        String producer = body.get("producer").asText();
        String actor = body.get("actor").asText();

        DVDModel dvd=new DVDModel(isbn,title,sector, publishedDate, availablelang, availablesub,producer, actor);

        // Dvd dvd = new Dvd();
       /* dvd.setIsbn(isbn);
        dvd.setTitle(title);
        dvd.setSector(sector);
        dvd.setPublisheddate(publisheddate);
        dvd.setBorroweddate(borroweddate);
        dvd.setAvailablelang(availablelang);
        dvd.setAvailablesub(availablesub);
        dvd.setProducer(producer);
        dvd.setActor(actor);
*/


        Ebean.save(dvd);



        List<DVDModel> dvds = Ebean.find(DVDModel.class).findList();
        return ok(Json.toJson("Add DVD success"));



    }


    public Result deleteBook(Integer isbn)
    {

        BookModel b=new BookModel();
        b.setIsbn(isbn);
        Ebean.delete(b);
        return ok(Json.toJson("Delete Book Success"));
    }


    public Result deleteDvd(Integer isbn)
    {
        DVDModel  dvd = new DVDModel();
        dvd.setIsbn(isbn);
        Ebean.delete(dvd);
        return ok(Json.toJson("Delete DVD Success"));
    }









}
