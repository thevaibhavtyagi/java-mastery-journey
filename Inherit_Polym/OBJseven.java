// package Inherit_Polym;

// BASICS OF equals() AND IT'S WORKING ---------

class Cat {
    String name;
    int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if(obj == null) {
            return false;
        }

        if(getClass() != obj.getClass()) {
            return false;
        }

        Cat other = (Cat) obj;
        return this.age == other.age && this.name.equals(other.name);
    }
}
public class OBJseven {
    public static void main(String[] args) {
        Cat c1 = new Cat("Cette", 3);
        Cat c2 = new Cat("Cette", 3);

        Cat c3 = c1;

        Cat c4 = new Cat("Meow", 4);

        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
        System.out.println(c2.equals(c4)); // false
    }
    
}
