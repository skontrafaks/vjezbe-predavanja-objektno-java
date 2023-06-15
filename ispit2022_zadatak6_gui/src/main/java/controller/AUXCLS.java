package controller;

import model.User;

import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.TreeSet;


public class AUXCLS {

    public static TreeSet<User> users = new TreeSet<>();
    public static LinkedHashMap<String, String> inbox = new LinkedHashMap<>();

    public static boolean addUser(User user) {
        inbox.put(user.getMail(), "");
        boolean flag = users.add(user);
        return flag;
    }

    public static void removeUser(User user) {
        users.remove(user);
    }

    public static void addMail(String userMail, String mail) {
        String allMail = inbox.get(userMail).concat(mail) + "\n";
        inbox.put(userMail, allMail);
    }

    public static void addToComboBox(JComboBox<String> comboBox) {
        for (User user : users) {
            comboBox.addItem(user.getMail());
        }
    }
}
