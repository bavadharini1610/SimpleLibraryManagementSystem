import java.util.HashMap;

public class Book {
    HashMap<Integer, String> books = new HashMap<>();

    void add(){
        books.put(11, "The fault in our stars");
        books.put(12, "The Wedding");
    }
}
