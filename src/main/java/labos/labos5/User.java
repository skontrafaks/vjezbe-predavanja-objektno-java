package labos.labos5;

import java.io.Serializable;

public class User implements Serializable{

    private String userName;
    private String mail;
    private int id;
    private static int cnt = 100;

    public User(String userName, String mail){
        this.userName = userName;
        this.mail = mail;
        this.id = cnt;
        cnt += 10;
    }

    public int getId() {
        return id;
    }

    public void info(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", mail='" + mail + '\'' +
                ", id=" + id +
                '}';
    }
}
