package Inherit_Polym;

// CONSTRUCTOR CHAINING TRAP ---------------
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int rno;

    Student(String name, int age, int rno) {
        super(name, age);
        this.rno = rno;
    }
}
public class inPractice2 {
    public static void main(String[] args) {
        Student s = new Student("Vaibhav", 20, 1);
        
        System.out.println("Name is: " + s.name);
        System.out.println("Age is: " + s.age);
        System.out.println("Roll no. is: " + s.rno);

    }
}
