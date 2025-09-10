

public class Main {
    public static void main(String[] args) {
        
        Parent parent = new Parent("Saloni","Singh");
        parent.showName();
        System.out.println();
        Student student = new Student("Abhishek","Saw",9.4);
        student.showName();
        student.showGPA();
        System.out.println();
        Employee emp = new Employee("Shristi", "Singh", 45000);
        emp.showName();
        emp.showSalary();
    }
}

/*
    PS D:\Study\Java> javac SuperKeyword\*.java
    PS D:\Study\Java> java SuperKeyword.Main
 */
