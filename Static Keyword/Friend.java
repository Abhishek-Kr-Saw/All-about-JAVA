
public class Friend {

    static int numOfFriend;
    String name;

    Friend(String name){
        this.name = name;
        numOfFriend++;
    }

    static void showFriends(){
        
        System.out.println("You have "+numOfFriend+" friends");
    }
}
