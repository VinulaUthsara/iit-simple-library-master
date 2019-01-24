package models;

import io.ebean.Model;

import javax.persistence.*;


//generates the tables in database

@Entity
@Table(name = "dvds")
public class DVDModel {

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
//    private String borrowedDate;
//
//    @Column(name = "borrowedTime")
//    private String borrowedTime;
//
//
//    @Column(name="currentReader")
    // @ManyToOne
    // @JoinColumn(name = "reader", referencedColumnName = "id")
    private String reader;

    @Column(name = "availableLang")
    private String availableLang;

    @Column(name = "availableSub")
    private String availableSub;

    @Column(name = "producer")
    private String producer;

    @Column(name = "actor")
    private String actor;

    public DVDModel(int isbn, String title, String sector, String publishedDate,String availableLang, String availableSub, String producer, String actor) {
        this.isbn = isbn;
        this.title = title;
        this.sector = sector;
        this.publishedDate = publishedDate;
//        this.borrowedDate = borrowedDate;
//        this.borrowedTime = borrowedTime;
//        this.reader = reader;
        this.availableLang = availableLang;
        this.availableSub = availableSub;
        this.producer = producer;
        this.actor = actor;
    }

    public DVDModel() {

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

//    public String getBorrowedDate() {
//        return borrowedDate;
//    }
//
//    public void setBorrowedDate(String borrowedDate) {
//        this.borrowedDate = borrowedDate;
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
//    public String getReader() {
//        return reader;
//    }
//
//    public void setReader(String reader) {
//        this.reader = reader;
//    }

    public String getAvailableLang() {
        return availableLang;
    }

    public void setAvailableLang(String availableLang) {
        this.availableLang = availableLang;
    }

    public String getAvailableSub() {
        return availableSub;
    }

    public void setAvailableSub(String availableSub) {
        this.availableSub = availableSub;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
