import java.util.*;

public class Library {
    Set<Book> books;
    public Library() {
        this.books = new HashSet<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBookByIsnb(String isnb)  {
        for (Book deleteBookInList : books) {
            if (deleteBookInList.getIsnb().equals(isnb)) {
                books.remove(deleteBookInList);
                break;
            }
            else {
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
            }
            else {
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
        for (Book findBookBySearch: books) {
            if(findBookBySearch.getTitle().contains(search)){
                findBookBySearch.displayInfo();
                break;
            }
            else if (findBookBySearch.getAuthor().contains(search)) {
                findBookBySearch.displayInfo();
                break;
            }
            else {
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

    public Book findBookByGenre(Genre genre){
        for(Book searchBookByGenre: books){
            if (searchBookByGenre.getGenre().equals(genre)) {
                searchBookByGenre.displayInfo();
                break;
            }
        }
        return null;
    }



}

