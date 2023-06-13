package vjezbe.vjezbe9.zadatak3;

public enum Species {
    HUMAN("Human"),
    WOOKIEE("Wookiee"),
    TWI_LEK("Twi'lek"),
    DROID("Droid"),
    MON_CALAMARIAN("Mon Calamarian"),
    HUTT("Hutt"),
    EWOK("Ewok"),
    JAWA("Jawa");

    private final String speciesName;

    Species(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getSpeciesName() {
        return speciesName;
    }
}

