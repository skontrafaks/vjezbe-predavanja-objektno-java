package stari_ispiti.ispit18_6_2021.zadatak3;

public class Book {

    private int id;
    private static int cntID = 200;
    private String title;
    Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
        this.id = cntID++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
}
