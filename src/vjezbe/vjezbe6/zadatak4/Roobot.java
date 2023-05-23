package vjezbe.vjezbe6.zadatak4;

public class Roobot {

    private int id;
    private String description;

    public Roobot(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Roobot{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        boolean equal = false;
        if (this.hashCode() == obj.hashCode()) {
            equal = true;
        }
        return equal;
    }
}
