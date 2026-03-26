package Inherit_Polym;

// class Base {
//     public void display() {
//         System.out.println("Base display");
//     }

//     static void staticShow() {
//         System.out.println("Base static");
//     }
// }

// class Derived extends Base {
//     @Override
//     private void display() {
//         System.out.println("Derived display");
//     }

//     @Override
//     static void staticShow() {
//         System.out.println("Derived static");
//     }
// }

class Base {
    public void display() {
        System.out.println("Base display");
    }

    void staticShow() {
        System.out.println("Base static");
    }
}

class Derived extends Base {
    @Override
    public void display() {
        System.out.println("Derived display");
    }

    @Override
    void staticShow() {
        System.out.println("Derived static");
    }
}

public class MO_practice4 {
    public static void main(String[] args) {
        Base[] b = {
            new Derived()
        };

        for(Base bs : b) {
            bs.display();
            bs.staticShow();
        }
    }
}
