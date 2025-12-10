import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String isnb;
    private Genre genre;

    public static int bookCount = 0;


    public Book(String title, String author, String isnb, Genre genre) {
        this.title = title;
        this.author = author;
        this.isnb = isnb;
        this.genre = genre;

        bookCount = ++ bookCount;
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
    public Genre getGenre(){
        return genre;
    }

    public void getBookCount(){
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
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(isnb, book.isnb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, isnb);
    }

}
