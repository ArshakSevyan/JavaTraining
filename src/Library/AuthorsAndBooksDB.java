package Library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created By Arshak on Dec, 2020
 */
public class AuthorsAndBooksDB {

    static ArrayList<Books> books = new ArrayList<>();

    static {
        System.out.println("Initialisation books");
        Author dante = new Author("Dante Alighieri", "Italy");
        Author dumas = new Author("Alexandre Dumas", "French");
        Author pushkin = new Author("Alexander Pushkin", "Russian");
        Author christie = new Author("Agatha Christie", "United Kingdom");
        Author tumanyan = new Author("Hovhannes Tumanyan", "Armenia");
        Author milton = new Author("John Milton", "United Kingdom");
        Author werber = new Author("Bernard Werber", "French");
        Author aurelius = new Author("Marcus Aurelius", "Italy");
        Author homer = new Author("Homer", "Greece");
        Author doyle = new Author("Arthur Conan Doyle", "United Kingdom");

        Books divineComedy = new Books("Divine Comedy", dante, LocalDate.of(1320, 5, 8), 500);
        Books theCountOfMonteCristo = new Books("The Count of Monte Cristo", dumas, LocalDate.of(1844, 8, 8), 500);
        Books eugeneOnegin = new Books("Eugene Onegin", pushkin, LocalDate.of(1832, 10, 9), 400);
        Books murderOnTheOrientExpress = new Books("Murder on the Orient Express", christie, LocalDate.of(1934, 12, 4), 450);
        Books fairyTales = new Books("Fairy Tales", tumanyan, LocalDate.of(1923, 3, 7), 400);
        Books paradiseLost = new Books("Paradise Lost", milton, LocalDate.of(1667, 6, 4), 350);
        Books lempireDesAnges = new Books("L' empire des anges", werber, LocalDate.of(2000, 9, 4), 500);
        Books theThoughts = new Books("The Thoughts of the Emperor Marcus Aurelius Antoninus", aurelius, LocalDate.of(1843, 9, 16), 500);
        Books theIliad = new Books("Divine Comedy", homer, LocalDate.of(2, 8, 18), 350);
        Books sherlock = new Books("The Adventures of Sherlock Holmes", doyle, LocalDate.of(1892, 10, 14), 500);

        books.add(divineComedy);
        books.add(theCountOfMonteCristo);
        books.add(eugeneOnegin);
        books.add(murderOnTheOrientExpress);
        books.add(fairyTales);
        books.add(paradiseLost);
        books.add(lempireDesAnges);
        books.add(theThoughts);
        books.add(theIliad);
        books.add(sherlock);
    }

    public static ArrayList<Books> books() {
        return books;

    }


}
