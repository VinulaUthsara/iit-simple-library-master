package dto;

public class Reader {


    //attributes relevant to Reader

    private int readerID;
    private String readerName;
    private String readerMobileNum;
    private String readerEmail;

    //Constructor for Reader


    public Reader(int readerID, String readerName, String readerMobileNum, String readerEmail) {
        this.readerID = readerID;
        this.readerName = readerName;
        this.readerMobileNum = readerMobileNum;
        this.readerEmail = readerEmail;
    }


    //Default constructor for Reader

    public Reader() {
    }





    public int getReaderID() {
        return readerID;
    }

    public void setReaderID(int readerID) {
        this.readerID = readerID;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public String getReaderMobileNum() {
        return readerMobileNum;
    }

    public void setReaderMobileNum(String readerMobileNum) {
        this.readerMobileNum = readerMobileNum;
    }

    public String getReaderEmail() {
        return readerEmail;
    }

    public void setReaderEmail(String readerEmail) {
        this.readerEmail = readerEmail;
    }
}
