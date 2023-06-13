package vjezbe.vjezbe9.zadatak3;

import java.io.Serializable;
import java.util.ArrayList;

public class SpaceScientist implements Serializable {
    private String name;
    private int id;
    private static int cntID = 10;
    private String specialization;
    private ArrayList<String> equipment;
    private transient Species species;

    public SpaceScientist(String name, String specialization, ArrayList<String> equipment, Species species) {
        this.name = name;
        this.id = cntID++;
        this.specialization = specialization;
        this.equipment = equipment;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSpecialization() {
        return specialization;
    }

    public ArrayList<String> getEquipment() {
        return equipment;
    }

    public Species getSpecies() {
        return species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setEquipment(ArrayList<String> equipment) {
        this.equipment = equipment;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }
}
