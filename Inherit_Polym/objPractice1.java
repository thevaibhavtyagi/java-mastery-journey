// package Inherit_Polym;

// // toString() + equals() - COMPLETE ------
// class Student {
//     String name;
//     int rno;
//     double cgpa;


//     Student(String name, int rno, double cgpa) {
//         this.name = name;
//         this.rno = rno;
//         this.cgpa = cgpa;
//     }

//     @Override
//     public String toString() {
//         return "Student{name'" + name + "', rollNo=" + rno + ", cgpa=" + cgpa + "}";
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj) return true;
//         if (obj == null) return false;

//         if (getClass() != obj.getClass()) return false;

//         Student other = (Student) obj;

//         return this.rno == other.rno;

//     }
// }
// public class objPractice1 {
//     public static void main(String[] args) {
//         Student s1 = new Student("Vaibhav", 1, 9.0);
//         Student s2 = new Student("Vibhu", 1, 9.16);
//         Student s3 = new Student("itsV", 2, 9.16);

//         System.out.println(s1);
//         System.out.println(s1.equals(s2));

//         System.out.println(s1.equals(s3));
//     }
// }
