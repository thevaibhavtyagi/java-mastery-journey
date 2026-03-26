// package Inherit_Polym;

// WORKING AND UNDERSTANDING MORE ON SUPER() ---------
class Annimal {
    String name;

    Annimal(String name) {
        this.name = name;
    }

    void describe() {
        System.out.println("I am an animal named: " + name);
    }
}

class Doog extends Annimal {
    String breed;

    Doog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    void describe() {
        super.describe();
        System.out.println("I am a " + breed + " dog");
    }

}
public class second {
    public static void main(String[] args) {
        Doog d = new Doog("Bruno", "Labrador");
        d.describe();
    }
}
