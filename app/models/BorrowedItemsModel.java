package models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//generates the tables in database

@Entity
@Table(name = "BorrowedItems")
public class BorrowedItemsModel {


    // primary key of table (@id) and coloumn names
    @Id
    @Column(name = "isbn")
    private int isbn;

    @Column(name = "ReaderID")
    private String readerID;

    @Column(name = "BorrowedDate")
    private String borrowedDate;

    @Column(name = "BorrowedTime")
    private String borrowedTime;

    @Column(name = "ReturnedDate")
    private String ReturnedDate;

    //constructor for borroweditems model
    public BorrowedItemsModel(int isbn, String readerID, String borrowedDate, String borrowedTime, String returnedDate) {
        this.isbn = isbn;
        this.readerID = readerID;
        this.borrowedDate = borrowedDate;
        this.borrowedTime = borrowedTime;
        ReturnedDate = returnedDate;
    }

    //default constructor

    public BorrowedItemsModel() {
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getReaderID() {
        return readerID;
    }

    public void setReaderID(String readerID) {
        this.readerID = readerID;
    }

    public String getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(String borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public String getBorrowedTime() {
        return borrowedTime;
    }

    public void setBorrowedTime(String borrowedTime) {
        this.borrowedTime = borrowedTime;
    }

    public String getReturnedDate() {
        return ReturnedDate;
    }

    public void setReturnedDate(String returnedDate) {
        ReturnedDate = returnedDate;
    }
}
