import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library {
    Map<Integer, titleAuthor> lib;
    int idCount;

    public Library() {
        lib = new HashMap<>();
        idCount = 0;
    }

    public int Add(String title, String author) {
        lib.put(idCount, new titleAuthor(title, author));
        idCount++;

        return idCount - 1;
    }

    public void View() {
        System.out.println("ID\t" + "Title\t" + "Author");
        lib.forEach((key, value) -> {
            System.out.printf("%s\t%s\t%s", key, value.title, value.author);
            System.out.println();
        });
        System.out.println();
    }

    public void Remove(int id) {
        lib.remove(id);
    }

    public void Update(int id, Scanner scn) {
        System.out.println("Currently updating " + "[" + lib.get(id).title + " - " + lib.get(id).author + "] with ID [" + id + "]: ");
        System.out.println();
        System.out.print("Title [Enter to skip]: ");
        String title = scn.nextLine();
        System.out.print("Author [Enter to skip]: ");
        String author = scn.nextLine();

        String oldTitle = lib.get(id).title;
        String oldAuthor = lib.get(id).author;

        if (!title.isBlank() && !author.isBlank()) {
            lib.replace(id, new titleAuthor(title, author));
        }

        else if (!title.isBlank()) {
            lib.replace(id, new titleAuthor(title, oldAuthor));
        }

        else if (!author.isBlank()) {
            lib.replace(id, new titleAuthor(oldTitle, author));
        }

        System.out.println();
    }

    static class titleAuthor {
        String title;
        String author;

        public titleAuthor(String title, String author) {
            this.author = author;
            this.title = title;
        }
    }
}
