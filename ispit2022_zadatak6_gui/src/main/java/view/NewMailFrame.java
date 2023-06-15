package view;

import com.formdev.flatlaf.FlatDarkLaf;
import controller.AUXCLS;
import model.User;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewMailFrame extends JFrame implements ActionListener {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private JTextField fromTextField;
    private JComboBox<String> toComboBox;
    private JTextArea messageTextArea;
    private JButton sendButton;
    private JScrollPane messageScrollPane;

    public NewMailFrame(String fromText) {
        setTitle("New mail");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        initiliazeComponents(fromText);
        layoutComponents();
        activateComponents();
    }

    private void initiliazeComponents(String fromText) {
        fromTextField = new JTextField();
        fromTextField.setEditable(false);
        fromTextField.setText(fromText);

        toComboBox = new JComboBox<>();
        for (User user : AUXCLS.users) {
            if (!user.getMail().equals(fromText)) {
                toComboBox.addItem(user.getMail());
            }
        }

        messageTextArea = new JTextArea();
        messageScrollPane = new JScrollPane(messageTextArea);
        messageScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sendButton = new JButton("Send");
    }

    private void layoutComponents() {
        setLayout(new MigLayout("center, insets 10 10 10 10, gapy 3%"));
        add(new JLabel("From:"), "align right");
        add(fromTextField, "wrap");
        add(new JLabel("To:"), "align right");
        add(toComboBox, "wrap");
        add(messageScrollPane, "width 100%, height 60%, span, wrap");
        add(sendButton, "span 2, align center");
    }

    private void activateComponents() {
        sendButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sendButton) {
            
            String message = messageTextArea.getText();
            String toUserMail = toComboBox.getSelectedItem().toString();
            String fromUserMail = fromTextField.getText();

            AUXCLS.addMail(toUserMail, "FROM:" + fromUserMail + " - " + message);
            AUXCLS.addMail(fromUserMail, "TO: " + toUserMail + " - " + message);

            JOptionPane.showMessageDialog(this, "Mail sent successfully!");
            dispose();
        }
    }
}
