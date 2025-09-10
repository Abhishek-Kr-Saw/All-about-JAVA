package OOPS.ToString;

public class Car {
    
    String name;
    String model;
    int year;
    String color;
    
    Car(String name,String model,int year,String color){
        this.name = name;
        this.model = model;
        this.year = year;
        this.color = color; 
    }

    public String toString(){
        return this.name + " "+this.model + " "+this.color +" was made in "+this.year; 
    }

}
