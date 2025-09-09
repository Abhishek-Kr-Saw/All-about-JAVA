public class Main {
    public static void main(String[] args) {

        // static = Modifies a variable or method belong to the class,
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources.

        Friend f1 = new Friend("Abhishek");
        Friend f2= new Friend("Abhijit");
        Friend f3 = new Friend("Piyush");

        Friend.showFriends();
    }
}
