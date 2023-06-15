package model;

import java.util.Comparator;
import java.util.Objects;

public class User implements Comparable<User> {

    private String username;
    private String mail;
    private int id;

    public User(String username, String mail, int id) {
        this.username = username;
        this.mail = mail;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getMail() {
        return mail;
    }

    public int getId() {
        return id;
    }


    @Override
    public int compareTo(User o) {
        if (this.id < o.id) {
            return -1;
        } else if (this.id > o.id) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        User otherUser = (User) obj;
        return id == otherUser.id;
    }
}
