import java.util.Scanner;
public class Book {
    public static void main(String[] args) {

//        Exercise
//        Write the java program that allow the user to enter details about a book and then
//        displays the information back to them. The information that required is title, author,
//        publication year, price and ISBN number.

        Scanner myObj = new Scanner(System.in);
        //user input book name
        System.out.println("Enter the name of the book");
        String bookName = myObj.nextLine();

        //user input book year
        System.out.println("Enter the publication year of the book " + bookName);
        String publicationYear = myObj.nextLine();

        //user input book author
        System.out.println("Enter the author of the book " + bookName);
        String authorName = myObj.nextLine();

        //user input book price
        System.out.println("Enter the price of the book " + bookName);
        double price = myObj.nextDouble();

        //user input book ISBN
        System.out.println("Enter the ISBN of the book " + bookName);
        long isbnNumber = myObj.nextLong();

        System.out.println("\nBook: " + bookName);
        System.out.println("Author: " + authorName);
        System.out.println("Year of Published: " + publicationYear);
        System.out.println("Price: RM" + price);
        System.out.println("ISBN: " + isbnNumber);

        myObj.close();

    }
}
