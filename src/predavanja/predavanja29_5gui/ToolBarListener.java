package predavanja.predavanja29_5gui;

import java.util.EventListener;

public interface ToolBarListener extends EventListener {

    void clearButtonEventOccurred(ToolBarEvent tbe);

    void readFromFileButtonEventOccurred(ToolBarEvent tbe);

}
