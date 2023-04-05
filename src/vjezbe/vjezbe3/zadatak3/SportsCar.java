package vjezbe.vjezbe3.zadatak3;

public class SportsCar extends Vehicle{

    private String color;

    public SportsCar(String brand, String model, String color) {
        super(model, brand);
        this.color = color;
    }

    @Override
    public void startVehicle() {
        super.startVehicle();
        System.out.println("Palim ovu sportsku 'mašinu'");
    }

    public void setSportCarProductionDate (String dateProd){
        super.setProductionDate(dateProd);
    }

    @Override
    public String toString() {

        String test = super.toString();

        return "SportsCar[" +
                "color='" + color + '\'' +
                ']' + test;
    }
}
