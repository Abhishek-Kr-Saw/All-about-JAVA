public class Main {
    public static void main(String[] args) {

        // Declare and initialize a String variable
        String name = "Abhishek";

        // Get the length of the string
        int length = name.length();

        // Get the character at index 0 (first character) or any index
        char letter = name.charAt(0);

        // Find the index of the first occurrence of a space
        int index = name.indexOf(" ");

        // Find the index of the last occurrence of the letter 'o'
        int lastIndex = name.lastIndexOf("o");

        // Convert the string to uppercase
        name = name.toUpperCase();

        // Convert the string to lowercase
        name = name.toLowerCase();

        // Remove leading and trailing spaces
        name = name.trim();

        // Replace all occurrences of 'o' with 'a'
        name = name.replace("o", "a");
        
        // Check if the string is empty
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello " + name);
        }

        // Check if the string contains a space
        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name DOESN'T contain any spaces");
        }

        // Check if the string equals "password" (ignoring case)
        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }
    }
}

