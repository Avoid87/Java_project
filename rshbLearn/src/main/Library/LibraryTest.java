import java.util.Scanner;

public class LibraryTest {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("Война и мир", "Толстой", "1111-1111", Genre.DRAMA));
        library.addBook(new Book("Отцы и дети", "Тургенев", "2222-2222", Genre.FANTASY));
        library.addBook(new Book("Дагон", "Лавкрафт", "3333-3333", Genre.HORROR));
        library.addBook(new Book("Дагон", "Лавкрафт", "3333-3333", Genre.HORROR));
        library.displayAllBook();
        library.findBookById("2222-2222");
        library.removeBookByIsnb("2222-2222");
        library.displayAllBook();
        library.findBookBySearch("Толст");
        library.findBookByGenre(Genre.HORROR);

        Book b1 = new Book("Буратино", "Толстой", "4444-4444", Genre.HORROR);
        b1.getBookCount();
    }
}
