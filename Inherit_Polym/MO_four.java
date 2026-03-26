// package Inherit_Polym;

// METHOD OVERRIDING --------
class Human {
    void gender() {
        System.out.println("Male or Female!");
    }
}

class Female extends Human {
    void gender() {
        System.out.println("Gneder is female");
    }
}

class Male extends Human {
    void gender() {
        System.out.println("Gneder is Male");
    }
}

public class MO_four {
    public static void main(String[] args) {
        Human h1 = new Female();
        Human h2 = new Male();

        h1.gender();
        h2.gender();
    }
}
