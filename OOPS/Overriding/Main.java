package OOPS.Overriding;

public class Main {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();

    }
}

/*
PS D:\Study\Java> javac OOPS\Overriding\*.java 
PS D:\Study\Java> java OOPS.Overriding.Main
 */