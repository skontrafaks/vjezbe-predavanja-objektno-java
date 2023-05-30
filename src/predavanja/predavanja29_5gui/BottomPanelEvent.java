package predavanja.predavanja29_5gui;

import java.util.EventObject;

public class BottomPanelEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    private String buttonMsg;
    private String name;
    private String surname;
    private String programmingIn;
    public BottomPanelEvent(Object source, String msg, String name, String surname, String programmingIn) {
        super(source);
        this.buttonMsg = msg;
        this.name = name;
        this.surname = surname;
        this.programmingIn = programmingIn;
    }

    public String getButtonMsg() {
        return buttonMsg;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getProgrammingIn() {
        return programmingIn;
    }
}
