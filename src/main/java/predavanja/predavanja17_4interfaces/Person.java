package predavanja.predavanja17_4interfaces;

public abstract class Person {

    protected String name;
    protected String occupation;
    protected int age;

    protected Person(String name, String occupation, int age){
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    protected abstract void provideExplanation();
    protected  void takeTaxi(){
        System.out.println(getClass().getSimpleName() + " can take taxi for a ride...");
    }
}
