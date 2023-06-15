package view;

import controller.AUXCLS;
import model.User;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommunicationPanel extends JPanel implements ActionListener {

    private JComboBox<String> mailboxSelection;
    private JButton composeMailButton;
    private JButton listAllMailButton;

    public CommunicationPanel() {
        setBorder(BorderFactory.createTitledBorder("Communication"));

        initComponents();
        layoutComponents();
        activateComponents();

        readUsers();
    }

    private void initComponents() {
        mailboxSelection = new JComboBox<>();
        composeMailButton = new JButton("Compose Mail");
        listAllMailButton = new JButton("List All Mail");
    }

    private void layoutComponents() {
        setLayout(new MigLayout("insets 10 10 10 10, center, gapy 3%"));
        add(new JLabel("Select mailbox:"));
        add(mailboxSelection, "wrap, width 100");
        add(new JSeparator(), "height 100%, wrap");
        add(composeMailButton, "span 2, align center");
        add(listAllMailButton, "span 2, align center");
    }

    private void activateComponents() {
        composeMailButton.addActionListener(this);
        listAllMailButton.addActionListener(this);
    }

    public void updateMailBox(User user) {
        mailboxSelection.addItem(user.getMail());
    }

    private void readUsers() {
        for (User user : AUXCLS.users) {
            mailboxSelection.addItem(user.getMail());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == composeMailButton) {
            NewMailFrame newMailFrame = new NewMailFrame(mailboxSelection.getSelectedItem().toString());
        } else if (e.getSource() == listAllMailButton) {
            AllMailsFrame allMailsFrame = new AllMailsFrame();
        }
    }
}
