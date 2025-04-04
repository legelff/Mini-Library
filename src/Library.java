import java.util.HashMap;
import java.util.Map;

public class Library {
    Map<Integer, titleAuthor> lib = new HashMap<>();



    static class titleAuthor {
        String title;
        String author;

        public titleAuthor(String title, String author) {
            this.author = author;
            this.title = title;
        }
    }
}
