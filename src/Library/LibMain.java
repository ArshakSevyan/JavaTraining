package Library;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created By Arshak on Dec, 2020
 */
public class LibMain {
    public static void main(String[] args) {
        ArrayList<String> authors =LibraryTestAPI.getAllAuthors();
        System.out.println(authors);

        HashSet<String> authorsNationality = LibraryTestAPI.getAllAuthorsNationality();
        System.out.println(authorsNationality);

        ArrayList<String> allBooks = LibraryTestAPI.getAllBooks();
        System.out.println(allBooks);

        LibraryTestAPI.givenAuthor();

        LibraryTestAPI.matchingStrAuthor();

        LibraryTestAPI.matchingStrBook();

        LibraryTestAPI.findByPrice();
    }
}
