package Nested_Classes;

import Nested_Classes.Demo.Greeting;

// AC - An anonymous class is a local class that is defined and instantiated in a single expression, with no name.

// FORM 1 -- IMPLEMENTING AN INTERFACE ----------
class Demo {
    interface Greeting {
        void greet(String name);

    }
}
public class AC_first {
    public static void main(String[] args) {
        Greeting formal = new Greeting() {
            @Override
            public void greet(String name) {
                System.out.println("Good morning, " + name + ". Welcome.");
            }
        };

        Greeting casual = new Greeting() {
            @Override
            public void greet(String name) {
                System.out.println("Hey " + name + "! What's up?");
            }
        };

        formal.greet("Vaibhav");
        casual.greet("Vaibhav");
    }
}
