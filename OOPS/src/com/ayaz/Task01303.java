package com.ayaz;

class Book {
    String title;
    String author;
    boolean isIssued;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    // Issue the book
    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    // Return the book
    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    // Display status
    void displayStatus() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + (isIssued ? "Issued" : "Available"));
    }

    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho");

        b1.displayStatus();
        b1.issueBook();
        b1.displayStatus();
        b1.returnBook();
        b1.displayStatus();
    }
}





public class Task01303 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling");

    }
}
