
import java.util.Arrays;
import java.util.List; 

public class Book {
    private String title;
    private String author;
    private int year;
    private double rating;

    public Book(String title, String author, int year, double rating) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = rating;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public double getRating() { return rating; }

    @Override
    public String toString() {
        return title + " (" + author + ", " + year + ") ★" + rating;
    }
    
    public static void main(String[] args){
        List<Book> books = Arrays.asList(
            new Book("Pan Tadeusz", "Adam Mickiewicz", 1834, 4.5),
            new Book("Lalka", "Bolesław Prus", 1890, 4.8),
            new Book("Wiedźmin", "Andrzej Sapkowski", 1990, 4.7),
            new Book("Dziady", "Adam Mickiewicz", 1823, 4.3)
        );
    }
}
