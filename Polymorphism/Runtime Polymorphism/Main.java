class Animal{
    void sound(){
        System.out.println("Every animal have their own unique sound");
    }
}

class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{

    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}


public class Main {
    public static void main(String[] args) {

        //Runtime polymorphism happens when a parent class reference variable points to a child 
        //class object, and the method to be executed is decided at runtime (not at compile-time).


        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
    }
}
