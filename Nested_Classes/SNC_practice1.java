package Nested_Classes;

// PRACTICE 1 - ACCESSING PRIVATE OF OUTER --------
class Outer {
    private static int secret = 42;
    private int instanceData = 100;  //private non-static

    static class Inner {
        void show() {
            System.out.println("Secret: " + secret); 

            //to access non static in static class, make object

            Outer obj = new Outer();
            System.out.println("Instance Data: " + obj.instanceData); // it will work
        }
    }
}
public class SNC_practice1 {
    public static void main(String[] args) {
        Outer.Inner i = new Outer.Inner();
        i.show();
    }
    
}
