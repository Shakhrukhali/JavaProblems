package OOPInJava.OOP;

public class Book {
    public String title;
    public String autor;
    public int pageCount;

    public void print() {
        System.out.printf("Kitob nomi: %s%nKitob Autori: %s%nKitobning sahifalar soni: %d%n", title, autor, pageCount);
    }
}
