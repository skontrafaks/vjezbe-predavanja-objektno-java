package stari_ispiti.ispit18_6_2021.zadatak3;

import java.util.ArrayList;

public class Books {

    private ArrayList<Book> books = new ArrayList<>();

    public void addNewBook(Book book) {
        books.add(book);
    }

    public void listAllBooks(Author author) {
        System.out.println("Books of "+ author);
        for (Book book : books) {
            if (book.author.equals(author)) {
                System.out.println(book);
            }
        }
        System.out.println("\n");

    }
}
