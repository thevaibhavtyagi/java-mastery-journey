package AbstractC_Interface;

// default - INTERFACE METHOD WITH BODY ------------

interface Greeter {
    void greet(String name);

    //default method has a body
    default void greetPolitely(String name) {
        System.out.println("Greetings - " + name);
    }
}

class FormalGreeter implements Greeter {
    @Override
    public void greet(String name) {
        System.out.println("Hello " + name);
    } 
}

class CasualGreeter implements Greeter {
    @Override
    public void greet(String name) {
        System.out.println("Hey " + name + "!!");
    }

    @Override
    public void greetPolitely(String name) {
        System.out.println("Namaste " + name + "!!");
    }
}

public class default1 {
    public static void main(String[] args) {
        Greeter f = new FormalGreeter();
        Greeter c = new CasualGreeter();

        f.greet("Vaibhav");
        f.greetPolitely("Vaibhav ji");

        c.greet("Raj");
        c.greetPolitely("Alex");
    }
}
