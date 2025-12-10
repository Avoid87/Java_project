import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBookByIsnb(String isnb) {
        for (Book deleteBookInList : books) {
            if (deleteBookInList.getIsnb().equals(isnb)){
                books.remove(deleteBookInList);
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
        }
        return null;
    }

}

