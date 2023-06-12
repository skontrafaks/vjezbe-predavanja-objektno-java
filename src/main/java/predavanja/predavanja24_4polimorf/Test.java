package predavanja.predavanja24_4polimorf;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Device smart = new SmartTV();
        smart.powerOnDevice(20);
        smart.powerOnDevice(30, "yourMom");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Tiger());
        animals.add(new Tiger());
        animals.add(new Fluffy());
        Tiger tigerinjo = new Tiger();
        producingAnimSounds(animals);
        tigerinjo.huntPrey();
    }

    private static void producingAnimSounds (ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            animal.produceSound();
        }
    }
}
