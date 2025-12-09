public class LibraryTest {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("Война и мир", "Толстой", "1111-1111"));
        library.addBook(new Book("Отцы и дети", "Тургенев", "2222-2222"));
        library.addBook(new Book("Дагон", "Лавкрафт", "3333-3333"));
        library.displayAllBook();
        library.findBookById("2222-2222");
        library.removeBookByIsnb("2222-2222");
        library.displayAllBook();


    }
}
