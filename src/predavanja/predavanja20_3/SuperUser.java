package predavanja.predavanja20_3;

public class SuperUser extends User{


    public SuperUser(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void instantMsgFromUser(String msg) {
        System.out.println("This is a super message: ");
        System.out.println(msg);
    }
}
