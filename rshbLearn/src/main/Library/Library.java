import java.util.*;
import java.util.stream.Collectors;


public class Library {
    Set<Book> books;

    public Library() {
        this.books = new HashSet<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBookByIsnb(String isnb) {
        for (Book deleteBookInList : books) {
            if (deleteBookInList.getIsnb().equals(isnb)) {
                books.remove(deleteBookInList);
            }
        }
        try {
            throw new BookNotFoundException();
        } catch (BookNotFoundException e) {
            System.out.println("Данного ISNB не обнаружено в библиотеке");
        }
    }

    public void displayAllBook() {
        for (Book showAllBookInList : books) {
            showAllBookInList.displayInfo();
        }
    }

    public Book findBookById(String isnb) {
        for (Book findBookByIsnb : books) {
            if (findBookByIsnb.getIsnb().equals(isnb)) {
                findBookByIsnb.displayInfo();
                return findBookByIsnb;
            }
        }
        try {
            throw new BookNotFoundException();
        } catch (BookNotFoundException e) {
            System.out.println("Данного ISNB не обнаружено в библиотеке");
        }
        return null;
    }

    public Book findBookBySearchTitle(String searchTitle) { //(fixed) раздели этот метод на два, один по части названия, второй по части автора, а то
        for (Book findBook : books) {
            if (findBook.getTitle().contains(searchTitle)) {
                findBook.displayInfo();
                return findBook;
            }
        }
        try {
            throw new BookNotFoundException();
        } catch (BookNotFoundException e) {
            System.out.println("Данной книги не обнаружено в библиотеке");
        }

        return null;
    }

    public Book findBookBySearchAuthor(String searchAuthor) {
        for (Book findBookBySearchAuthor : books) {
            if (findBookBySearchAuthor.getAuthor().contains(searchAuthor)) {
                findBookBySearchAuthor.displayInfo();
                return findBookBySearchAuthor;
            }
        }
        try {
            throw new BookNotFoundException();
        } catch (BookNotFoundException e) {
            System.out.println("Данной книги не обнаружено в библиотеке");
        }

        return null;
    }

    public Book findBookByGenre(Genre genreFind) {
        for (Book searchBookByGenre : books) {
            if (searchBookByGenre.getGenre().equals(genreFind)) {
                searchBookByGenre.displayInfo();
                break;
            }
        }

        return null;
    }

    //Проба StreamAPI

    public void findBookByAuthorWithApi(String author) {
        books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList())
                .forEach(Book::displayInfo);
    }

    public void sortBookByTitleWithApi() {
        books.stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList())
                .forEach(Book::displayInfo);
    }
}

