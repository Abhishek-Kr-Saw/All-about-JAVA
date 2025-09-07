package Loop;
import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        char symbol;

        System.out.print("Enter the number of rows you want : ");
        rows = sc.nextInt();

        System.out.print("Enter the symbol you want : ");
        symbol = sc.next().charAt(0);

        for(int i=1;i<=rows;i++){
            for(int j=0;j<i;j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
