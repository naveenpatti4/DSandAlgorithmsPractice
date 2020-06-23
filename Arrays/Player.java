
public class Player {


    public String name;
    public String type;


    public Player(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }



    public static void main(String[] args) {
        Wizard test = new Wizard("Naveen", "Knight");
        test.play();
    }
}

class Wizard extends Player {

    public Wizard(String name, String type) {
        super(name, type);
    }

    public void play(){
        System.out.println("I am a " + type);
    }

}
