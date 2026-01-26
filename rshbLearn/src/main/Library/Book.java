import java.util.Objects;

public class Book { //fixed) зачем тут Comparable?

    private String title;
    //(fixed) между одиночными обьявлениями полей класса ставим пустую строку, ниже сделал, как надо
    private String author;

    private String isnb;

    private Genre genre;

    public static int bookCount = 0;

    public Book(String title, String author, String isnb, Genre genre) {
        this.title = title;
        this.author = author;
        this.isnb = isnb;
        this.genre = genre;

        ++bookCount; // (fixed) тут можно просто  bookCount++;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsnb() {
        return isnb;
    }

    public Genre getGenre() {
        return genre;
    }

    public void getBookCount() {
        System.out.println("Книг добавлено в количестве " + bookCount + " шт");
    }

    public void displayInfo() {
        System.out.println("Книга: " + title + ", Автор: " + author + ", Isnb: " + isnb + ", Жанр: " + genre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(isnb, book.isnb) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isnb);
    }
}