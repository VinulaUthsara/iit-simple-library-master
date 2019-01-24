package dto;

public class Dvd extends LibraryItem {


    //attributes relevant to DVD


    private String availablelang;
    private String availablesub;
    private String producer;
    private String actor;


    //DVD constructor with library item attributes inherited from libraryitem(abstract) super class


    public Dvd(int isbn, String title, String sector, String publishedDate, String availablelang, String availablesub, String producer, String actor) {
        super(isbn, title, sector, publishedDate);
        this.availablelang = availablelang;
        this.availablesub = availablesub;
        this.producer = producer;
        this.actor = actor;
    }


    //default book constructor


    public Dvd() {

    }

    public String getAvailablelang() {
        return availablelang;
    }

    public void setAvailablelang(String availablelang) {
        this.availablelang = availablelang;
    }

    public String getAvailablesub() {
        return availablesub;
    }

    public void setAvailablesub(String availablesub) {
        this.availablesub = availablesub;
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
