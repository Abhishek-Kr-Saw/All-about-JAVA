;

public class Student extends Parent {
    
    double gpa;

    Student(String first, String last, double gpa){
        super(first,last);
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first+"'s got "+gpa);
    }

}
