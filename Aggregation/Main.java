package Aggregation;

public class Main {
    public static void main(String[] args) {
        
        // Aggregation = Represents a "has-a" relationship between objects.
        //               One object contains another object as part of its structure,
        //               but the contained object/s can exist independently.

        Book b1 = new Book("The Fellow of the Ring", 423);
        Book b2 = new Book("The Two Towers", 352);
        Book b3 = new Book("The Return of the King", 416);

        Book[] books = {b1,b2,b3};

        for(Book book:books){
            System.out.println(book.displayInfo());
        }

        System.out.println();

        Library library = new Library("NYC Public Library", 1897, books);

        library.displayLibraryInfo();

    }
}
