package Library;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created By Arshak on Dec, 2020
 */
public class LibraryTestAPI {

    public static ArrayList<String> getAllAuthors() {
        ArrayList<String> allAuthors = new ArrayList<>();
        ArrayList<Books> books = AuthorsAndBooksDB.books();
        for (int i = 0; i < books.size(); i++) {
            Author author = books.get(i).getAuthor();
            allAuthors.add(author.getName_lastName());
        }
        return allAuthors;
    }

    public static HashSet<String> getAllAuthorsNationality() {
        HashSet<String> allAuthors = new HashSet<>();
        ArrayList<Books> books = AuthorsAndBooksDB.books();
        for (int i = 0; i < books.size(); i++) {
            Author author = books.get(i).getAuthor();
            allAuthors.add(author.getNatonality());
        }
        return allAuthors;
    }

    public static ArrayList<String> getAllBooks() {
        ArrayList<String> allBooks = new ArrayList<>();
        ArrayList<Books> books = AuthorsAndBooksDB.books();
        for (int i = 0; i < books.size(); i++) {
            Books book = books.get(i);
            allBooks.add(book.getTitle());

        }
        return allBooks;
    }

    public static void givenAuthor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of author");
        String x = input.nextLine();
        ArrayList<Books> books = AuthorsAndBooksDB.books();
        for (int i = 0; i < books.size(); i++) {
            Author author = books.get(i).getAuthor();
            String consoleName = author.getName_lastName();
            if (x.equals(consoleName)) {
                String y = books.get(i).getTitle();
                System.out.println(y);
            }

        }
    }

    public static void matchingStrAuthor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the letters which you think are presence in author's name");
        String x = input.nextLine();
        ArrayList<Books> books = AuthorsAndBooksDB.books();
        for (int i = 0; i < books.size(); i++) {
            Author author = books.get(i).getAuthor();
            String consoleName = author.getName_lastName();
            String lowerCaseX = x.toLowerCase();
            String lowerCaseAuthorName = consoleName.toLowerCase();
            if (lowerCaseAuthorName.contains(lowerCaseX)) {
                System.out.println(consoleName);
                break;
            } else System.out.println("Not matching");

        }
    }

    public static void matchingStrBook() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the letters which you think are presence in book's name");
        String x = input.nextLine();
        ArrayList<Books> books = AuthorsAndBooksDB.books();
        for (int i = 0; i < books.size(); i++) {
            Books book = books.get(i);
            String consoleName = book.getTitle();
            String lowerCaseX = x.toLowerCase();
            String lowerCaseBookName = consoleName.toLowerCase();
            if (lowerCaseBookName.contains(lowerCaseX)) {
                System.out.println(consoleName);
                break;
            } else System.out.println("Not matching");
        }
    }

    public static void findByPrice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the maximal price");
        double x = input.nextInt();
        ArrayList<Books> books = AuthorsAndBooksDB.books();
        for (int i = 0; i < books.size(); i++) {
            Books book = books.get(i);
            double bookPrice = book.getPrice();
            if (bookPrice <= x) {
                System.out.println(book.getTitle() + book.getAuthor().getName_lastName() +"price is " + " " + book.getPrice());
            }
        }
    }
// Stex chjogeki vonc Date tipi input tam scaneri hamar, bayc kavelacnem ampayman )))))))))


//    public static void findByDateRange(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the maximal price");
//        Date x = input.();
//
//    }
}
