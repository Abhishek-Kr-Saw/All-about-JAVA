package OOPS.Constructor;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Abhishek",22,9.45);
        Student student2 = new Student("Abhijit",21,9.5);
        Student student3 = new Student("Piyush",23,9.6);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);

        student1.study();
    }
}
