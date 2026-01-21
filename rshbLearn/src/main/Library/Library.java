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

    public Book findBookBySearch(String search) { //раздели этот метод на два, один по части названия, второй по части автора, а то
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
        for (Book search : books1 //тут скобка уехала, ctrl+alt+L для форматирования можно и даже нужно жать
        ) {
            search.displayInfo();
        }
    }

    public void sortBookByTitleWithApi() {
        List<Book> books1 = books.stream() //используй читаемые названия и избегай books1 и тд
                .sorted() //здесь не понятно, по какому полю сортировка идет
                .collect(Collectors.toList());
        for (Book sort : books1 //тут скобка уехала, ctrl+alt+L для форматирования можно и даже нужно жать
        ) {
            sort.displayInfo();
        }
    }

    //смотри, для всех методов, где работаешь со стримами, можно сделать примерно так:

//    public List<Book> sortBooksByTitle() { здесь у тебя будет возвращаемый тип сразу список книг
//        return books.stream() тут соответственно сразу возвращаешь свой список books сразу, без создания нового
//                .sorted(Comparator.comparing(Book::getTitle)) вот тут уже сортировка по полю title, почитай про ::
//                .collect(Collectors.toList()); тут стандартно
//    }

//пустоты вот такой тоже избегай
}

//и такой