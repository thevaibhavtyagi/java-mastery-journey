// package Inherit_Polym;

// BASIC OVERRIDING + POLYMORPHISM -------------
class Employee {
    void calculateSalary() {
        System.out.println("Base salary: 30000");
    }
}

class Manager extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Manager salary: 80000");
    }
}

class Developer extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Developer salary: 60000");
    }
}
public class MO_practice2 {
    public static void main(String[] args) {
        Employee[] e = {
            new Manager(),
            new Developer()
        };

        for(Employee em : e) {
            em.calculateSalary();
        }

    }
}
