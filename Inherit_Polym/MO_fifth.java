// package Inherit_Polym;

// FUNCTION OVERRIDING WITH @Override ---------
class H {
    void gender() {
        System.out.println("Either male or female");
    }
}

class F extends H{
    @Override
    void gender() {
        System.out.println("Gender is female only!");
    }
}
public class MO_fifth {
    public static void main(String[] args) {
        H h = new F();
        h.gender();
    }
}
