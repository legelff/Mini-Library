import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner to read values
        Scanner scn = new Scanner(System.in);

        // initialize library
        Library lib = new Library();

        // initial screen
        System.out.println("Welcome to Mini Library!");
        System.out.println();

        Initiate(scn, lib);
    }

    public static void Initiate(Scanner scn, Library lib) {
        System.out.println("Select one of the following actions:");
        System.out.println();
        System.out.println("Add a book [0]");
        System.out.println("Remove a book [1]");
        System.out.println("View all books [2]");
        System.out.println("Edit details of a book [3]");
        System.out.println("Exit library [4]");

        System.out.println();

        System.out.print("Your choice: ");
        int selection = scn.nextInt();
        scn.nextLine();
        System.out.println();

        switch (selection) {
            case 0:
                AddBook(scn, lib);
                break;
            case 1:
                RemoveBook(scn, lib);
                break;
            case 2:
                ViewAllBooks(scn, lib);
                break;
            case 3:
                UpdateBook(scn, lib);
                break;
            case 4:
                ExitLibrary();
//            default:
//                ExitLibrary(scn);
        }
    }

    public static void AddBook(Scanner scn, Library lib) {
        System.out.print("Title of the book: ");
        String title = scn.nextLine();
        System.out.print("Author of the book: ");
        String author = scn.nextLine();

        int id = lib.Add(title, author);

        System.out.println();
        System.out.printf("[%s - %s] has been added to the library with id: %s", title, author, id);
        System.out.println();

        System.out.println();

        Initiate(scn, lib);
    }

    public static void RemoveBook(Scanner scn, Library lib) {
        System.out.println("Library:");
        lib.View();

        System.out.print("ID of the book to delete (see table above): ");
        int id = scn.nextInt();
        scn.nextLine();
        System.out.println();

        lib.Remove(id);

        System.out.println("Book has been removed!");
        System.out.println();

        Initiate(scn, lib);
    }

    public static void ViewAllBooks(Scanner scn, Library lib) {
        lib.View();

        Initiate(scn, lib);
    }

    public static void UpdateBook(Scanner scn, Library lib) {
        System.out.println("Library:");
        lib.View();

        System.out.print("ID of the book to edit (see table above): ");
        int id = scn.nextInt();
        scn.nextLine();
        System.out.println();

        lib.Update(id, scn);

        System.out.println("Book has been updated!");
        System.out.println();

        Initiate(scn, lib);
    }

    public static void ExitLibrary() {
        System.out.println("Thanks for visiting!");
    }
}