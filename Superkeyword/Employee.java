
public class Employee extends Parent {
    
    double salary;

    Employee(String first, String last, double salary){
        super(first,last);
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(this.first+"'s got "+salary);
    }
}
