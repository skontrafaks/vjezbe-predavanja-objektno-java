package stari_ispiti.ispit18_6_2021.zadatak3;

public class Author {

    private int id;
    private static int cntID = 100;
    private String name;

    public Author(String name) {
        this.name = name;
        this.id = cntID++;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
