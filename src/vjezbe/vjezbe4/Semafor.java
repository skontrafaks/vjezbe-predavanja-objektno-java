package vjezbe.vjezbe4;

public class Semafor {

    private String zeleno = "1";
    private String zuto = "2";
    private String crveno = "0";

    public String bojaNaSemaforu(String broj) {
        String boja = "Ovaj broj ne vraca boju";
        if (broj == "0") {
            boja = "crvena";
        } else if (broj == "1") {
            boja = "zelena";
        } else if (broj == "2") {
            boja = "zuta";
        }
        return boja;
    }

    public String getZeleno() {
        return zeleno;
    }

    public void setZeleno(String zeleno) {
        this.zeleno = zeleno;
    }

    public String getZuto() {
        return zuto;
    }

    public void setZuto(String zuto) {
        this.zuto = zuto;
    }

    public String getCrveno() {
        return crveno;
    }

    public void setCrveno(String crveno) {
        this.crveno = crveno;
    }

    @Override
    public String toString() {
        return "Semafor{" +
                "zeleno='" + zeleno + '\'' +
                ", zuto='" + zuto + '\'' +
                ", crveno='" + crveno + '\'' +
                '}';
    }
}
