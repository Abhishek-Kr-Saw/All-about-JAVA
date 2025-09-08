package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] fruits = {"apple", "orange", "banana","papaya"};
        boolean isFound = false;
        String target ;

        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println(target + "found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println(target + " not found in the array");
        }

        scanner.close();
    }
}