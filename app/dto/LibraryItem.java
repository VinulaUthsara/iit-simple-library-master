package dto;

public abstract class LibraryItem {

    //attributes which will be inherited by library items

    private int isbn;
    private String title;
    private String sector;
    private String publishedDate;
//    private String borrowedDate;
//    private String borrowedTime;
//    private String reader;

    //Constructor of Library item

    public LibraryItem(int isbn, String title, String sector, String publishedDate) {
        this.isbn = isbn;
        this.title = title;
        this.sector = sector;
        this.publishedDate = publishedDate;
//        this.borrowedDate = borrowedDate;
//        this.borrowedTime = borrowedTime;
//        this.reader = reader;
    }


    //Default constructor of Library item


    public LibraryItem() {

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
}
