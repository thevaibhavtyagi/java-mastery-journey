package Nested_Classes;

import Nested_Classes.University.Department;

// SIMPLE EXAMPLE OF STATIC NESTED CLASS --------
class University {
    private static String name = "MIT";
    private int ranking = 1;

    static class Department {
        private String deptName;

        Department(String deptName) {
            this.deptName = deptName;
        }

        void display() {
            System.out.println("University: " + name);

            System.out.println("Department: " + deptName);
        }
    }

}
public class first_SNC {
    public static void main(String[] args) {
        University.Department dept = new University.Department("Computer Science");

        dept.display();

        Department dept2 = new Department("CSE");
        dept2.display();
    }
    
}
