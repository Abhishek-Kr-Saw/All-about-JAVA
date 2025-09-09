package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {

        // Inheritance = One class inherits the attributes and methods
        //                         from another class.
        //                         Child <- Parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        dog.speak();
        cat.speak();

        dog.eat();
        cat.eat();
        plant.photosynthesize();

        System.out.println(dog.isAlive);

    }
}

/*  To run : 
    PS D:\Study\Java>  javac OOPS\Inheritance\*.java
    PS D:\Study\Java>  java OOPS.Inheritance.Main
 */
