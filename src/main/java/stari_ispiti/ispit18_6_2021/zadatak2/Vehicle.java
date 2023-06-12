package stari_ispiti.ispit18_6_2021.zadatak2;

public abstract class Vehicle {

    protected int id;
    protected static int cntID = 1;

    public abstract void runEngine();
    public abstract void stopEngine();
    public abstract void getEnergy();
    public abstract void description();
    public abstract void move(String direction, double dist);

}
