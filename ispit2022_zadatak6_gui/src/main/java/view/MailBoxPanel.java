package view;

import controller.AUXCLS;
import controller.MailBoxPanelListener;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.User;

public class MailBoxPanel extends JPanel implements ActionListener {

    JTextField usernameField;
    JTextField mailField;
    JTextField userIdField;
    JButton confirmButton;
    MailBoxPanelListener mailBoxPanelListener;

    public MailBoxPanel() {
        setBorder(BorderFactory.createTitledBorder("New Mailbox"));

        initComponents();
        layoutComponents();
        activateComponents();
    }

    public void setMailBoxPanelListener(MailBoxPanelListener mailBoxPanelListener) {
        this.mailBoxPanelListener = mailBoxPanelListener;
    }

    private void initComponents() {
        usernameField = new JTextField();
        usernameField.setColumns(15);
        mailField = new JTextField();
        mailField.setColumns(15);
        userIdField = new JTextField();
        userIdField.setColumns(15);
        confirmButton = new JButton("Confirm");
    }

    private void layoutComponents() {
        setLayout(new MigLayout("insets 10 10 10 10, center, gapy 3%"));
        add(new JLabel("Username:"));
        add(usernameField, "wrap");
        add(new JLabel("Mail:"), "align right");
        add(mailField, "wrap");
        add(new JLabel("User ID:"), "align right");
        add(userIdField, "wrap");
        add(new JSeparator(), "height 100%, wrap");
        add(confirmButton, "span 2, align center");
    }

    private void activateComponents() {
        confirmButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == confirmButton) {
            User user = new User(usernameField.getText(), mailField.getText(), Integer.parseInt(userIdField.getText()));
            boolean flag = AUXCLS.addUser(user);
            if (flag) {
                mailBoxPanelListener.addUserToMailbox(user);
            } else {
                JOptionPane.showMessageDialog(null, "User with that ID already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
