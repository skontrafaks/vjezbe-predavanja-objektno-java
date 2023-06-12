package labos.labos2;

public class Car {

    private String carName;
    private long odom;
    private int id;
    private static int cntID = 10;

    public Car(String carName){
        this.carName = carName;
        this.odom = 0;
        this.id = cntID++;

    }

    public void updateOdom(long odom){
        this.odom += odom;

    }

    public void carInfo(){
        System.out.println("Car name: " + carName + " | id: " + id +" | odometer: " + odom);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName=" + carName +
                ", id=" + id +
                '}';
    }
}