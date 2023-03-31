package labos.labos1;

public class CLS_FUND {

    private final int id;
    private static int idCounter = 100;
    private String userName;

    public CLS_FUND(String userName) {
        this.userName = userName;
        this.id = idCounter;
        idCounter++;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "[ CLS_FUND | userName=" + userName + ", id =" + id + " ]";
    }

    public static void clsData(){
        System.out.println("Cnt id is: " + idCounter);
    }

    public static boolean checkEquality(CLS_FUND prvi, CLS_FUND drugi){
        return prvi.equals(drugi);
    }
}
