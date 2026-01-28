import javax.print.DocPrintJob;

public class LibraryTest {

    public static void main(String[] args) {

        Library library = new Library();

        //добавление книг
        library.addBook(new Book("Война и мир", "Толстой", "1111-1111", EGenre.DRAMA));
        library.addBook(new Book("Отцы и дети", "Тургенев", "2222-2222", EGenre.FANTASY));
        library.addBook(new Book("Дагон", "Лавкрафт", "3333-3333", EGenre.HORROR));
        library.addBook(new Book("Дагон", "Лавкрафт", "3333-3333", EGenre.HORROR));
        library.addBook(new Book("Война и мир","Толстой", "4444-4444", EGenre.DRAMA));

        //вывод книг
        library.displayAllBook();

        /* library.findBookById("2222-2222");
        library.removeBookByIsnb("2222-2222");
        library.displayAllBook(); */

        //добвленные методы во втором задании
        library.findBookBySearchAuthor("Толст");
        library.findBookBySearchTitle("Войн");
        library.findBookByGenre(EGenre.HORROR);

        //счетчик
        Book b1 = new Book("Буратино", "Толстой", "4444-4444", EGenre.HORROR);
        b1.getBookCount();

        //методы с потоком
        library.findBookByAuthorWithApi("Толстой");

        library.sortBookByTitleWithApi();
    }
}
//test