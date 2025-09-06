import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Enhanced switch = a cleaner alternative to multiple if-else statements
        // (Introduced in Java 14)

        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter the day of the week: ");
        String day = sc.nextLine(); 

        
        switch(day){
            // Multiple case labels grouped together with commas
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It is a weekday");

            // Grouping weekend days
            case "Saturday", "Sunday" ->
                    System.out.println("It is the weekend");

            // Default case if input doesn't match any of the above
            default -> System.out.println(day + " is not a day");
        }

        sc.close(); 
    }
}
