//Library Management System (mini demo)

import java.util.HashMap;
import java.util.Map;

class Book {
    String id, title;
    boolean issued;

    Book(String id, String t) {
        this.id = id;
        this.title = t;
    }
}

class Library {
    Map<String, Book> books = new HashMap<>();

    void add(Book b) {
        books.put(b.id, b);
    }

    boolean issue(String id) {
        Book b = books.get(id);
        if (b != null && !b.issued) {
            b.issued = true;
            return true;
        }
        return false;
    }

    void list() {
        books.values().forEach(b ->
            System.out.println(b.id + " : " + b.title + " : " + b.issued)
        );
    }
}

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.add(new Book("1", "Java Basics"));
        lib.add(new Book("2", "DSA"));

        lib.issue("1");
        lib.list();
    }
}
