import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner to read values
        Scanner scn = new Scanner(System.in);

        // initial screen
        System.out.println("Welcome to Mini Library!");
        System.out.println("Select one of the following actions:");
        System.out.println("Add a book [0]");
        System.out.println("Remove a book [1]");
        System.out.println("View all books [2]");
        System.out.println("Search for a book [3]");
        System.out.println("Exit library [4]");

        int selection = scn.nextInt();

        switch (selection) {
            case 0:
                AddBook();
                break;
            case 1:
                RemoveBook();
                break;
            case 2:
                ViewAllBooks();
                break;
            case 3:
                SearchBook();
                break;
            case 4:
                ExitLibrary();
        }
    }

    public static void AddBook() {

    }

    public static  void RemoveBook() {

    }

    public static void ViewAllBooks() {

    }

    public static void SearchBook() {

    }

    public static void ExitLibrary() {
        System.out.println("Thanks for visiting!");
    }
}