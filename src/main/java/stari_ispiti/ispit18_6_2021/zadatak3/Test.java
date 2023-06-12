package stari_ispiti.ispit18_6_2021.zadatak3;

public class Test {

    public static void main(String[] args) {
        Author Miroslav = new Author("Krleža");
        Author August = new Author("Šenoa");
        Author Antun = new Author("Matoš");

        Book knjiga1 = new Book("Knjiga1", Miroslav);
        Book knjiga2 = new Book("Knjiga2", Miroslav);
        Book knjiga3 = new Book("Knjiga3", Miroslav);

        Book knjiga4 = new Book("Knjiga4", August);
        Book knjiga5 = new Book("Knjiga5", August);
        Book knjiga6 = new Book("Knjiga6", August);

        Book knjiga7 = new Book("Knjiga7", Antun);
        Book knjiga8 = new Book("Knjiga8", Antun);
        Book knjiga9 = new Book("Knjiga9", Antun);

        Books books = new Books();

        books.addNewBook(knjiga1);
        books.addNewBook(knjiga2);
        books.addNewBook(knjiga3);
        books.addNewBook(knjiga4);
        books.addNewBook(knjiga5);
        books.addNewBook(knjiga6);
        books.addNewBook(knjiga7);
        books.addNewBook(knjiga8);
        books.addNewBook(knjiga9);

        books.listAllBooks(Miroslav);
        books.listAllBooks(August);
        books.listAllBooks(Antun);
    }

}
