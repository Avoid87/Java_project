import java.util.ArrayList;
import java.util.List;

public class Library {

    List <Book> books = new ArrayList<>();

    public Library() {
    }

    void addBook(Book book){
        books.add(book);
    }
    void removeBookByIsnb(String isnb){
        for (Book del: books) {
            if (del.getId() == isnb){
                books.remove(del);
                break;
            }
        }
    }
    void displayAllBook(){
        for (Book show: books) {
            show.displayInfo();
        }

    }
    Book findBookById(String isnb){
       for (Book findIsnb : books) {
            if (findIsnb.getId() == isnb){
                findIsnb.displayInfo();
                break;
            }
            }
        return null;
        }

}

