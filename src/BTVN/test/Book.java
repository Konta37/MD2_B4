package BTVN.test;

import java.util.Scanner;

public class Book {
    private String bookID;
    private String bookName;
    private double bookPrice;
    //nha xuat ban
    private String bookPublisher;
    private String bookAuthor;
    private String bookDescription;
    private boolean bookStatus;

    public Book() {}
    public Book(String bookid, String bookName, double bookPrice, String bookPublisher, String bookAuthor, String bookDescription, boolean bookStatus) {}

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    public void inputData(Scanner sc){
        System.out.println("Enter book ID:");
        this.bookID = sc.nextLine();
        System.out.println("Enter book name:");
        this.bookName = sc.nextLine();
        System.out.println("Enter book price:");
        this.bookPrice = Double.parseDouble(sc.nextLine());
        System.out.println("Enter book publisher:");
        this.bookPublisher = sc.nextLine();
        System.out.println("Enter book author:");
        this.bookAuthor = sc.nextLine();
        System.out.println("Enter book description:");
        this.bookDescription = sc.nextLine();
        System.out.println("Enter book status:");
        this.bookStatus = sc.nextBoolean();
    }
    public void displayData(){
        System.out.printf("Book id: %s\n name: %s\n price: %s\n publisher: %s\n author: %s\n description: %s\n status: %s\n", bookID,bookName,bookPrice,bookPublisher,bookAuthor,bookDescription,bookStatus? "Yes" : "No");
    }
}
