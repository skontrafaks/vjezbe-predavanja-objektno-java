package vjezbe.vjezbe3.zadatak3;

public class SedanCar extends Vehicle{
    String color;
    public SedanCar(String brand, String model, String color) {
        super(brand, model);
        this.color = color;
    }

    public void setDateProdSedan(String date){
        this.setProductionDate(date);

    }

    @Override
    public String toString() {
        return "SedanCar{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", vehID=" + vehID +
                ", productionDate=" + dateFormater.format(productionDate) +
                '}';
    }

    @Override
    public void vehInfo() {
        System.out.println(toString());
    }
}
