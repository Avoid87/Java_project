import java.util.*;
import java.util.stream.Collectors;

public class Library {
    Set<Book> books;

    public Library() {
        this.books = new HashSet<>();
    }
    //test
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBookByIsnb(String isnb) {
        for (Book deleteBookInList : books) {
            if (deleteBookInList.getIsnb().equals(isnb)) {
                books.remove(deleteBookInList);
                break;
            } else {
                try {
                    throw new BookNotFoundException();
                } catch (BookNotFoundException e) {
                    System.out.println("Данного ISNB не обнаружено в библиотеке");
                }
                break;
            }
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
                break;
            } else {
                try {
                    throw new BookNotFoundException();
                } catch (BookNotFoundException e) {
                    System.out.println("Данного ISNB не обнаружено в библиотеке");
                }
                break;
            }
        }
        return null;
    }

    public Book findBookBySearch(String search) {
        for (Book findBookBySearch : books) {
            if (findBookBySearch.getTitle().contains(search)) {
                findBookBySearch.displayInfo();
                break;
            } else if (findBookBySearch.getAuthor().contains(search)) {
                findBookBySearch.displayInfo();
                break;
            } else {
                try {
                    throw new BookNotFoundException();
                } catch (BookNotFoundException e) {
                    System.out.println("Данной книги не обнаружено в библиотеке");
                }
                break;
            }
        }
        return null;
    }

    public Book findBookByGenre(Genre genre) {
        for (Book searchBookByGenre : books) {
            if (searchBookByGenre.getGenre().equals(genre)) {
                searchBookByGenre.displayInfo();
                break;
            }
        }
        return null;
    }

    //Проба StreamAPI

    public void findBookByAuthorWithApi(String author) {
        List<Book> books1 = books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
        for (Book search : books1
        ) {
            search.displayInfo();
        }
    }

    public void sortBookByTitleWithApi() {
        List<Book> books1 = books.stream()
                .sorted()
                .collect(Collectors.toList());
        for (Book sort : books1
        ) {
            sort.displayInfo();
        }
    }


}

