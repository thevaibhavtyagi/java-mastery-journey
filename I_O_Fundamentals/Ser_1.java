package I_O_Fundamentals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    double gpa;

    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", gpa=" + gpa + "}";
    }
}
public class Ser_1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Student s = new Student("Vaibhav", 21, 9.16);

        // try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
        //     oos.writeObject(s);
        //     System.out.println("Object is serialized: " + s);
        // }

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("student.ser"))) {

            // readObject() returns Object — must cast to actual type
            Student s = (Student) ois.readObject();
            System.out.println("Object deserialized: " + s);
        }

    }
}
