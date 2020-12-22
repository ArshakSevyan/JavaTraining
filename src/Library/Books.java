package Library;

import java.time.LocalDate;

/**
 * Created By Arshak on Dec, 2020
 */
public class Books {
    private  Author author;
    private String title;
    private LocalDate releaseDate;
    private double price;

    public Books(String title,Author author,LocalDate releaseDate,double price){
        setAuthor(author);
        setTitle(title);
        setReleaseDate(releaseDate);
        setPrice(price);
    }

    public Author getAuthor() {
        return author;
    }

    private void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }


    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    private void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return String.format("Title: %s, Author is:%s,Realise Date is %t,Price: %f",getTitle(),getAuthor(),getReleaseDate(),getPrice());
    }
}
