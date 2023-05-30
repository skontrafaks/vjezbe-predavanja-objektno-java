package predavanja.predavanja29_5gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBarPanel extends JPanel {

    private JButton clearButton;
    private JButton readFileButton;
    private ToolBarListener toolBarListener;

    public ToolBarPanel() {
        initComps();
        layoutComps();
        activateToolBar();
    }

    public void setToolBarListener(ToolBarListener toolBarListener) {
        this.toolBarListener = toolBarListener;
    }

    private void initComps() {
        clearButton = new JButton("Clear");
        readFileButton = new JButton("Read from file");
    }

    private void layoutComps() {
        add(clearButton);
        add(readFileButton);
    }

    public void activateToolBar() {
        if (toolBarListener != null) {
            clearButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ToolBarEvent toolBarEvent = new ToolBarEvent(this);
                    toolBarEvent.setClearClicked(true);
                    toolBarEvent.setReadClicked(false);
                    toolBarListener.clearButtonEventOccurred(toolBarEvent);
                }
            });

            readFileButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ToolBarEvent toolBarEvent = new ToolBarEvent(this);
                    toolBarEvent.setClearClicked(true);
                    toolBarEvent.setReadClicked(false);
                    toolBarListener.readFromFileButtonEventOccurred(toolBarEvent);
                }
            });
        }
    }
}
