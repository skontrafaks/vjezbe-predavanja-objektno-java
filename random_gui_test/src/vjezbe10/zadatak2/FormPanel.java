package vjezbe10.zadatak2;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class FormPanel extends JPanel implements ActionListener {

    private JTextField textVisinaKredita;
    private JTextField textGodina;
    private JComboBox<String> comboBox;
    private JRadioButton radioButtonMjesec;
    private JRadioButton radioButtonKvartal;
    private JButton prikazButton;
    private JButton calculateButton;
    private DefaultComboBoxModel<String> defaultComboBoxModel;
    private ButtonGroup buttonGroup;
    private FormPanelListener formPanelListener;

    public FormPanel() {

        setPreferredSize(new Dimension(MainFrame.WIDTH/2, MainFrame.HEIGHT));

        initComps();
        layoutComps();
        activateButtons();
    }

    public void setFormPanelListener(FormPanelListener formPanelListener) {
        this.formPanelListener = formPanelListener;
    }

    private void initComps() {
        textVisinaKredita = new JTextField();
        textGodina = new JTextField();
        comboBox = new JComboBox<>();

        radioButtonMjesec = new JRadioButton();
        radioButtonKvartal = new JRadioButton();

        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButtonMjesec);
        buttonGroup.add(radioButtonKvartal);

        prikazButton = new JButton("PRIKAZ");
        calculateButton = new JButton("IZRACUNAJ");
        defaultComboBoxModel = new DefaultComboBoxModel<>();
        buttonGroup = new ButtonGroup();

        comboBox.setModel(defaultComboBoxModel);
        String[] stopeKamata = {"5%", "6%", "7%", "8%", "9%", "10%", "11%"};
        defaultComboBoxModel.addAll(List.of(stopeKamata));
    }

    private void layoutComps() {
        setLayout(new MigLayout("insets 10, wrap", "[][][]", "[][][]"));
        add(new JLabel("VISINA KREDITA: "), "cell 0 0, align right");
        add(textVisinaKredita, "cell 1 0, growx");
        add(new JLabel("GODINA OTPLATE: "), "cell 0 1");
        add(textGodina, "cell 1 1, gapbottom 15, growx");
        add(new JLabel("KAMATNA STOPA: "), "cell 1 2");
        add(comboBox, "cell 1 3, align center, gapbottom 15");
        add(radioButtonMjesec, "cell 0 4, align right");
        add(new JLabel("MJESECNO"), "cell 1 4");
        add(radioButtonKvartal, "cell 0 5, align right");
        add(new JLabel("KVARTALNO"), "cell 1 5, wrap");
        add(new Box(0),"cell 0 6, gapbottom 120");
        add(prikazButton, "cell 0 7, grow");
        add(calculateButton, "cell 2 7, grow");

    }

    private void activateButtons() {
        prikazButton.addActionListener(this);
        calculateButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (textVisinaKredita.getText().isEmpty() || textGodina.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Unesite podatke!");
            return;
        }

        // check if textVisinaKredita and textGodina are numbers
        try {
            Float.parseFloat(textVisinaKredita.getText());
            Integer.parseInt(textGodina.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Unesite brojeve!");
            return;
        }

        float kredit = Float.parseFloat(textVisinaKredita.getText());
        int godina = Integer.parseInt(textGodina.getText());

        String kamataString = (String) comboBox.getSelectedItem();
        String numberOnlyOfKamata= kamataString.replaceAll("[^0-9]", "");
        float stopaKamateFloat = Float.parseFloat(numberOnlyOfKamata);

        boolean mjesečno = radioButtonMjesec.isSelected();
        boolean kvartalno = radioButtonKvartal.isSelected();

        Calculation calculation = new Calculation(kredit, stopaKamateFloat, godina, mjesečno, kvartalno);

        if (e.getSource() == prikazButton) {

            formPanelListener.prikažiTekst(calculation.toString());

        } else if (e.getSource() == calculateButton) {

            formPanelListener.izračunajKredit(calculation.getTotal());

        }
    }
}
